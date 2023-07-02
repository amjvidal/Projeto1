package P2;
import java.util.Scanner;
public class capitulo {
    String capitulo;
    String pergunta;
    String escolha1;
    String escolha2;
    String resposta1;
    String resposta2;
    personagem personagem1;
    personagem personagem2;
    int mudanca1;
    int mudanca2;
    Scanner scan = new Scanner(System.in);
    

    public capitulo(String capitulo, String pergunta, String escolha1, String escolha2, String resposta1, String resposta2, personagem personagem1, personagem personagem2, int mudanca1, int mudanca2){
        this.capitulo = capitulo;
        this.pergunta = pergunta;
        this.escolha1 = escolha1;
        this.escolha2 = escolha2;
        this.resposta1 = resposta1;
        this.resposta2 = resposta2;
        this.personagem1 = personagem1;
        this.personagem2 = personagem2;
        this.mudanca1 = mudanca1;
        this.mudanca2 = mudanca2;
    }

    public void mostrar(String capitulo, String pergunta,String escolha1, String escolha2, int mudanca1, int mudanca2){
        System.out.println(this.capitulo);
        System.out.println(this.pergunta);
        System.out.println(this.escolha1);
        System.out.println(this.escolha2);

    this.personagem1.mudapaixao(mudanca1);
    this.personagem2.mudapaixao(mudanca2);
    }
    
    
    
    int escolher(Scanner scan, String resposta1, String resposta2){
        String escolha = scan.nextLine();
        if(escolha.equalsIgnoreCase(resposta1)){
            return 1;
        }
        else if(escolha.equalsIgnoreCase(resposta2)){
            return 2;
        }
        else{
            return 0;
        }

    }
}
