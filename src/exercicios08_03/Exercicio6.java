package exercicios08_03;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int numero1 = ler.nextInt();
        System.out.print("Digite o segudno numero: ");
        int numero2 = ler.nextInt();
        if (numero1 > numero2){
            System.out.println(numero1+" é maior que "+numero2);
        }
        else if (numero1 == numero2){
            System.out.println("os dois numeros são iguais. ");
        }
        else {
            System.out.println(numero2+" é maior que "+numero1);
        }
    }
}
