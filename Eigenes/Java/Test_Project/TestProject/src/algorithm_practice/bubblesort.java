/*
Anfang
    int[] array = neues Array mit 10 zufälligen Zahlen zwischen 1 und 100
    bool sortiert = false
    Wiederhole solange sortiert = false
        sortiert = true
        Für i von 0 bis Länge(array) - 2
            Wenn array[i] > array[i + 1]
                Tausche array[i] und array[i + 1]
                sortiert = false
            Ende Wenn
        Ende Für
    Ende Wiederhole
    Ausgabe: array
Ende
*/

package algorithm_practice;

public class bubblesort {
    public static void main(String[] args) {
        //Variablendeklaration
        int[] array = new int[10];
        boolean sortiert = false;

        //array mit Zufallszahlen füllen
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 100) + 1;
        }

        //Bubblesort Algorithmus
        while(!sortiert){
            sortiert = true;
            for(int i = 0; i < array.length - 1; i++){
                if(array[i] > array[i + 1]){
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sortiert = false;
                }
            }
        }
        //Ausgabe sortiertes array
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
