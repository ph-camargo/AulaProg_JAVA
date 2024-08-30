package aula8.exemploHerança;

import aula8.exemploHerança.Engenheiro;
import aula8.exemploHerança.Motorista;

public class Principal {
    public static void main(String[] args) {
        Motorista m1 = new Motorista("Simas", "Turbo", 1903);

        Engenheiro e1 = new Engenheiro("Paulo", "Brificado", 1289, "488816113");
    }
}