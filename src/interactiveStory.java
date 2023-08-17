package src;

import java.util.Scanner;

public class interactiveStory {

//Criando uma função para dar print e não ficar muito poluido de System.out.println no codigo
public static void printString(String a) {
        System.out.println(a);
}

    public static void main(String[] args) {
    

        
            
            
        // DECLARAÇÃO DOS PERSONAGENS E CAPITULOS
         escolha[] escolhas1 = new escolha[2];
         escolha[] escolhas2 = new escolha[2];
         personagem  Sofia = new personagem("Sofia", 100);
         personagem  Adam = new personagem("Adam", 50);
         capitulo capitulo1 = new capitulo(cap1, pergunta1, escolhas1, Adam, Sofia, 0, 0);
         capitulo fim1 = new capitulo(final1,"", null,  Sofia, Adam, 0,-50);
         capitulo capitulo2 = new capitulo(cap2, pergunta2, escolhas2, Sofia, Adam,0,0);
         capitulo fim2 = new capitulo(final2, "", null, Sofia, Adam, 100,100);
         capitulo fim3 = new capitulo(final3, "", null, Sofia, Adam, -50,-100); 
        
         escolhas1[0] = new escolha("nao", fim1);
         escolhas1[1] = new escolha("sim",capitulo2);
         escolhas2[0] = new escolha("escolha positiva",fim2);
         escolhas2[1] = new escolha("escolha incerta",fim3);
        
        //INTRODUÇÂO
        Scanner scanner = new Scanner(System.in);
        printString("Shades of Charm, Maybe a happy story. \n");
        capitulo raiz = capitulo1;
        raiz.executar();
        scanner.close();
}
}