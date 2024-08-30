package aula1;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Quanto voce ganha por hora? ");
        Float salario = ler.nextFloat();
        System.out.print("Quantas horas voce trabalhou neste mes? ");
        Float horas = ler.nextFloat();
        Float total = (salario*horas);
        System.out.println("O seu salario total foi: "+total);
    }
}
