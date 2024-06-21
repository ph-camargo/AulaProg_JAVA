package exercicios01_03;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        Float fah = ler.nextFloat();
        Float cel = (5 * (fah-32) / 9);
        System.out.println("A conversam para graus celcius da: "+cel);
    }
}
