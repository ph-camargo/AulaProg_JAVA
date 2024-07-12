package aula10.ExemploArquivo;

import java.io.*;

public class GravarPessoa {
    public static void main(String[] args) {
        File caminho = new File("C:/Users/pedro/Documents/aula10");

        if(!caminho.exists()){
            System.out.println("Caminho não exsite, tentando criar...");
            caminho.mkdirs();
            System.out.println(" [OK] ");
        }

        File arquivo = new File(caminho,"pessoa.db");
        try {
            ObjectOutputStream objEscrita = new ObjectOutputStream(new FileOutputStream(arquivo.getAbsolutePath()));
            Pessoa p1 = new Pessoa();
            p1.setNome("Jonas");
            p1.setSobrenome("Silva");
            objEscrita.writeObject(p1);
            objEscrita.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado ou não pode ser criado!");
        }
        catch (IOException e){
            System.out.println("Erro ap ler o arquivo");
        }
    }
}
