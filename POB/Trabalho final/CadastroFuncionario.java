import java.util.Scanner;
import java.util.ArrayList;

public class CadastroFuncionario{

        //ArrayList<Funcionario> funcionariosList = new ArrayList<Funcionario>();   

        public static Funcionario cadastrarFuncionario(){
            // ArrayList<Funcionario> funcionariosList = new ArrayList<Funcionario>();
            Sysout sysout = new Sysout();
            Scanner scanner = new Scanner(System.in);        
            String name;
            String matricula;
            String cpf;
            double salario;
            String cargoString = "null";

            //starts name
            sysout.consoleLog("Digite o nome do funcionario: ");
            name = scanner.nextLine();  
            
             if(name.equals("")){
                do{
                    sysout.consoleLog("Input vazio. \nFavor digitar um valor valido.");
                    name = new Scanner(System.in).nextLine();
                } while(name.equals(""));     
            } 
            //ends name
            //starts matricula
            sysout.consoleLog("Digite a matrícula deste funcionário:");
            matricula = scanner.nextLine();
            
             if(matricula.equals("")){
                do{
                    sysout.consoleLog("Input vazio. \nFavor digitar um valor valido.");
                    matricula = new Scanner(System.in).nextLine();
                } while(matricula.equals(""));     
            }    
            //ends matricula
            //starts cpf
            sysout.consoleLog("Digite o CPF deste funcionário:");
            cpf = scanner.nextLine();

            if(cpf.equals("")){
                do{
                    sysout.consoleLog("Input vazio. \nFavor digitar um valor valido.");
                    cpf = new Scanner(System.in).nextLine();
                } while(cpf.equals(""));
            }
            //ends cpf
            //starts salario
            sysout.consoleLog("Qual o salário deste funcionário?");
            salario = scanner.nextDouble();
    
            if(salario <= 0){
                do{
                    sysout.consoleLog("Input inválido. \nDigite um salário válido: ");
                    salario = new Scanner(System.in).nextDouble();
                } while (salario <= 0);
            }
            //ends salario

            sysout.consoleLog("Este funcionário é: \n[1] Diretor \n[2] Professor");
            int cargo = scanner.nextInt();
           
            while(cargo != 1 && cargo != 2){
                sysout.consoleLog("Input inválido. Favor selecionar somente uma das opções disponíveis. \nEste funcionário é: \n[1] Diretor \n[2] Professor");
                cargo = scanner.nextInt();
            }

            if(cargo == 1){
                cargoString = "Diretor";
            } else if (cargo == 2){
                cargoString = "Professor";
            }

            return new Funcionario(name, matricula, cpf, salario, cargoString);
            //sysout.consoleLog(funcionario.toString());
            //setFuncionario(funcionario);        
    }
}