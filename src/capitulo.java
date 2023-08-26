package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class capitulo {
    protected String capitulo;
    protected String pergunta;
    protected ArrayList<escolha> escolhas;
    protected personagem personagem1;
    protected personagem personagem2;
    protected int mudanca1;
    protected int mudanca2;
    protected Scanner escaneador;
    Scanner scan = new Scanner(System.in);
    

    public capitulo(String capitulo, String pergunta, ArrayList<escolha> escolhas, personagem personagem1,
      personagem personagem2, int mudanca1, int mudanca2){
        this.capitulo = capitulo;
        this.pergunta = pergunta;
        this.escolhas = new ArrayList<escolha>();
        this.personagem1 = personagem1;
        this.personagem2 = personagem2;
        this.mudanca1 = mudanca1;
        this.mudanca2 = mudanca2;
    }

    public capitulo(Scanner escaneador, HashMap<String, personagem> personagens, Scanner escaneadordeArquivos){
        this.escaneador = escaneador;
        this.escolhas = new ArrayList<escolha>();
        this.lerCapitulo(personagens, escaneadordeArquivos);
    }
    
    protected void lerCapitulo(HashMap<String, personagem> personagens, Scanner escaneadordeArquivos){
        escaneadordeArquivos.nextLine();
        String personagem1 = escaneadordeArquivos.nextLine();
        String personagem2 = escaneadordeArquivos.nextLine();
        this.personagem1 = personagens.get(personagem1);
        this.personagem2 = personagens.get(personagem2);
        escaneadordeArquivos.nextLine();
        String linha = escaneadordeArquivos.nextLine();
        this.capitulo = "";
        while(!linha.equalsIgnoreCase("pergunta")){
            this.capitulo += linha + "\n";
            linha = escaneadordeArquivos.nextLine();
        }
    }
    
    public void mostrar(){
        System.out.println(this.capitulo);
        System.out.println(this.pergunta);
        
        
        if (mudanca1 != 0){
            this.personagem1.mudapaixao(mudanca1);}
        if (mudanca2 != 0){
            this.personagem2.mudapaixao(mudanca2);}
    }
    
    
    // O METEDO COMPARA A RESPOSTA DO USUARIOS COM INDICE DO ARRAY
    public void escolher(){
        boolean loop = true;
        while(loop == true){
            String digitado = scan.nextLine();
        
            for(escolha escolhas : escolhas){
                if(escolhas.getResposta().equalsIgnoreCase(digitado)){
                    loop = false;
                    capitulo proximoCapitulo = escolhas.getProximo();
                    proximoCapitulo.executar();
            
            }
        }
         System.out.println("Escolha invalida! Tente novamente!");
         System.out.println(this.pergunta);
    }
    
       
    }

    public void adicionarEscolha(escolha Escolha){
        escolhas.add(Escolha);
    }


    public void executar(){
        mostrar();
        escolher();
        }
    
    public String getCapitulo() {
        return capitulo;
    }

    
    public void setCapitulo(String capitulo) {
        this.capitulo = capitulo;
    }

    
    public String getPergunta() {
        return pergunta;
    }

    
    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    
    public ArrayList<escolha> getEscolhas() {
        return escolhas;
    }

   

    
    public personagem getPersonagem1() {
        return personagem1;
    }

    
    public void setPersonagem1(personagem personagem1) {
        this.personagem1 = personagem1;
    }

    
    public personagem getPersonagem2() {
        return personagem2;
    }

    
    public void setPersonagem2(personagem personagem2) {
        this.personagem2 = personagem2;
    }

    
    public int getMudanca1() {
        return mudanca1;
    }

    
    public void setMudanca1(int mudanca1) {
        this.mudanca1 = mudanca1;
    }

    
    public int getMudanca2() {
        return mudanca2;
    }

    
    public void setMudanca2(int mudanca2) {
        this.mudanca2 = mudanca2;
    }

}

