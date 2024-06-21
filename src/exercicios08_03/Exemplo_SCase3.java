package exercicios08_03;

import java.util.Scanner;

public class Exemplo_SCase3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite seu perfil: ");
        String perfil= ler.next();
        switch (perfil){
            case "admin" -> System.out.println("Usuario administrador ");
            case "usuario" -> System.out.println("Usuario padrão  ");
            case "default" -> System.out.println("Visitante ");
        }
    }
}
