import streamlit as st
import datetime
import pandas as pd
import os

st.title("Ein- Ausgaben Test")
st.subheader("Buchung eingeben")

datum:  datetime.date = st.date_input("Datum")
typ: "str" = st.selectbox("Art der Buchung", ("Einkommen", "Ausgabe"))
kategorie: "str" = st.selectbox("Kategorie", ("Lebensmittel", "Tanken", "Getränke", "Sonstiges"))
betrag: float = st.number_input("Betrag")

def buchung_speichern(datum, typ, kategorie, betrag):
    data = {
        "Datum": [datum],
        "Art": [typ],
        "Kategorie": [kategorie],
        "Betrag": [betrag]
    }
    df = pd.DataFrame(data)
    
    if not os.path.exists("buchungen.csv"):
        df.to_csv("buchungen.csv", index=False)
    else:
        df.to_csv("buchungen.csv", mode="a", header=False, index=False)

if st.button("Abschicken"):
    if (typ == "Ausgabe" and betrag > 0):
        betrag = -betrag
    buchung_speichern(datum, typ, kategorie, betrag)
    st.success("Erfolgreich gespeichert")

if st.button("Buchungen anzeigen"):
    if os.path.exists("buchungen.csv"):
        display  = pd.read_csv("buchungen.csv")
        st.dataframe(display)
    else:
        st.warning("Keine Buchung vorhanden")