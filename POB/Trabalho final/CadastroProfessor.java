// import java.util.Scanner;
// import java.util.ArrayList;

// public class CadastroProfessor{

//         //ArrayList<Funcionario> funcionariosList = new ArrayList<Funcionario>();   

//         public static Professor cadastrarProfessor(){
//             // ArrayList<Funcionario> funcionariosList = new ArrayList<Funcionario>();
//             Sysout sysout = new Sysout();
//             //Scanner scanner = new Scanner(System.in);
//             ScannerMEU scanner = new ScannerMEU();       
//             String name;
//             String matricula;
//             String cpf;
//             double salario;
//             int cargo;

//             name = scanner.lerString("Digite o nome do funcionario: ");
//             if(name.equals("")){
//                 do{
//                     name = scanner.lerString("Digite o nome do funcionario: ");
//                 } while(name.equals(""));     
//             } 
           
//             matricula = scanner.lerString("Digite a matrícula deste funcionário:");
//             if(matricula.equals("")){
//                 do{
//                     matricula = scanner.lerString("Digite a matrícula deste funcionário:");
//                 } while(matricula.equals(""));     
//             }    
          
//             cpf = scanner.lerString("Digite o CPF deste funcionário:");
//             if(cpf.equals("")){
//                 do{
//                     cpf = scanner.lerString("Digite o CPF deste funcionário:");
//                 } while(cpf.equals(""));
//             }
            
//             salario = scanner.lerDouble("Qual o salário deste funcionário?", "Valor inválido!", 1, Double.MAX_VALUE);
           
//             cargo = scanner.lerInt("Este funcionário é: \n[1] Diretor \n[2] Professor", "\nInput inválido. \nFavor selecionar somente uma das opções disponíveis. \nEste funcionário é: \n[1] Diretor \n[2] Professor", 1, 2);  
//             if(cargo = 1){
//                 System.out.println("SFIOPD");
//             } else if(cargo = 2){
//                 new Professor();
//             }
//             return new Professor(name, matricula, cpf, salario, cargo);
//     }
// }