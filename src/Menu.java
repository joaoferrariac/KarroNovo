import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private static List<Veiculo> veiculos = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        exibirMenuPrincipal();
    }

    public static void exibirMenuPrincipal() {
        int opcao;
        do {
            System.out.println("----- Menu Principal -----");
            System.out.println("1 - Cadastrar veículo");
            System.out.println("2 - Editar veículo");
            System.out.println("3 - Ver informações de um veículo específico");
            System.out.println("4 - Excluir veículo");
            System.out.println("5 - Ver todos os veículos");
            System.out.println("6 - Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    exibirMenuCadastroVeiculo();
                    break;
                case 2:
                    editarVeiculo();
                    break;
                case 3:
                    verInformacoesVeiculo();
                    break;
                case 4:
                    excluirVeiculo();
                    break;
                case 5:
                    verTodosVeiculos();
                    break;
                case 6:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Digite um número válido.");
            }
        } while (opcao != 6);
    }

    public static void exibirMenuCadastroVeiculo() {
        Integer opcao;
        do {
            System.out.println("----- Menu Cadastro de Veículo -----");
            System.out.println("1 - Carro");
            System.out.println("2 - Moto");
            System.out.println("3 - Caminhão");
            System.out.println("4 - Bicicleta");
            System.out.println("5 - Voltar ao menu principal");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarCarro();
                    break;
                case 2:
                    cadastrarMoto();
                    break;
                case 3:
                    cadastrarCaminhao();
                    break;
                case 4:
                    cadastrarBicicleta();
                    break;
                case 5:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida! Digite um número válido.");
            }
        } while (opcao != 5);
    }

    public static void cadastrarCarro() {
        Carro carro = new Carro();
        veiculos.add(carro);
        System.out.println("Carro cadastrado com sucesso!");
    }

    public static void cadastrarMoto() {
        Moto moto = new Moto();
        veiculos.add(moto);
        System.out.println("Moto cadastrada com sucesso!");
    }

    public static void cadastrarCaminhao() {
        Caminhao caminhao = new Caminhao();
        veiculos.add(caminhao);
        System.out.println("Caminhão cadastrado com sucesso!");
    }

    public static void cadastrarBicicleta() {
        Bicicleta bicicleta = new Bicicleta();
        veiculos.add(bicicleta);
        System.out.println("Bicicleta cadastrada com sucesso!");
    }

    public static void editarVeiculo() {
        System.out.print("Digite o código do veículo que deseja editar: ");
        String codigo = scanner.nextLine();
        Veiculo veiculoEncontrado = buscarVeiculoPorCodigo(codigo);

        if (veiculoEncontrado != null) {
            System.out.println("----- Informações atuais do veículo -----");
            System.out.println(veiculoEncontrado.toString());

            System.out.println("----- Digite os novos valores do veículo -----");
            Scanner obterValores = new Scanner(System.in);

            System.out.println("Digite a cor do veículo: ");
            veiculoEncontrado.cor = obterValores.nextLine();

            System.out.println("Digite a marca do veículo: ");
            veiculoEncontrado.marca = obterValores.nextLine();

            System.out.println("Digite o modelo do veículo: ");
            veiculoEncontrado.modelo = obterValores.nextLine();

            System.out.println("Digite o valor do veículo: ");
            veiculoEncontrado.valor = Double.parseDouble(obterValores.nextLine());

            System.out.println("Selecione o novo tipo de combustível:");
            System.out.println("G - Gasolina");
            System.out.println("A - Álcool");
            System.out.println("F - Flex");
            System.out.println("E - Elétrico");
            System.out.println("D - Diesel");
            veiculoEncontrado.combustivel = obterValores.nextLine();

            System.out.println("Veículo editado com sucesso!");
        } else {
            System.out.println("Veículo não encontrado!");
        }
    }

    public static void verInformacoesVeiculo() {
        System.out.print("Digite o código do veículo que deseja visualizar: ");
        String codigo = scanner.nextLine();
        Veiculo veiculoEncontrado = buscarVeiculoPorCodigo(codigo);

        if (veiculoEncontrado != null) {
            System.out.println("----- Informações do veículo -----");
            System.out.println(veiculoEncontrado.toString());
        } else {
            System.out.println("Veículo não encontrado!");
        }
    }

    public static void excluirVeiculo() {
        System.out.print("Digite o código do veículo que deseja excluir: ");
        String codigo = scanner.nextLine();
        Veiculo veiculoEncontrado = buscarVeiculoPorCodigo(codigo);

        if (veiculoEncontrado != null) {
            veiculos.remove(veiculoEncontrado);
            System.out.println("Veículo excluído com sucesso!");
        } else {
            System.out.println("Veículo não encontrado!");
        }
    }

    public static void verTodosVeiculos() {
        if (veiculos.isEmpty()) {
            System.out.println("Não há veículos cadastrados!");
        } else {
            System.out.println("----- Lista de Veículos -----");
            for (Veiculo veiculo : veiculos) {
                System.out.println(veiculo.toString());
                System.out.println("----------------------------");
            }
        }
    }

    public static Veiculo buscarVeiculoPorCodigo(String codigo) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.codigo.equals(codigo)) {
                return veiculo;
            }
        }
        return null;
    }
}
