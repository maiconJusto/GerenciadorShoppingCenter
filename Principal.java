import java.io.DataInput;

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

                    String nomeRuaLoja = Teclado.leString("Digite a Rua da loja: ");
                    String numeroLoja = Teclado.leString("Digite o nº da loja: ");
                    String cepLoja = Teclado.leString("Digite o CEP da loja: ");
                    String complementoLoja = Teclado.leString("Digite o complemento da loja: ");
                    String cidadeLoja = Teclado.leString("Digite a cidade da loja: ");
                    String estadoDaLoja = Teclado.leString("Digite o estado da loja: ");
                    String paisLoja = Teclado.leString("Digite o país da loja: ");

                    int diaFundacaoLoja = Teclado.leInt("Digite o dia de fundação da loja: ");
                    int mesFundacaoLoja = Teclado.leInt("Digite o mês de fundação da loja: ");
                    int anoFundacaoLoja = Teclado.leInt("Digite o ano de fundação da loja: ");

                    Endereco enderecoLoja = new Endereco(nomeRuaLoja, numeroLoja, cepLoja, complementoLoja, cidadeLoja,
                            estadoDaLoja, paisLoja);
                    Data dataFundacaoLoja = new Data(diaFundacaoLoja, mesFundacaoLoja, anoFundacaoLoja);

                    loja = new Loja(nomeLoja, quantFuncionarioLoja, enderecoLoja, dataFundacaoLoja);
                    System.out.println("Loja criada com sucesso!");
                    break;

                case 2:
                    String nomeProduto = Teclado.leString("Digite o nome do produto:");
                    double precoProduto = Teclado.leDouble("Digite o preço do produto:");

                    int diaVencimentoProduto = Teclado.leInt("Digite o dia de validade do produto (dia): ");
                    int mesVencimentoProduto = Teclado.leInt("Digite o mês de validade do produto (mês): ");
                    int anoVencimentoProduto = Teclado.leInt("Digite o ano de validade do produto (ano): ");

                    Data dataValidadeProduto = new Data(diaVencimentoProduto, mesVencimentoProduto,
                            anoVencimentoProduto);

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
        
        /*if (opcao == 1 || opcao == 2) {
            boolean produtoVencido = produto.estaVencido();

            if (produtoVencido) {
                System.out.println("PRODUTO VENCIDO");
            } else {
                System.out.println("PRODUTO NÃO VENCIDO");
            }

            System.out.println("Informações da loja:");
            System.out.println("Nome: " + loja.getNome());
            System.out.println("Quantidade de produtos: " + loja.getQuantidadeProdutos());
            System.out.println("Valor total: " + loja.getValorTotal());
        }*/

    }
}
