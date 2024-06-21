package exerciciosss14_06.exemploConstrutor;

public class Revendedor {
    public static void main(String[] args) {
        Carro c1 = new Carro("uno", "fiat");
        c1.modelo = "uno fire";
        c1.km = 150000;

        Carro c2 = new Carro();
        c2.montadora = "vw";
        c2.modelo = "fusca";
        c2.km = 200000;

        Carro[] estoque = new Carro[10];
    }
}
