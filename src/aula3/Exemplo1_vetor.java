package aula3;

import java.util.Scanner;

public class


Exemplo1_vetor {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        //Vetor de 10 elementos com indices de 0 a 9
        int[] vetor = new int [10];
        for(int i=0; i<10; i++){
            System.out.print("vetor["+i+"]: ");
            vetor [i] = ler.nextInt();
        }
        System.out.println("Dados no vetor....");
        for(int i=0; i<10; i++){
            System.out.print(vetor[i]+" ");
        }
    }
}
