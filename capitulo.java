package P2;
import java.util.Scanner;
public class capitulo {
    private String capitulo;
    private String pergunta;
    private escolha[] escolhas;
    private personagem personagem1;
    private personagem personagem2;
    private int mudanca1;
    private int mudanca2;
    Scanner scan = new Scanner(System.in);
    

    public capitulo(String capitulo, String pergunta, escolha[] escolhas, personagem personagem1,
      personagem personagem2, int mudanca1, int mudanca2){
        this.capitulo = capitulo;
        this.pergunta = pergunta;
        this.escolhas = escolhas;
        this.personagem1 = personagem1;
        this.personagem2 = personagem2;
        this.mudanca1 = mudanca1;
        this.mudanca2 = mudanca2;
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
                    return;
            }
        }
         System.out.println("Escolha invalida! Tente novamente!");
         System.out.println(this.pergunta);
    }


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

    
    public escolha[] getEscolhas() {
        return escolhas;
    }

   
    public void setEscolhas(escolha[] escolhas) {
        this.escolhas = escolhas;
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

