package exercicioss17_05;

import exercicioss17_05.Pessoa;

public class Teste {
    public static void main(String[] args) {
        Pessoa pessoaUm = new Pessoa();
        pessoaUm.nome = "Ana";
        pessoaUm.sobrenome = "Silva";
        pessoaUm.dataNascimento = "25/05/2000";
        pessoaUm.altura = 170;

        Pessoa pessoaDois = new Pessoa();
        pessoaDois.nome = "João";
        pessoaDois.sobrenome = "Souza";
        pessoaDois.dataNascimento = "10/03/1999";
        pessoaDois.altura = 180;

        System.out.println("Nome completo da pessoa um: "+pessoaUm.nome+" "+pessoaUm.sobrenome);

        pessoaUm.andar();
        pessoaDois.correr();
        pessoaDois.falar();
    }
}
