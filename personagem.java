package P2;

public class personagem {
    String nome;
    int paixao;

public personagem(String nome, int paixao){
    this.nome = nome;
    this.paixao = paixao;
}

boolean mudapaixao (int mudanca){
    boolean amor = true;
    this.paixao += mudanca;

    if (paixao < 0){
        this.paixao = 0;
        amor = false;
        System.out.println(this.nome + " mudou o status da sua paixão");
        System.out.println("A sua paixão é de: "+ this.paixao);
        System.out.println(this.nome + " está carente.");
        return amor;
    }
    else if(paixao > 100){
        this.paixao = 100;
        System.out.println(this.nome + " mudou o status da sua paixão");
        System.out.println("A sua paixão é de: "+ this.paixao);
        System.out.println(this.nome + " está apaixonade.");
        return amor;
    }
    else{
        System.out.println(this.nome + " mudou o status da sua paixão");
        System.out.println("A sua paixão é de: "+ this.paixao);
        return amor;
    }
}






}
