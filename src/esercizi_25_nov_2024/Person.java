//Crea una classe base Person con i seguenti attributi e metodi:
//Attributi: String name, int age.
//Costruttore: inizializza name e age.
//Metodo: void displayInfo() che stampa nome ed età.

//Crea una classe derivata Student con:
//Attributo aggiuntivo: String university.
//Costruttore che richiama il costruttore di Person e inizializza university.
//Sovrascrivi il metodo displayInfo() per stampare anche l'università.
//Crea un oggetto Student e chiama il metodo displayInfo().

package esercizi_25_nov_2024;

public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Nome: " + name + "\nEtà: " + age);
    }
}
