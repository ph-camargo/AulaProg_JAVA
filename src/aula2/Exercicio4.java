package aula2;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = ler.nextInt();
        if (numero%2==0){
            System.out.println("Este numero é par. ");
        }
        else {
            System.out.println("Este numero é impar. ");
        }
    }
}
