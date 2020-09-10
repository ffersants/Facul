import java.util.Scanner;

public class main{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        
        do{
            System.out.println("Olá! Que tal se cadatrar para verificar sua classe social? \nPor favor, digite o seu nome: ");
            pessoa.setName(scan.nextLine());
        } while(pessoa.getName().equals(""));

        do{
            System.out.println("\nInsira algum código para que possamos te identificar: ");
            pessoa.setCode(scan.nextLine());
        } while(pessoa.getCode().equals(""));

        do{
            System.out.println("\n" + pessoa.getName() + ", qual o seu salário? ");
            pessoa.setPayment(scan.nextDouble());
            if(pessoa.getPayment() < 400){
                System.out.println("Hm... O valor mínimo para verificação é de R$400,00");
            }
        } while(pessoa.getPayment() < 400);
    }
}