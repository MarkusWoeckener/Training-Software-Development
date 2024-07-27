/*
Erstellen Sie ein Programm, welches den Nutzer auffordert eine Zahl einzugeben.
Wird keine 1 oder 2 eingetippt, erscheint eine Fehlermeldung. Ist die Eingabe
hingegeben richtig, erscheint entweder die Ausgabe „Sie haben 1 gewählt“ oder
entsprechend „Sie haben 2 gewählt“.
Mit kopfgesteuerter Schleife.

Pseudocode:
int option = 0

Wiederhole solange option != 1 && option != 2
    Ausgabe: "Wählen Sie Option 1 oder 2 aus: "
    Eingabe: option
    Wenn option != 1 && option != 2
        Ausgabe: "Ungültige Eingabe"        
    Ende Wenn
Ende Wiederhole

Fallunterscheidung option
    option == 1
        Ausgabe: "Sie haben 1 gewählt"
    option == 2
        Ausgabe: "Sie haben 2 gewählt"
Ende Fallunterscheidung
Ende
*/

package algorithm_practice;

public class aufgabe_1 {
    public static void main(String[] args) {
        int option = 0;
        while(option != 1 && option != 2){
            System.out.print("Wählen Sie Option 1 oder 2: ");
            option = Integer.parseInt(System.console().readLine());
            if(option != 1 && option != 2){
                System.out.println("Ungültige Eingabe");
            }
        }
        switch(option){
            case 1:
                System.out.println("Sie haben 1 gewählt");
                break;
            case 2:
                System.out.println("Sie haben 2 gewählt");
                break;
        }
    }
}
