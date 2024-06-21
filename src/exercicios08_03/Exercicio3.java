package exercicios08_03;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String senha = "Ph050606";
        System.out.print("Digite a senha: ");
        String senhaT = ler.next();
        if (senhaT.equals(senha)){
            System.out.println("Senha correta.");
        }
        else {
            System.out.println("Senha incorreta.");
        }
    }
}
