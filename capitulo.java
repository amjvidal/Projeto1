package P2;

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

    public capitulo(String capitulo, String pergunta, String escolha1, String escolha2, personagem personagem1, personagem personagem2, int mudanca1, int mudanca2){
        this.capitulo = capitulo;
        this.pergunta = pergunta;
        this.escolha1 = escolha1;
        this.escolha2 = escolha2;
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
}
