package aula10.ExemploExceção;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo1 {
    public static int leNumero(String mensagem){
        Scanner ler = new Scanner(System.in);
        int num=0;
        boolean correto;
        do{
            try{
                System.out.println(mensagem);
                num = ler.nextInt();
                correto = true;
            }
            catch (InputMismatchException e){
                correto = false;
                ler.next();
                System.out.println("Valor invalido! ");
            }
        }
        while(!correto);
        return num;
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1 = leNumero("Digite um valor para n1: ");
        int n2 = leNumero("Digite um valor para n2: ");
        try{
            int resposta = n1 / n2;
            System.out.println(resposta);
        }
        catch (InputMismatchException erro){
            System.out.println("os valores precisam ser numeros...");
        }
        catch (ArithmeticException erro){
            System.out.println("não é possivel dividir por zero...");
        }
    }
}
