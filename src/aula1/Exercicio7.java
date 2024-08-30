package aula1;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite sua altura: ");
        Float altura = ler.nextFloat();
        System.out.print("Digite seu peso: ");
        Float peso = ler.nextFloat();
        Float IMC = (peso/(altura*altura));
        System.out.println("Seu IMC é: "+IMC);
    }
}
