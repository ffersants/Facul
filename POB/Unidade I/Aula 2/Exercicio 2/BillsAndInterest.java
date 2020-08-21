/*
Implemente um programa em Java que calcule o juro de uma dívida que você contraiu no mês passado 
no crediário de uma loja. A taxa de juros mensal e o valor da dívida serão fornecidos pelo usuário.
*/
import java.util.Scanner;

public class BillsAndInterest{
    public static void main(String[] args){
        double bill;
        System.out.println("How mutch is the bill payment? ");
        bill = new Scanner(System.in).nextDouble();
        System.out.println("What's the interest in this bill in per cent?");
        double interest = new Scanner(System.in).nextDouble();
        
        double interestCalculated = interest / 100 * bill;
        System.out.println("Your interest is " + interestCalculated + " dinheiros! \n So the amout is " + bill + interestCalculated + " dinheiros!");
    }
}