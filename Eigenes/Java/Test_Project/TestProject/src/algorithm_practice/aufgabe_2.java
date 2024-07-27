/*
Erstellen Sie ein Programm, welches den Nutzer auffordert eine Zahl einzugeben.
Wird keine 1 oder 2 eingetippt, erscheint eine Fehlermeldung. Ist die Eingabe
hingegeben richtig, erscheint entweder die Ausgabe „Sie haben 1 gewählt“ oder
entsprechend „Sie haben 2 gewählt“.
Mit fußsteuerter Schleife.

Pseudocode:
Anfang
int zahl = 0
Wiederhole
    Ausgabe: "Geben Sie eine Zahl ein: "
    Eingabe: zahl
    Wenn zahl != 1 && zahl != 2
        Ausgabe: "Ungüültige Eingabe"
    Ende Wenn
solange zahl != 1 && zahl != 2
Ende Wiederhole
Fallunterscheidung für zahl
    zahl == 1
        Ausgabe: "Sie haben 1 gewählt"
    Ende Fall 1
    zahl == 2
        Ausgabe: "Sie haben 2 gewählt"
    Ende Fall 2
Ende Fallunterscheidung
Ende
*/

package algorithm_practice;

public class aufgabe_2 {
    public static void main(String[] args) {
        int zahl = 0;
        do{
            System.out.print("Geböen Sie eine Zahl ein: ");
            zahl = Integer.parseInt(System.console().readLine());
            if(zahl != 1 && zahl != 2){
                System.out.println("Ungültige Eingabe, bitte 1 oder 2 wählen.");
            }
        }
        while(zahl != 1 && zahl != 2);
        switch(zahl){
            case 1:
                System.out.println("Sie haben 1 gewählt");
                break;
            case 2:
                System.out.println("Sie haben 2 gewählt");
                break;
        }
    }
}
