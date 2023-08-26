package src;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class capituloImagem extends capitulo{
    private String imagem;
    
     
    public capituloImagem(String capitulo, String pergunta, ArrayList<escolha> escolhas, personagem personagem1,
      personagem personagem2, int mudanca1, int mudanca2, String imagem){
        super(capitulo, pergunta, escolhas, personagem1, personagem2, mudanca1, mudanca2);
        this.capitulo = capitulo;
        this.pergunta = pergunta;
        this.escolhas = new ArrayList<>();
        this.personagem1 = personagem1;
        this.personagem2 = personagem2;
        this.mudanca1 = mudanca1;
        this.mudanca2 = mudanca2;
        this.imagem = imagem;
    
    }

    protected HashMap<String, capitulo> lerCapituloImagem(HashMap<String, personagem> personagens, Scanner escaneador, HashMap<String, capitulo> capitulos){
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
        if(linha.equalsIgnoreCase("capituloImagem")){
            ArrayList<escolha> escolhas = new ArrayList<escolha>();
            String refOrigem = escaneador.nextLine();
            String texto = escaneador.nextLine();
            String pergunta = escaneador.nextLine();
            String personagem1 = escaneador.nextLine();
            String personagem2 = escaneador.nextLine();
            int mudanca1 = Integer.parseInt(escaneador.nextLine());
            int mudanca2 = Integer.parseInt(escaneador.nextLine());
            if(linha.equalsIgnoreCase("imagem")){
                imagem = "";
                while(!linha.equalsIgnoreCase("FimImagem")){
                    linha = escaneador.nextLine();
                    imagem += "\n" + linha;
                }
            }
            capituloImagem Capitulo = new capituloImagem(texto, pergunta, escolhas, personagens.get(personagem1), personagens.get(personagem2), mudanca1, mudanca2, imagem);
            capitulos.put(refOrigem, Capitulo);
        }
        return capitulos;
    }

    @Override
    public void mostrar(){
        System.out.println(this.capitulo);
        System.out.println(this.imagem);
        System.out.println(this.pergunta);
        
        if (mudanca1 != 0){
            this.personagem1.mudapaixao(mudanca1);}
        if (mudanca2 != 0){
            this.personagem2.mudapaixao(mudanca2);}
    }




}
    

