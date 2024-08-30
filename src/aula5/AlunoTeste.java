package aula5;

import java.util.Scanner;

public class AlunoTeste {
    public static void main(String[] args) {

        float nota1,nota2;

        Scanner ler = new Scanner(System.in);

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Pedro";
        aluno1.sobrenome = "Camargo";
        aluno1.eMail = "Pedro@gmail.com";
        aluno1.codigo = 69;

        System.out.println("Qual o valor da primeira nota? ");
        nota1 = ler.nextFloat();
        System.out.println("Qual o valor da segunda nota? ");
        nota2 = ler.nextFloat();

        aluno1.nota1 = nota1;
        aluno1.nota2 = nota2;

        System.out.println("O aluno "+aluno1.nome+" "+aluno1.sobrenome+" "+aluno1.verificaNota());
    }
}
