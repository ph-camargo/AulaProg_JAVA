package exerciciosss21_06.exemploEncapsulamento;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Entre com o nome do titular: ");
        String titular = ler.next();
        System.out.println("Entre com o deposito inicial: ");
        Float valor = ler.nextFloat();
        Conta c1 = new Conta(titular, valor);
        System.out.println("Conta cadastrada obteve id: "+c1.getIdentificador());
    }
}
