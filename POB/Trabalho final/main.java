import java.util.Scanner;
import java.util.ArrayList;

public class main{
        
    public static void main(String[] args){
        ScannerMEU scanner = new ScannerMEU();
        Sysout sysout = new Sysout();
       
        
        ArrayList<Funcionario> funcionariosList = new ArrayList<Funcionario>();
       
        int input = scanner.lerInt("Input inválido. Favor selecionar somente uma das opções disponíveis.\nSelecione uma das opções a seguir: \n[1] Cadastrar funcionario \n[2]Verificar imposto de renda", "Input inválido. Favor selecionar somente uma das opções disponíveis.\nSelecione uma das opções a seguir: \n[1] Cadastrar funcionario \n[2]Verificar imposto de renda", 1, 2);

        if(input == 1){
             int decideLoop = scanner.lerInt("Quantos funcionários deseja cadastrar?", "Input inválido.\nDigite 0 caso deseje cadastrar nenhum funcionário.", 0, 100);
    
             for(int i = 0; i != decideLoop; i++){
                 sysout.consoleLog("\n\nCadastrando o funcionario " + (i + 1));
                 Funcionario funcionario = new CadastroFuncionario().cadastrarFuncionario();
                 funcionariosList.add(funcionario);
             }
        } else if(input == 2){
                sysout.consoleLog("getImposto");
        }  

        for(Funcionario seila : funcionariosList){
            sysout.consoleLog(seila.toString());
        }    

    }
}