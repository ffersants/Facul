import java.util.Scanner;

public class main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        menu();
    }

     static void menu(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione uma das opções a seguir: \n[1] Cadastrar funcionario \n[2]Verificar imposto de renda");
        
        if(scanner.nextLine().equals("1")){
            cadastrarFuncionario();
        } else if(scanner.nextLine().equals("2")){
            System.out.println("getImposto");
        }
    }

     static void cadastrarFuncionario(){
        Scanner scanner = new Scanner(System.in);
        Funcionario fulana = new Funcionario();
        
        System.out.println("Digite o nome do funcionario: ");
        fulana.setName(scanner.nextLine());  
        
        System.out.println("Digite a matrícula do " + fulana.getName());
        fulana.setMatricula(scanner.nextLine());
        
        System.out.println("Qual o salário do " + fulana.getName() + "?");
        fulana.setSalario(scanner.nextDouble());
        System.out.println(fulana.getSalario());
  
        System.out.println("Digite o CPF do " + fulana.getName());
        fulana.setCpf(scanner.nextLine());
    }
}