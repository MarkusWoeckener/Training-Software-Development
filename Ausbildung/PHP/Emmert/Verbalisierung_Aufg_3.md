Aufgabe 3 Verbalisierung des Struktogramms:

Rechteck mit ANFANG
darunter
Rechteck mit int option = 0
darunter
Zwei verschachtelte Rechtecke, kleines Rechteck rechts unten
    Im großen Rechteck:
        Solange option != 1 && option != 2
    Im kleinen Rechteck:
        Rechteck: Ausgabe: "Wählen Sie Option 1 oder 2: "
        darunter
        Rechteck: Eingabe: option
        daunter
        Rechteck mit Dreieck, Spitze nach unten
            Im Dreieck: option != 1 && option != 2
        links vom Dreieck (Ja):
            Rechteck: Ausgabe: "Ungültige Eingabe"
        rechts vom Dreieck (Nein):
            Rechteck: NOP
darunter
Rechteck mit Line von linker oberer Ecke zur rechten Seite.
    In dem Dreieck: option
    darunter zwei Spalten
    Linke Spalte option == 1:
        Rechteck mit Ausgabe: "Sie haben 1 gewählt"
    Rehte Spalte option == 2:
        Rechteck mit Ausgabe: "Sie haben 2 gewählt"
darunter
Rechteck mit ENDE