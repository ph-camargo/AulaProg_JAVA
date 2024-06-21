package exercicios08_03;

import java.util.Scanner;

public class Exemplo_SCase1 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um numero entre 1 e 7: ");
        int dia = ler.nextInt();
        switch (dia){
            case 1, 7:
                System.out.println("É o fim de semana! ");
                break;
            case 2, 3, 4, 5, 6:
                System.out.println("É dia util ");
                System.out.println("outra linha");
                break;
            default:
                System.out.println("Numero invalido");
        }
    }
}
