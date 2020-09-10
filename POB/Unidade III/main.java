import java.util.Scanner;
//unidade III, aula 6, atividade 1 
public class main{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        
        do{
            System.out.println("Olá! Que tal se cadatrar para verificar sua classe social? \nPor favor, digite o seu nome: ");
            pessoa.setName(scan.nextLine());
        } while(pessoa.getName().equals(""));

        System.out.println("\nInsira algum código para que possamos te identificar. \nFavor inserir somente números: ");
        pessoa.setCode(scan.nextInt());

        do{
            System.out.println("\n" + pessoa.getName() + ", qual o seu salário? ");
            pessoa.setPayment(scan.nextDouble());
            if(pessoa.getPayment() < 400){
                System.out.println("Hm... O valor mínimo para verificação é de R$400,00");
            }
        } while(pessoa.getPayment() < 400);
        
        System.out.println(pessoa.toString());
    }
}
/* 
Classe A2: maior que R$ 8.100

Classe B: maior que R$ 4.600

Classe C: maior que R$ 2.300

Classe D: maior que R$ 1.400

Classe E: maior que R$ 950

Classe F: maior que R$ 400
*/