package exercicios01_03;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite a altura do triangulo: ");
        Float altura = ler.nextFloat();
        System.out.print("Digite o tamanho da base do triangulo: ");
        Float base = ler.nextFloat();
        Float area = ((altura*base)/2);
        System.out.println("A area do triangulo é: "+area);
    }
}
