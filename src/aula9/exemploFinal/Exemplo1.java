package aula9.exemploFinal;

public class Exemplo1 {
    //Declarando uma variavel tipo FINAL
    final double numero;
    //Criando uma constante.
    //Acesso universal -> public
    //Existe independente da criação de instancia -> static
    //Não pode ser modificado -> final
    public static final double PI = 3.141592653589793;
    //Como não foi definido um valor no momento da declaração, este valor deverá ser
    //atribuído até o final do construtor.
    public Exemplo1(){
        numero=10;
    }
}