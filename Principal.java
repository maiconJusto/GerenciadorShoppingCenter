public class Principal {
    public static void main(String[] args) {

        Loja loja = null;
        Produto produto = null;

        int opcao = 0;
        do {
            System.out.println("(1) criar uma loja");
            System.out.println("(2) criar um produto");
            System.out.println("(3) sair");

            opcao = Teclado.leInt("Escolha uma opção:");

            switch (opcao) {

                case 1:
                    String nomeLoja = Teclado.leString("Digite o nome da loja:");
                    int quantFuncionarioLoja = Teclado.leInt("Digite quant funcionario: :");
                    double SalFuncionarioLoja = Teclado.leDouble("Digite o Salario dos funcionarios da loja: ");
                    
                    int diaFundacaoLoja = Teclado.leInt("Digite o dia de fundação da loja: ");
                    int mesFundacaoLoja = Teclado.leInt("Digite o mês de fundação da loja: ");
                    int anoFundacaoLoja = Teclado.leInt("Digite o ano de fundação da loja: ");

                    String nomeRuaLoja = Teclado.leString("Digite a Rua da loja: ");
                    String numeroLoja = Teclado.leString("Digite o nº da loja: ");
                    String cepLoja = Teclado.leString("Digite o CEP da loja: ");
                    String complementoLoja = Teclado.leString("Digite o complemento da loja: ");
                    String cidadeLoja = Teclado.leString("Digite a cidade da loja: ");
                    String estadoDaLoja = Teclado.leString("Digite o estado da loja: ");
                    String paisLoja = Teclado.leString("Digite o país da loja: ");

                    Endereco enderecoLoja = new Endereco(nomeRuaLoja, numeroLoja, cepLoja, complementoLoja, cidadeLoja, estadoDaLoja, paisLoja);
                    Data dataFundacaoLoja = new Data(diaFundacaoLoja, mesFundacaoLoja, anoFundacaoLoja);

                    loja = new Loja(nomeLoja, quantFuncionarioLoja, SalFuncionarioLoja, enderecoLoja, dataFundacaoLoja);
                    System.out.println("Loja criada com sucesso!");
                    break;

                case 2:
                    String nomeProduto = Teclado.leString("Digite o nome do produto:");
                    double precoProduto = Teclado.leDouble("Digite o preço do produto:");

                    int diaValidadeProduto = Teclado.leInt("Digite o dia de validade do produto (dia): ");
                    int mesValidadeProduto = Teclado.leInt("Digite o mês de validade do produto (mês): ");
                    int anoValidadeProduto = Teclado.leInt("Digite o ano de validade do produto (ano): ");

                    Data dataValidadeProduto = new Data(diaValidadeProduto, mesValidadeProduto, anoValidadeProduto);

                    produto = new Produto(nomeProduto, precoProduto, dataValidadeProduto);
                    System.out.println("Produto criado com sucesso!");
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 3);

        Data dataConsulta = new Data(20, 10, 2023);
        if (produto.estaVencido(dataConsulta)) {
            System.out.println("PRODUTO VENCIDO");
        } else {
            System.out.println("PRODUTO NÃO VENCIDO");
        }

        System.out.println("Informações da loja:");
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Quantidade de funcionarios: " + produto.getPreco());
        //System.out.println("Valor total: " + produto.getValorTotal());


    }
}
