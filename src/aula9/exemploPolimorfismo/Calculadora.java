package aula9.exemploPolimorfismo;

public class Calculadora {
    public static void main(String[] args) {
        Operacoes op = new Operacoes();
        System.out.println("Somando dois numeros: "+op.soma(5,6));
        System.out.println("Somando tres numeros: "+op.soma(5,6,7));
        System.out.println("Somando duas Strings: "+op.soma("Primeiro", "Rei"));
    }
}
