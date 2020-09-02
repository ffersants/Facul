import java.util.Scanner;

public class BillsAndInterest{
    public static void main(String[] args){
        double bill = getInput("Qual o valor da divida? ");
        double interest = getInput("Qual a porcentagem dos juros?");

        double dividaTotal = calculaTotal(bill, interest);
        System.out.println("Sua divida totaliza R$" + dividaTotal + "0 reais.");
    }

    public static double getInput(String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in).nextDouble();
    }

    public static double calculaTotal(double bill, double interest){
        return (bill / 100 * interest) + bill;
    }
}