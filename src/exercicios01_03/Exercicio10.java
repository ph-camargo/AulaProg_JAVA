package exercicios01_03;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite a altura do seu quadrado: ");
        Float altura = ler.nextFloat();
        System.out.print("Digite o valor da base do seu quadrado: ");
        Float base = ler.nextFloat();
        Float area = (base*altura);
        Float peri = (base+base+altura+altura);
        System.out.println("A area do quadrado é "+area +" e o perimetro é "+peri);
    }
}


