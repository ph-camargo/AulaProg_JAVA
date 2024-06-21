package exercicios08_03;

import java.util.Scanner;

public class Exemplo1_else_if {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite uma nota: ");
        int nota1 = ler.nextInt();
        if(nota1>=0 && nota1<=10){
            System.out.println("Nota valida. ");
        }
        else{
            System.out.println("Nota invalida");
        }
    }
}
