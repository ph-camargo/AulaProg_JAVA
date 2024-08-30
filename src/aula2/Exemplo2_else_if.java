package aula2;

import java.util.Scanner;

public class Exemplo2_else_if {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digitte a idade: ");
        int idade = ler.nextInt();
        if(idade<0)
            System.out.println("Idade invalida");
        else if(idade<10)
            System.out.println("Infantil");
        else if(idade<23)
            System.out.println("Juvenil");
        else if(idade<65)
            System.out.println("Adulto");
        else
            System.out.println("Terceira Idade");
    }
}