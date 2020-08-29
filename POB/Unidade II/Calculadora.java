import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args){
        System.out.println("Você fará uma \n[A]dicao \n[S]ubtracao \n[M]ultiplicacaoo \n[D]ivisao");
        double total = lerInput();
        System.out.println("A soma dos valores eh " + total);
    }

    public static double lerInput(){
        String input = new Scanner(System.in).nextLine();
        double valorUm = lerDouble("Digite o valor um: ");
        double valorDois = lerDouble("Digite o valor dois: ");
        double fazerOperacao = soma(valorUm, valorDois);
        return fazerOperacao;
    }

    public static double lerDouble(String texto){
        System.out.println(texto);
        return new Scanner(System.in).nextDouble();
    }

    public static double soma(double numOne, double numDois){
        return numOne + numDois;
    }
}