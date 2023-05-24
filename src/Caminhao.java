import java.util.Scanner;

public class Caminhao extends Automotor {
    protected int cargaMaxima;
    protected int numeroEixos;

    public Caminhao() {
        super();
        Scanner obterValores = new Scanner(System.in);

        System.out.println("Digite a carga máxima do caminhão: ");
        this.cargaMaxima = Integer.valueOf(obterValores.nextLine());

        System.out.println("Digite o número de eixos do caminhão: ");
        this.numeroEixos = Integer.valueOf(obterValores.nextLine());
    }

    @Override
    public String toString() {
        return "Código: " + codigo +
                "\nCor: " + cor +
                "\nMarca: " + marca +
                "\nModelo: " + modelo +
                "\nValor: R$ " + valor +
                "\nCombustível: " + combustivel +
                "\nCarga Máxima: " + cargaMaxima +
                "\nNúmero de Eixos: " + numeroEixos;
    }
}
