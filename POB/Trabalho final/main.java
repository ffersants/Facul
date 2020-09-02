import java.util.Scanner;

public class main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        Professor fulana = new Professor();
        
        System.out.println("Qual o seu nome? "); 
        fulana.setName(scanner.nextLine());

        System.out.println(fulana.getName() + ", digite sua matricula: ");
        fulana.setMatricula(scanner.nextInt());

        System.out.println(fulana.getName() + ", digite o seu CPF: ");
        fulana.setCpf(scanner.nextInt());

        System.out.println(fulana.getName() + ", qual o seu salario? ");
        fulana.setSalario(scanner.nextDouble());
        
        //System.out.println(fulana.getMatricula());
    }
}