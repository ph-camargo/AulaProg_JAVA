package aula1;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Diigite a area do circulo: ");
        Float circulo = ler.nextFloat();
        Double area = Math.PI*circulo*circulo;
        System.out.println("A area do circulo é: "+area);
    }
}
