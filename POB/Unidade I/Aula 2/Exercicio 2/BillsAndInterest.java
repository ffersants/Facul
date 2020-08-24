// /*
// Implemente um programa em Java que calcule o juro de uma dívida que você contraiu no mês passado 
// no crediário de uma loja. A taxa de juros mensal e o valor da dívida serão fornecidos pelo usuário.
// */
    import java.util.Scanner;

    public class BillsAndInterest{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            double bill;
            System.out.println("Quando eh a divida? ");
            bill = scanner.nextDouble();
            System.out.println("Qual a porcentagem de juros? ");
            double interest = scanner.nextDouble();
            
            double interestCalculated = interest / 100 * bill;
            System.out.println("O juros calculado eh " + interestCalculated + " reais ao mes! \n A divida mais os juros fica no total de " + (bill + interestCalculated) + " reais!");
        }
    }
