package aula3;

public class Exemplo3_vetor {
    public static void main(String[] args) {
        //Vetor com 7 elementos e indices de 0 a 6
        int[] vetor = {1, 2, 3, 4, 6, 10};
        System.out.println("Dados no vetor...");
        for (int i : vetor) {
            System.out.print(i+" ");
        }
    }
}