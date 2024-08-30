//Ler dois vetores, A e B com um número variável de conteúdo (números) (no máximo 10).
// O programa deve solicitar antes da leitura dos vetores a quantidade de dados a serem lidos (1 a 10),
// os dois vetores terão o mesmo número de elementos. Gerar um terceiro vetor chamado Soma
// (de no máximo 10 elementos) que seja a soma dos dados do vetor A com os do vetor B.

package aula3;

import java.util.Scanner;

public class Exercicio1_vetor {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a quantidade de numeros que os vetores devem possuir (entre 1 e 10): ");
        int quant = ler.nextInt();
        if(quant<=0 || quant>=11){
            System.out.print("Este numero é invalido.");
        }
        else{
            int[] vetorA = new int[quant];
            int[] vetorB = new int[quant];
            int[] soma = new int[quant];
            System.out.println("Lendo dados  para o vetor A");
            for(int i=0; i<quant; i++){
                System.out.print("vetor["+i+"]: ");
                vetorA[i] = ler.nextInt();
            }
            System.out.println("\nLendo dados para o vetor B");
            for(int i=0; i<quant; i++){
                System.out.print("vetor["+i+"]: ");
                vetorB[i] = ler.nextInt();
            }
            System.out.println("\nsomando e mostrando o vetor...");
            for(int i=0; i<quant; i++){
                soma[i] = vetorA[i] +  vetorB[i];
                System.out.println(vetorA[i]+" + "+vetorB[i]+" = "+soma[i]);
            }
        }
    }
}
