import java.util.Scanner;
import java.util.ArrayList;

public class main{
        
    public static void main(String[] args){
        ScannerMEU scanner = new ScannerMEU();
        Sysout sysout = new Sysout();
       
        
        ArrayList<Funcionario> funcionariosList = new ArrayList<Funcionario>();
       
        int input = scanner.lerInt("Selecione uma das opções a seguir: \n[1] Cadastrar funcionario \n[2]Verificar imposto de renda", "\nInput inválido. Favor selecionar somente uma das opções disponíveis.", 1, 2);

        if(input == 1){
             int decideLoop = scanner.lerInt("Quantos funcionários deseja cadastrar?", "\nInput inválido.\nDigite 0 caso deseje cadastrar nenhum funcionário.", 0, 100);
    
             for(int i = 0; i != decideLoop; i++){
                 sysout.consoleLog("\n\nCadastrando o funcionario " + (i + 1));
                 Funcionario funcionario = new CadastroFuncionario().cadastrarFuncionario();
                 funcionariosList.add(funcionario);
             }
        } else if(input == 2){
                sysout.consoleLog("getImposto");
        }  

         for(Funcionario seila : funcionariosList){
            System.out.println(seila.getSalario());
            System.out.println(seila.getImpostoDeRenda(seila.getSalario()));
         }    

    }
}