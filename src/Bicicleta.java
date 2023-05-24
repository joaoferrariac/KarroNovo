import java.util.Scanner;

public class Bicicleta extends Veiculo{
    protected String Freio;
    Bicicleta(){
        super();
        Scanner obterValores = new Scanner(System.in);

        System.out.print("Informe o tipo de freio da bicicleta (C - Cantiléver, V - V-Brake, F - Ferradura, M - Disco Mecânico, H - Disco Hidráulico): ");
        this.Freio = obterValores.nextLine();
    }
    @Override
    public String toString() {
        return super.toString() +
                "\nTipo de freio: " + Freio;
    }
}