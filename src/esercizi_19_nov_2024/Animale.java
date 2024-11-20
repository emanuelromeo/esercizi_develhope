package esercizi_19_nov_2024;

public class Animale {

    private String nome, specie, verso;

    public Animale(String nome, String specie, String verso) {
        this.nome = nome;
        this.specie = specie;
        this.verso = verso;
    }

    public String getNome() {
        return nome;
    }

    public String emettiVerso() {
        return verso;
    }

}
