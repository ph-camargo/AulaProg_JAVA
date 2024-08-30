package aula1;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o primeiro numero inteiro: ");
        int num1 = ler.nextInt();
        System.out.print("Digite o segundo numero inteiro: ");
        int num2 = ler.nextInt();
        double a = Math.pow(num1,num2);
        int b = (num1*num2);
        float c = (1/(float)num1);
        float d = (num2+(num1/2));
        float e = (num1-num2);
        float f = (num1*(-1));
        System.out.println("O primeiro valor elevado ao segundo valor: "+a);
        System.out.println("O primeiro valor vezes o segundo valor: "+b);
        System.out.println("O número inverso do primeiro valor: "+c);
        System.out.println("A soma do segundo número com a metade do primeiro número: "+d);
        System.out.println("A diferença do primeiro número com o segundo: "+e);
        System.out.println("O número oposto ao primeiro valo: "+f);
    }
}
