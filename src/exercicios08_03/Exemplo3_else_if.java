package exercicios08_03;

import java.util.Scanner;

public class Exemplo3_else_if {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite seu perfil: ");
        String perfil = ler.next();

        if(perfil.equals("admin")){
            System.out.println("Administrador");
        }
        else if(perfil.equals("usuario")) {
            System.out.println("usuario");
        }
        else{
            System.out.println("visitante");
        }
    }
}
