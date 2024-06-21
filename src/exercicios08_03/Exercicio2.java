package exercicios08_03;

import java.util.Scanner;

//Faça um programa que leia o nome e a idade de 1 nadador e exiba na tela o nome da categoria a qual este nadador pertence. A categoria dos nadadores é dada pela seguinte tabela:
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = ler.next();
        System.out.print("Digite sua idade: ");
        int idade = ler.nextInt();
        if (idade>=5 && idade<=7){
            System.out.println("Infantil A");
        }
        else if(idade>=8 && idade <=10){
            System.out.println("Infantil B");
        }
        else if(idade>=11 && idade<=13){
            System.out.println("Juvenil A");
        }
        else if(idade>=14 && idade<=17){
            System.out.println("Juvenil B");
        }
        else if(idade>=18){
            System.out.println("maiores de 18 anos");
        }
    }
}
