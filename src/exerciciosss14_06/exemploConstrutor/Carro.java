package exerciciosss14_06.exemploConstrutor;

public class Carro {
    String modelo;
    String montadora;
    String cor;
    int km;

    public Carro(){

    }

    public Carro(String modelo, String montadora){
        this.montadora = montadora;
        this.modelo = modelo;
    }
}
