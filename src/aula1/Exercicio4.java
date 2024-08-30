package aula1;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite a quantidade em metros: ");
        Float metros = ler.nextFloat();
        Float cm = (metros*100);
        System.out.println("A quantidade em centimetros é: "+cm);
    }
}
