package P2;

public class personagem {
    private String nome;
    private int paixao;

public personagem(String nome, int paixao){
    this.nome = nome;
    this.paixao = paixao;
}

boolean mudapaixao (int mudanca){
    boolean amor = true;
    this.paixao += mudanca;
    if (paixao <= 0){
        this.paixao = 0;
        System.out.println(this.nome + " mudou o status da sua paixão");
        System.out.println("A sua paixão é de: "+ this.paixao);
        System.out.println(this.nome + " está carente e a história acabou.\n");
        amor = false;
        return amor;
    }
    else if(paixao >= 100){
        this.paixao = 100;
        System.out.println(this.nome + " mudou o status da sua paixão");
        System.out.println("A sua paixão é de: "+ this.paixao);
        System.out.println(this.nome + " está de bem com a vida.\n");
        return amor;
    }
    else{
        System.out.println(this.nome + " mudou o status da sua paixão");
        System.out.println("A sua paixão é de: "+ this.paixao + "\n");
        return amor;
    }
}


    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public int getPaixao() {
        return paixao;
    }

    
    public void setPaixao(int paixao) {
        this.paixao = paixao;
    }

}
