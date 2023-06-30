package P2;

public class capitulo {
    String capitulo;
    String escolha1;
    String escolha2;
    personagem personagem1;
    personagem personagem2;
    int mudanca;

    public capitulo(String capitulo, String escolha1, String escolha2, personagem personagem1, personagem personagem2, int mudanca){
        this.capitulo = capitulo;
        this.escolha1 = escolha1;
        this.escolha2 = escolha2;
        this.personagem1 = personagem1;
        this.personagem2 = personagem2;
        this.mudanca = mudanca;
    }

    public void mostrar(String capitulo, String escolha1, String escolha2, int mudanca){
        System.out.println(this.capitulo);
        System.out.println(this.escolha1);
        System.out.println(this.escolha2);

        
    }
}
