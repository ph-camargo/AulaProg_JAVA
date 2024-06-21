package exerciciosss21_06.exemploAcessoDois;

import exerciciosss21_06.exemploAcesso.Pessoa;

public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        //o nome esta sem modificador na classe Pessoa, desta forma a classe
        //Principal nn tem acesso a ele;
        //p1.nome = "Jonas"
    }
}
