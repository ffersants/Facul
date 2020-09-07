import java.util.Scanner;
import java.util.ArrayList;

public class CadastroFuncionario{

        //ArrayList<Funcionario> funcionariosList = new ArrayList<Funcionario>();
    
        public static void main(String[] args){
            
        }

        public static void cadastrarFuncionario(){
            // ArrayList<Funcionario> funcionariosList = new ArrayList<Funcionario>();
            Scanner scanner = new Scanner(System.in);        
            String name;
            String matricula;
            String cpf;
            double salario;

            //starts name
            System.out.println("Digite o nome do funcionario: ");
            name = scanner.nextLine();  
            
             if(name.equals("")){
                do{
                    System.out.println("Input vazio. \nFavor digitar um valor valido.");
                    name = new Scanner(System.in).nextLine();
                } while(name.equals(""));     
            } 
            //ends name
            //starts matricula
            System.out.println("Digite a matrícula deste funcionário:");
            matricula = scanner.nextLine();
            
             if(matricula.equals("")){
                do{
                    System.out.println("Input vazio. \nFavor digitar um valor valido.");
                    matricula = new Scanner(System.in).nextLine();
                } while(matricula.equals(""));     
            }    
            //ends matricula
            //starts cpf
            System.out.println("Digite o CPF deste funcionário:");
            cpf = scanner.nextLine();

            if(cpf.equals("")){
                do{
                    System.out.println("Input vazio. \nFavor digitar um valor valido.");
                    cpf = new Scanner(System.in).nextLine();
                } while(cpf.equals(""));
            }
            //ends cpf
            //starts salario
            System.out.println("Qual o salário deste funcionário?");
            salario = scanner.nextDouble();
    
            if(salario <= 0){
                do{
                    System.out.println("Input inválido. \nDigite um salário válido: ");
                    salario = new Scanner(System.in).nextDouble();
                } while (salario <= 0);
            }
            //ends salario

            System.out.println("Este funcionário é: \n[1] Diretor \n[2] Professor");
            int cargo = scanner.nextInt();

            while(cargo != 1 && cargo != 2){
                System.out.println("Input inválido. Favor selecionar somente uma das opções disponíveis. \nEste funcionário é: \n[1] Diretor \n[2] Professor");
                cargo = scanner.nextInt();
            }

            if(cargo == 1){
                System.out.println("Diretor");
            } else if (cargo == 2){
                System.out.println("Professor"); 
            }

            Funcionario funcionario = new Funcionario(name, matricula, cpf, salario);
            System.out.println(funcionario.toString());
            //setFuncionario(funcionario);        
    }
}