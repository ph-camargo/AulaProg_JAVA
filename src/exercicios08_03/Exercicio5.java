package exercicios08_03;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um numero entre 10 e 15: ");
        int numero = ler.nextInt();
        if (numero>=10 && numero<=15) {
            System.out.println("O numero esta entre 10 e 15. ");
        }
        else {
            System.out.println("O numero não esta entre 10 e 15. ");
        }
    }
}
