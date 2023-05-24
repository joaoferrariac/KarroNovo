import java.util.Scanner;

public class Moto extends Automotor{
    protected String partidaEletrica;
    protected int cilindradas;
    Moto(
    ){
        super();
        Scanner obterValores = new Scanner(System.in);

        System.out.println("A moto possui partida elétrica? (S/N)");
        this.partidaEletrica = obterValores.nextLine();

        System.out.println("Quantas Cilindradas? ");
        this.cilindradas = Integer.valueOf(obterValores.nextLine());
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