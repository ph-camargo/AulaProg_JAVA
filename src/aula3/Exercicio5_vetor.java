package aula3;

import java.util.Scanner;

public class Exercicio5_vetor {
    public static void main(String[] args){
        Scanner ler =  new Scanner(System.in);
        String[] nomes = {"Ana", "Paulo", "João", "Carlos", "Pedro", "Maria", "Rafael"};
        System.out.print("Qual nome devo pesquisar na lista: ");
        String nome = ler.next();
        boolean achei = false;
        for (int i=0; i<nomes.length; i++){
            if(nomes[i].equalsIgnoreCase(nome)){
                achei = true;
            }
        }
        if(achei){
            System.out.println(nome+" esta na lista");
        }
        else{
            System.out.println(nome+"não esta na lista");
        }
    }
}
