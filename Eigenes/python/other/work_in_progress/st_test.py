import streamlit as st
import datetime

st.title("Ein- Ausgaben Test")
st.subheader("Buchung eingeben")

datum:  datetime.date = st.date_input("Datum")
typ = st.selectbox("Art der Buchung", ("Einkommen", "Ausgabe"))
kategorie = st.selectbox("Kategorie", ("Lebensmittel", "Tanken", "Getränke", "Sonstiges"))
betrag = st.number_input("Betrag")

if st.button("Submit"):
    st.write(f"Hello {name}! You are {age} years old.")