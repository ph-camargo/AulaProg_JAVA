package exerciciosss21_06.exemploEncapsulamento;

import java.util.Scanner;

public class InfoPessoa {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa: ");
        String nome = ler.next();
        System.out.println("Digite o sobrenome da pessoa");
        String sobrenome = ler.next();
        Pessoa p1 = new Pessoa(nome, sobrenome);
        System.out.print("O nome da pessoa é: "+p1.getNome()+" "+p1.getSobrenome());
    }
}
