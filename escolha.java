package P2;

class escolha {
    private String resposta;
    private capitulo proximo;
    
    public escolha( String resposta, capitulo proximo) {
        this.resposta = resposta;
        this.proximo = proximo;
    }

    public String getResposta() {
        return resposta;
    }

    public capitulo getProximo() {
        return proximo;
    }
    
    
}