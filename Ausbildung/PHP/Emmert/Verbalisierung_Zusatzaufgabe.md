Aufgabe 5 Verbalisierung des Struktogramms

Rechteck mit ANFANG  
darunter  
Rechteck mit int option = 0  
darunter  
Zwei verschachtelte Rechtecke, kleines Rechteck oben rechts  
    Im kleinen Rechteck:  
        Rechteck mit Ausgabe: "Wähle 1, 2 oder 3: "  
        darunter  
        Rechteck mit Eingabe: option  
        darunter  
        Rechteck mit Dreieck, Spitze nach unten  
            Im Dreieck:  
                option < 1 || option > 3  
        Links vom Dreieck (Ja):  
            Rechteck mit Ausgabe: 
        "Ungültige Eingabe"  
        Rechts vom Dreieck (Nein):  
            Rechteck mit NOP  
    Im großen Rechteck:  
        Solange bis option >= 1 && bis option <= 3  
darunter  
Rechteck mit Linie von linker oberer Ecke zur rechten Seite  
    In dem Dreieck: option  
    darunter drei Spalten  
        Spalte 1: option == 1  
            Zwei verschachtelte Rechtecke, kleines Rechteck unten rechts  
                Im großen Rechteck:  
                    für i von 1 bis 10, Schrittweite 1  
                Im klinen Rechteck:  
                    Ausgabe: "*" ohne Zeilenumbruch  
        Spalte 2: option == 2  
            Zwei verschachtelte Rechtecke, kleines Rechteck unten rechts  
                Im großen Rechteck:  
                    für i von 1 bis 10, Schrittweite 1  
                Im kleinen Rechteck:  
                    Ausgabe: "*" mit Zeilenumbruch  
        Spalte 3: option == 3  
            Zwei verschachtelte Rechtecke, kleines REchteck unten rechts  
                im großen Rechteck:  
                    für i von 10 bis 1, Schrittweite -1  
                Im kleinen Rechteck:  
                    Zwei verschachtelte Rechtecke, kleines Rechteck unten rechts  
                        Im großen Rechteck:  
                            für n von 1 bis i, Schrittweite 1  
                        Im kleinen Rechteck:  
                            Ausgabe: "*" ohne Zeilenumbruch  
                    darunter  
                    Rechteck mit Ausgabe: Zeilenumbruch  
darunter  
Rechteck mit ENDE