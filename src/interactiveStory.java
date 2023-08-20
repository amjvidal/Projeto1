package src;
import java.util.HashMap;

public class interactiveStory {

//Criando uma função para dar print e não ficar muito poluido de System.out.println no codigo
public static void printString(String a) {
        System.out.println(a);
}

    public static void main(String[] args) {
        leitorArquivo leitor = new leitorArquivo();
        HashMap<String, personagem> personagens = leitor.lerPersonagens("rsc/personagens.txt");
        HashMap<String, capitulo> capitulos = leitor.lerCapitulo("rsc/capitulo.txt", personagens);

        capitulo raiz = capitulos.get("cap1");
         
        
        printString("Shades of Charm, Maybe a happy story. \n");
        raiz.executar();
            
     
        
       
        
}
}