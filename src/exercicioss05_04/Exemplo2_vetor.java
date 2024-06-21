package exercicioss05_04;

public class Exemplo2_vetor {
    public static void main(String[] args){
        int[] vetor = new int[10];
        int tamanho = vetor.length;
        System.out.println("O tamanho do vetor é: "+tamanho);
        for(int i=0; i<vetor.length; i++){
            System.out.print(vetor[i]+" ");
        }
    }
}
