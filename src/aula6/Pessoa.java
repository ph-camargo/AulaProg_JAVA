package aula6;

public class Pessoa {
    String nome;
    String sobrenome;
    int idade;
    float altura;

    void andar(){
        System.out.println(nome+" "+sobrenome+" está andando...");
    }
    void correr(){
        System.out.println(nome+" "+sobrenome+" está corrrendo...");
    }

    void parar(){
        System.out.println(nome+" "+sobrenome+" Está parado...");
    }
    void falar(){
        System.out.println(nome+" "+sobrenome+" está falando...");
    }

    String obterDados(){
        return "Nome: "+nome+" "+sobrenome+"\nIdade: "+idade+"\nAltura: "+altura;
    }
}
