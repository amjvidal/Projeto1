package src;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class capituloImagem extends capitulo{
    private String imagem;
    
     public capituloImagem(String capitulo, String pergunta, ArrayList<escolha> escolhas, personagem personagem1,
       personagem personagem2, int mudanca1, int mudanca2, String imagem){
        super(capitulo, pergunta, escolhas, personagem1, personagem2, mudanca1, mudanca2);
        this.imagem = imagem;
    }

    public capituloImagem(Scanner escaneador, HashMap<String, personagem> personagens, Scanner escaneadordeArquivos){
        super(escaneador, personagens, escaneadordeArquivos);
        this.escolhas = new ArrayList<escolha>();
        this.escaneador = escaneador;
        this.lerCapitulo(personagens, escaneadordeArquivos);
    }
   @Override
    protected void lerCapitulo(HashMap<String, personagem> personagens, Scanner escaneadordeArquivos){
        super.lerCapitulo(personagens, escaneadordeArquivos);
        escaneadordeArquivos.nextLine();
        String linha = escaneadordeArquivos.nextLine();
        this.imagem = "";
        while(!linha.equalsIgnoreCase("fimimagem")){
            this.imagem += linha + "\n";
            linha = escaneadordeArquivos.nextLine();
        }
    }

    public void lerImagem(Scanner escaneadordeArquivos){
        String linha = escaneadordeArquivos.nextLine();
        while(!linha.equalsIgnoreCase("fimImagem")){
            this.imagem += linha + "\n";
            linha = escaneadordeArquivos.nextLine();
            }
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
    @Override
    public void executar(){
        mostrar();
        escolher();
    }
}
    

