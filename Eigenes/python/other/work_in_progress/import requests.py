import requests
import matplotlib.pyplot as plt
import datetime

def fetch_irradiance_data(latitude, longitude, tilt=5, forecast_days=1, azimuth=0):
    """Fetches hourly solar irradiance data from the Open-Meteo API.

    Args:
        latitude (float): Latitude of the location.
        longitude (float): Longitude of the location.
        tilt (int, optional): Tilt angle of the solar panel. Defaults to 5.
        forecast_days (int, optional): Number of days for the forecast. Defaults to 7.
        azimuth (int, optional): Azimuth angle of the solar panel. Defaults to 0.

    Returns:
        dict: A dictionary containing hourly irradiance data.
    """
    url = f"https://api.open-meteo.com/v1/forecast?latitude={latitude}&longitude={longitude}&hourly=global_tilted_irradiance,global_tilted_irradiance_instant&timezone=auto&forecast_days={forecast_days}&tilt={tilt}&azimuth={azimuth}"
    response = requests.get(url)

    if response.status_code == 200:
        data = response.json()
        return data["hourly"]
    else:
        raise Exception(f"API request failed with status code: {response.status_code}")

def calculate_energy_output(irradiance_data, module_area, panel_efficiency=0.2):
    """Calculates the energy output of a solar panel.

    Args:
        irradiance_data (dict): Hourly irradiance data.
        module_area (float): Area of the solar panel in square meters.
        panel_efficiency (float, optional): Efficiency of the solar panel. Defaults to 0.2.

    Returns:
        list: A list of energy output values in kilowatt-hours (kWh).
    """
    energy_output = []
    for irradiance in irradiance_data["global_tilted_irradiance_instant"]:
        # Convert irradiance to kWh per hour
        energy = (irradiance * module_area * panel_efficiency)
        energy_output.append(energy)
    return energy_output

def visualize_forecast(timestamps, energy_output_panel1, energy_output_panel2):
    """Visualizes the hourly energy output forecast for two panels in one coordinate system.

    Args:
        timestamps (list): List of timestamps.
        energy_output_panel1 (list): List of energy output values for panel 1.
        energy_output_panel2 (list): List of energy output values for panel 2.
    """
    plt.figure(figsize=(12, 6))

    # Set dark mode theme (if available)
    #plt.style.use('dark_background')

    plt.plot(timestamps, energy_output_panel1, label="Panel 1 (Azimuth 0)")
    plt.plot(timestamps, energy_output_panel2, label="Panel 2 (Azimuth -90)")

    plt.xlabel("Time")
    plt.ylabel("Energy Output (W)")
    plt.title("Hourly Energy Output Forecast for Two Panels")
    plt.xticks(rotation=45)
    plt.gca().xaxis.set_major_locator(plt.MultipleLocator(0.042))
    plt.grid(True)
    plt.legend()
    plt.show()

if __name__ == "__main__":
    latitude = 52.3712
    longitude = 10.1313
    module_area = 1.7 * 1.1
    panel_efficiency = 0.20

    try:
        # Panel 1 (Azimuth 0)
        hourly_data_panel1 = fetch_irradiance_data(latitude, longitude, azimuth=0)
        energy_output_panel1 = calculate_energy_output(hourly_data_panel1, module_area, panel_efficiency)

        # Panel 2 (Azimuth -90)
        hourly_data_panel2 = fetch_irradiance_data(latitude, longitude, azimuth=-90)
        energy_output_panel2 = calculate_energy_output(hourly_data_panel2, module_area, panel_efficiency)

        # Convert timestamps to datetime objects
        timestamps = [datetime.datetime.strptime(t, "%Y-%m-%dT%H:%M") for t in hourly_data_panel1["time"]]

        # Print the hourly energy output forecast for each panel
        print("Hourly Energy Output Forecast (kWh) - Panel 1 (Azimuth 0):")
        for i, energy in enumerate(energy_output_panel1):
            print(f"{timestamps[i]}: {energy:.2f}")

        print("\nHourly Energy Output Forecast (kWh) - Panel 2 (Azimuth -90):")
        for i, energy in enumerate(energy_output_panel2):
            print(f"{timestamps[i]}: {energy:.2f}")

        # Visualize the forecast
        visualize_forecast(timestamps, energy_output_panel1, energy_output_panel2)
        #visualize_forecast(timestamps, energy_output_panel2)

    except Exception as e:
        print(f"Error: {e}")
