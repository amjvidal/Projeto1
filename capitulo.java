package P2;
import java.util.Scanner;
public class capitulo {
    String capitulo;
    String pergunta;
    escolha[] escolhas;
    personagem personagem1;
    personagem personagem2;
    int mudanca1;
    int mudanca2;
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
    }

