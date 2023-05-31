public class Principal {
    public static void main(String[] args) {

        //Inicializando variaveis vazias
        Loja loja = null;
        Produto produto = null;

        //Menu
        int opcao = 0;
        do {
            System.out.println("(1) criar uma loja");
            System.out.println("(2) criar um produto");
            System.out.println("(3) sair");

            opcao = Teclado.leInt("Escolha uma opção:");

            switch (opcao) {

                case 1:
                    //recebendo parametros
                    //loja
                    String nomeLoja = Teclado.leString("Digite o nome da loja:");
                    int quantFuncionarioLoja = Teclado.leInt("Digite quant funcionario: :");
                    double SalFuncionarioLoja = Teclado.leDouble("Digite o Salario dos funcionarios da loja: ");

                    //Fundação da loja
                    int diaFundacaoLoja = Teclado.leInt("Digite o dia de fundação da loja: ");
                    int mesFundacaoLoja = Teclado.leInt("Digite o mês de fundação da loja: ");
                    int anoFundacaoLoja = Teclado.leInt("Digite o ano de fundação da loja: ");
                    
                    //Endereço da loja
                    String nomeRuaLoja = Teclado.leString("Digite a Rua da loja: ");
                    String numeroLoja = Teclado.leString("Digite o nº da loja: ");
                    String cepLoja = Teclado.leString("Digite o CEP da loja: ");
                    String complementoLoja = Teclado.leString("Digite o complemento da loja: ");
                    String cidadeLoja = Teclado.leString("Digite a cidade da loja: ");
                    String estadoDaLoja = Teclado.leString("Digite o estado da loja: ");
                    String paisLoja = Teclado.leString("Digite o país da loja: ");
                    
                    //Tamnho do estoque da loja
                    int tamanhoEstoqueLoja = Teclado.leInt("Digite o tamanho do estoque: ");
                    
                    //Instancias
                    //Endereço da loja
                    Endereco enderecoLoja = new Endereco(nomeRuaLoja, numeroLoja, cepLoja, complementoLoja, cidadeLoja, estadoDaLoja, paisLoja);
                    
                    //Data fundação da loja
                    Data dataFundacaoLoja = new Data(diaFundacaoLoja, mesFundacaoLoja, anoFundacaoLoja);
                    
                    //loja
                    loja = new Loja(nomeLoja, quantFuncionarioLoja, SalFuncionarioLoja, enderecoLoja, dataFundacaoLoja, tamanhoEstoqueLoja);
                    
                    System.out.println("Loja criada com sucesso!");
                    break;

                case 2:
                    //recebendo parametros
                    //Produto
                    String nomeProduto = Teclado.leString("Digite o nome do produto:");
                    double precoProduto = Teclado.leDouble("Digite o preço do produto:");

                    //Validade do Produto
                    int diaValidadeProduto = Teclado.leInt("Digite o dia de validade do produto (dia): ");
                    int mesValidadeProduto = Teclado.leInt("Digite o mês de validade do produto (mês): ");
                    int anoValidadeProduto = Teclado.leInt("Digite o ano de validade do produto (ano): ");

                    //Instancias
                    //Data de validade do produto
                    Data dataValidadeProduto = new Data(diaValidadeProduto, mesValidadeProduto, anoValidadeProduto);
                    
                    //Produto
                    produto = new Produto(nomeProduto, precoProduto, dataValidadeProduto);

                    System.out.println("Produto criado com sucesso!");
                    break;

                case 3:
                    //mensagem de encerramento do menu
                    System.out.println("Saindo...");
                    break;

                default:
                    //mensagem de erro de opção inserida
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 3);

        //Consulta da validade
        Data dataConsulta = new Data(20, 10, 2023);
        if (produto.estaVencido(dataConsulta)) {
            System.out.println("PRODUTO VENCIDO");
        } else {
            System.out.println("PRODUTO NÃO VENCIDO");
        }

        System.out.println(loja.toString());
        
        
    }
}
