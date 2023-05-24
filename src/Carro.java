import java.util.Scanner;
public class Carro extends Automotor {
    protected String quantidadePortas;

    Carro(
    ) {
        super();

        Scanner obterValores = new Scanner(System.in);

        this.quantidadePortas = obterValores.nextLine();
    }

    @Override
    public String toString() {
        return "Código: " + codigo +
                "\nCor: " + cor +
                "\nMarca: " + marca +
                "\nModelo: " + modelo +
                "\nValor: R$ " + valor +
                "\nCombustível: " + combustivel;
    }
}
