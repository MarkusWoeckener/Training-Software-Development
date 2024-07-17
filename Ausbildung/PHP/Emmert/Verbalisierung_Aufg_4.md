Aufgabe 4 Verbalisierung des Struktogramms

Rechteck mit ANFANG
darunter
Rechteck mit int zahl = 0
darunter
Zwei verschachtelte Rechtecke, kleines Rechteck oben rechts
    Im kleinen Rechteck:
        Rechteck mit Ausgabe: "Geben Sie eine Zahl ein: "
        darunter
        Rechteck mit Eingabe: zahl
        darunter
        Rechteck mit Dreieck, Spitze nach unten
            Im Dreieck: zahl != 1 && zahl != 2
        Links vom Dreieck (Ja):
            Rechteck mit Ausgabe: "Ungültige Eingabe"
        Rechts vom Dreieck: (Nein):
            Rechteck mit NOP
    Im großen Rechteck:
        Solange zahl != 1 && zahl != 2
darunter
Rechteck mit Linie von linker oberer Ecke zur rechten Seite
    In dem Dreieck: zahl
    darunter zwei Spalten
        Linke Spalte zahl == 1:
            Rechteck mit Ausgabe: "Sie haben 1 gewählt"
        Rechte Spalte zahl == 2:
            Rechteck mit Ausgabe: "Sie haben 2 gewählt"
darunter
Rechteck mit ENDE