package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class leitorArquivo {
    HashMap<String, personagem> lerPersonagens(String caminho){
        HashMap<String, personagem> personagens = new HashMap<String, personagem>();

        File arquivo = new File(caminho);
        try{
            Scanner escaneador = new Scanner(arquivo,"UTF-8");
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
        File arquivo2 = new File(caminho );
        try{
        Scanner escaneador = new Scanner(arquivo2,"UTF-8");
        System.out.println("Lendo Capitulos...");
        while (escaneador.hasNextLine()){
            String linha = escaneador.nextLine();
            if(linha.equalsIgnoreCase("capitulo")){
                ArrayList<escolha> escolha = new ArrayList<escolha>();
                String refOrigem = escaneador.nextLine();
                String texto = escaneador.nextLine();
                String pergunta = escaneador.nextLine();
                String personagem1 = escaneador.nextLine();
                String personagem2 = escaneador.nextLine();
                int mudanca1 = Integer.parseInt(escaneador.nextLine());
                int mudanca2 = Integer.parseInt(escaneador.nextLine());
                capitulo Capitulo = new capitulo(texto, pergunta, escolha, personagens.get(personagem1), personagens.get(personagem2), mudanca1, mudanca2);
                capitulos.put(refOrigem, Capitulo);
            }
            else if(linha.equalsIgnoreCase("escolha")){
                String refOrigem = escaneador.nextLine();
                String escolha = escaneador.nextLine();
                String refSaida = escaneador.nextLine();
                capitulos.get(refOrigem).adicionarEscolha(new escolha(escolha, capitulos.get(refSaida)));

            }
        }
        escaneador.close();
        }
        catch(FileNotFoundException e){
             System.out.println("O Arquivo não foi encontrado no "+ caminho+ " Especificado.");
        }
        
        return capitulos;
    }
}