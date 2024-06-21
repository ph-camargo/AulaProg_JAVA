package exercicioss17_05;

public class Aluno {
    String nome;
    String sobrenome;
    String eMail;
    int codigo;
    float nota1;
    float nota2;

    float media(){
        return (nota2+nota1)/2;
    }

    String verificaNota(){
        if (media()>=8){
            return "aprovado";
        } else if (media()>=6 && media()<8) {
            return "recuperação";
        }
        else{
            return "reprovado";
        }
    }
}
