public class Informatica extends Loja{
     
    double seguroEletronicos;

    public Informatica(String nomeLojaInformatica, int quantidadeFuncionariosLojaInformatica, 
            double salarioBaseFuncionarioLojaInformatica, Endereco enderecoLojaInformatica, 
            Data dataFundacaoLojaInformatica, int tamanhoEstoqueLojaInformatica, double seguroEletronicos){
        super(nomeLojaInformatica, quantidadeFuncionariosLojaInformatica, salarioBaseFuncionarioLojaInformatica, enderecoLojaInformatica, dataFundacaoLojaInformatica, tamanhoEstoqueLojaInformatica);
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos(){
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos){
        this.seguroEletronicos = seguroEletronicos;
    }

    @Override
    public String toString() {
        return getNome() + "/" + getQuantidadeFuncionarios() + "/" + getSalarioBaseFuncionario() + "/" 
                + getEndereco() + "/" + getDataFundacao() + "/" + seguroEletronicos;
    }
}
