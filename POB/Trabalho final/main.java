import java.util.Scanner;
import java.util.ArrayList;

public class main{
        
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Sysout sysout = new Sysout();
        
        ArrayList<Funcionario> funcionariosList = new ArrayList<Funcionario>();
        
        sysout.consoleLog("Selecione uma das opções a seguir: \n[1] Cadastrar funcionario \n[2]Verificar imposto de renda");
        int input = scanner.nextInt();
        
        while(input != 1 && input != 2){
            sysout.consoleLog("Input inválido. Favor selecionar somente uma das opções disponíveis.\nSelecione uma das opções a seguir: \n[1] Cadastrar funcionario \n[2]Verificar imposto de renda");
            input = scanner.nextInt();
        }

        if(input == 1){
             sysout.consoleLog("Quantos funcionários deseja cadastrar?");
             int decideLoop = scanner.nextInt();
             while(decideLoop < 0){
                sysout.consoleLog("Input inválido.\nDigite 0 caso deseje cadastrar nenhum funcionário.\nQuantos funcionários deseja cadastrar?");
                decideLoop = scanner.nextInt();
             }
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