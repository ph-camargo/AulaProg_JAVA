package exercicioss12_04;

import java.util.Scanner;

public class Exemplo1_matriz {
    public static void main(String[] args) {
        int [][] matriz = new int[4][3];
        Scanner ler = new Scanner(System.in);
        for(int l=0; l<4; l++){
            for(int c=0; c<3; c++){
                System.out.printf("Matriz[%d][%d]: ",l,c);
                matriz[l][c] = ler.nextInt();
            }
        }
        for (int l=0; l<3; l++){
            for (int c=0; c<3; c++){
                System.out.printf("%02d ", matriz[l][c]);
            }
            System.out.println();
        }
    }
}
