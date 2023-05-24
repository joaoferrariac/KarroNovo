import java.util.Scanner;
public class Veiculo {
    protected String codigo;
    protected String cor;
    protected String marca;
    protected String modelo;
    protected double valor;
    public String combustivel;

    public Veiculo() {
        Scanner obterValores = new Scanner(System.in);
        System.out.println("Digite o codigo do veiculo: ");
        this.codigo = obterValores.nextLine();

        System.out.println("Digite a cor do veiculo: ");
        this.cor = obterValores.nextLine();

        System.out.println("Digite a marca do veiculo: ");
        this.marca = obterValores.nextLine();

        System.out.println("Digite o modelo do veiculo: ");
        this.modelo = obterValores.nextLine();

        System.out.println("Digite o valor do veiculo: ");
        this.valor = Integer.valueOf(obterValores.nextLine());
    }
}