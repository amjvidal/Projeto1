package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class leitorArquivo {
    HashMap<String, personagem> lerPersonagens(String caminho){
        HashMap<String, personagem> personagens = new HashMap<String, personagem>();

        File arquivo = new File(caminho);
        try{
            Scanner escaneador = new Scanner(arquivo);
            System.out.println("Lendo Personagens...");
            while (escaneador.hasNextLine()){
                String linha = escaneador.nextLine();
                if(linha.equalsIgnoreCase("personagem")){        
                    String id = escaneador.nextLine();
                    String nome = escaneador.nextLine();
                    int energia = Integer.parseInt(escaneador.nextLine());
                    personagem persona = new personagem(nome, energia);
                    personagens.put(id, persona);
                }
       
        }
        escaneador.close();
     }        catch (FileNotFoundException e){
            System.out.println("O Arquivo não foi encontrado no "+ caminho+ " Especificado.");

        }
    
    return personagens;
    }

    HashMap<String, capitulo> lerCapitulo(String caminho, HashMap<String, personagem> personagens){
        HashMap<String, capitulo> capitulos = new HashMap<String, capitulo>();
        File arquivo = new File(caminho);
        try{
        Scanner escaneador = new Scanner(arquivo);
        System.out.println("Lendo Capitulos...");
        while (escaneador.hasNextLine()){
            String linha = escaneador.nextLine();
            if(linha.equalsIgnoreCase("capitulo")){
                String id = escaneador.nextLine();
                String texto = escaneador.nextLine();
                String pergunta = escaneador.nextLine();
                String personagem1 = escaneador.nextLine();
                String personagem2 = escaneador.nextLine();
                int mudanca1 = Integer.parseInt(escaneador.nextLine());
                int mudanca2 = Integer.parseInt(escaneador.nextLine());
            

            }

        }
        escaneador.close();
        }
        catch(FileNotFoundException e){

        }
        
        return capitulos;
    }
}