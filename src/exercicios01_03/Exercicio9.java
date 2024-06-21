package exercicios01_03;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        Float num1 = ler.nextFloat();
        System.out.print("Digite o segundo numero: ");
        Float num2 = ler.nextFloat();
        Float soma = (num1 + num2);
        Float mult = (num1*num2);
        System.out.println("A soma dos numeros é "+soma +"e a multiplicção é "+mult);
    }
}
