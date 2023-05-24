import java.util.Scanner;

public class Automotor extends Veiculo{
    public String combustivel;
    Automotor(
    ){
        super();
        Scanner obterValores = new Scanner(System.in);

        System.out.println("Selecione o novo tipo de combustível:");
        System.out.println("G - Gasolina");
        System.out.println("A - Álcool");
        System.out.println("F - Flex");
        System.out.println("E - Elétrico");
        System.out.println("D - Diesel");
        this.combustivel = obterValores.nextLine();
    }
}
