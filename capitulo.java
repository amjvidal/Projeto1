package P2;
import java.util.Scanner;
public class capitulo {
    String capitulo;
    String pergunta;
    String[] escolhas;
    String[] respostas;
    personagem personagem1;
    personagem personagem2;
    int mudanca1;
    int mudanca2;
    Scanner scan = new Scanner(System.in);
    

    public capitulo(String capitulo, String pergunta, String[] escolhas,  String[] respostas, personagem personagem1,
      personagem personagem2, int mudanca1, int mudanca2){
        this.capitulo = capitulo;
        this.pergunta = pergunta;
        this.escolhas = escolhas;
        this.respostas = respostas;
        this.personagem1 = personagem1;
        this.personagem2 = personagem2;
        this.mudanca1 = mudanca1;
        this.mudanca2 = mudanca2;
    }

    public void mostrar(){
        System.out.println(this.capitulo);
        System.out.println(this.pergunta);
        if(escolhas!=null){
        int contador = 0;
        for (String str : escolhas){
            System.out.println("Opção " + (contador+1) + ": "+ str);
            contador++;
        }
    }
        
        if (mudanca1 != 0){
            this.personagem1.mudapaixao(mudanca1);}
        if (mudanca2 != 0){
            this.personagem2.mudapaixao(mudanca2);}
    }
    
    
    // O METEDO COMPARA A RESPOSTA DO USUARIOS COM INDICE DO ARRAY
    int escolher(String[] respostas){
        String escolha = scan.nextLine();
        int resultado = 0;
        for(int i = 0; i < respostas.length; i++){
            if(respostas[i].equalsIgnoreCase(escolha)){
                resultado++;
            }
        }
        return resultado;
        
        // if(escolha.equalsIgnoreCase(respostas[0])){
        //     return 0;
        // }
        // else if(escolha.equalsIgnoreCase(respostas[1])){
        //     return 1;
        // }
        // else{
        //     return 3;
        // }

    }
}
