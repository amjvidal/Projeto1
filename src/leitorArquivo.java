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
            Scanner escaneadordeArquivos = new Scanner(arquivo,"UTF-8");
            System.out.println("Lendo Personagens...");
            while (escaneadordeArquivos.hasNextLine()){
                String linha = escaneadordeArquivos.nextLine();
                if(linha.equalsIgnoreCase("personagem")){        
                    String id = escaneadordeArquivos.nextLine();
                    String nome = escaneadordeArquivos.nextLine();
                    int energia = Integer.parseInt(escaneadordeArquivos.nextLine());
                    personagem persona = new personagem(nome, energia);
                    personagens.put(id, persona);
                }
       
        }
        escaneadordeArquivos.close();
     }        catch (FileNotFoundException e){
            System.out.println("O Arquivo não foi encontrado no "+ caminho+ " Especificado.");

        }
    
    return personagens;
    }

    HashMap<String, capitulo> lerCapitulo(String caminho, HashMap<String, personagem> personagens){
        HashMap<String, capitulo> capitulos = new HashMap<String, capitulo>();
        File arquivo2 = new File(caminho );
        ArrayList<escolha> escolhas = new ArrayList<escolha>();
        try{
        Scanner escaneadordeArquivos = new Scanner(arquivo2,"UTF-8");
        System.out.println("Lendo Capitulos...");
        while (escaneadordeArquivos.hasNextLine()){
            String linha = escaneadordeArquivos.nextLine();
            if(linha.equalsIgnoreCase("capitulo") || linha.equalsIgnoreCase("capituloImagem")){
                
                String refOrigem = escaneadordeArquivos.nextLine();
                String texto = escaneadordeArquivos.nextLine();
                String pergunta = escaneadordeArquivos.nextLine();
                String personagem1 = escaneadordeArquivos.nextLine();
                String personagem2 = escaneadordeArquivos.nextLine();
                int mudanca1 = Integer.parseInt(escaneadordeArquivos.nextLine());
                int mudanca2 = Integer.parseInt(escaneadordeArquivos.nextLine());
                if(linha.equalsIgnoreCase("Imagem")){
                    String imagem = "";
                    while(!linha.equalsIgnoreCase("FimImagem")){
                        
                        escaneadordeArquivos.nextLine();
                        imagem += "\n" + linha;

                    }
                    capituloImagem Capitulo = new capituloImagem(texto, pergunta, escolhas, personagens.get(personagem1), personagens.get(personagem2), mudanca1, mudanca2, imagem);
                    capitulos.put(refOrigem, Capitulo);
                }
                else{
                capitulo Capitulo = new capitulo(texto, pergunta, escolhas, personagens.get(personagem1), personagens.get(personagem2), mudanca1, mudanca2);
                capitulos.put(refOrigem, Capitulo);}
            }

            else if(linha.equalsIgnoreCase("escolha")){
                String refOrigem = escaneadordeArquivos.nextLine();
                String escolha = escaneadordeArquivos.nextLine();
                String refSaida = escaneadordeArquivos.nextLine();
                capitulos.get(refOrigem).adicionarEscolha(new escolha(escolha, capitulos.get(refSaida)));

            }
          
        }
        escaneadordeArquivos.close();
        }
        catch(FileNotFoundException e){
             System.out.println("O Arquivo não foi encontrado no "+ caminho+ " Especificado.");
        }
        
        return capitulos;
    }
         
}