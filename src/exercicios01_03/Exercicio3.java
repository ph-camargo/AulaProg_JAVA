//Faça uma classe Java que peça as 4 notas bimestrais e mostre a média

package exercicios01_03;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite sua primeira nota: ");
        Float nota1 = ler.nextFloat();
        System.out.print("Digite sua segunda nota: ");
        Float nota2 = ler.nextFloat();
        System.out.print("Digite sua terceira nota: ");
        Float nota3 = ler.nextFloat();
        System.out.print("Digite sua quarta nota: ");
        Float nota4 = ler.nextFloat();
        Float media = ((nota1+nota2+nota3+nota4)/4);
        System.out.println("Sua nota bimestral foi: "+media);
    }
}
