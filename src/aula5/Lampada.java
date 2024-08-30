package aula5;

public class Lampada {
    String marca;
    String modelo;
    String cor;
    boolean estaligada;

    void ligada(){
        estaligada = true;
    }
    void desligada(){
        estaligada = false;
    }
    boolean Estaligada(){
        return estaligada;
    }
}
