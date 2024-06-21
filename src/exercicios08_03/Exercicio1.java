package exercicios08_03;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um mes do ano: ");
        String mes = ler.next();
        switch (mes){
            case "janeiro" -> System.out.println("mes 1 ");
            case "fevereivo" -> System.out.println("mes 2 ");
            case "março" -> System.out.println("mes 3 ");
            case "abril" -> System.out.println("mes 4 ");
            case "maio" -> System.out.println("mes 5 ");
            case "junho" -> System.out.println("mes 6 ");
            case "julho" -> System.out.println("mes 7 ");
            case "agosto" -> System.out.println("mes 8 ");
            case "setembro" -> System.out.println("mes 9 ");
            case "outubro" -> System.out.println("mes 10 ");
            case "novembro" -> System.out.println("mes 11 ");
            case "dezembro" -> System.out.println("mes 12 ");
            case "default" -> System.out.println("este mes é invalido");
        }
    }
}
