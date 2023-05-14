public class Endereco{

    private String nomeDaRua,
        numero,
        cep, 
        complemento,
        cidade,
        estado, 
        pais; 

    public Endereco(String nomeDaRua, String numero, String cep, String complemento, String cidade,
        String estado, String pais){

        this.nomeDaRua = nomeDaRua;
        this.numero = numero;
        this.cep = cep;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

    //métodos de acesso (get e set)
    public String getNomeDaRua(){
        return nomeDaRua;
    }

    public void setNomeDaRua(String nomeDaRua){
        this.nomeDaRua = nomeDaRua;
    }

    public String getNumero(){
        return numero;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public String getCep(){
        return cep;
    }

    public void setCep(String cep){
        this.cep = cep;
    }

    public String getComplemento(){
        return complemento;
    }

    public void setComplemento(String complemento){
        this.complemento = complemento;
    }

    public String getCidade(){
        return cidade;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public String getEstado(){
        return estado;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public String getPais(){
        return pais;
    }

    public void setPais(String pais){
        this.pais = pais;
    }

    public String toString(){
        return String.format("Nome da rua: %s\nNumero: %s\nCep: %s\n" +
            "Complemento: %s\nCidade: %s\nEstado: %s\nPais: %s\n",nomeDaRua,
            numero, cep, complemento, cidade, estado, pais);
    }
}