import requests

response = requests.get("https://api.open-meteo.com/v1/forecast?latitude=52.3712&longitude=10.1313&hourly=global_tilted_irradiance,global_tilted_irradiance_instant&timezone=auto&forecast_days=1&tilt=5")

o = response.json()
hourly = o["hourly"]
areaOfModule = 1.2 * 0.8
print("Modulfläche:", areaOfModule, "m²")

t = hourly["time"]
sun = hourly["global_tilted_irradiance_instant"]
result = dict(zip(t, sun))
print(result)

#for t in hourly["time"]:
#    print(t)

#for result in hourly["global_tilted_irradiance_instant"]:
 #   print(round((result * areaOfModule)))