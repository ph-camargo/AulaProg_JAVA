package aula10.ExemploExceção;

public class Teste1 {
    public static void main(String[] args) {
        Exemplo2 e1 = new Exemplo2();
        try{
            e1.divide(5,0);
        }
        catch (ArithmeticException e){
            System.out.println("Não foi possiel dividir");
        }
    }
}
