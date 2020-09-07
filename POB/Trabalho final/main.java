import java.util.Scanner;
import java.util.ArrayList;

public class main{
        
    public static void main(String[] args){
        ScannerMEU scanner = new ScannerMEU();
        Sysout sysout = new Sysout();
       
        
        ArrayList<Funcionario> funcionariosList = new ArrayList<Funcionario>();
       
        //int input = scanner.lerInt("\nSelecione uma das opções a seguir: \n[1] Cadastrar funcionario \n[2]Verificar imposto de renda", "\nInput inválido. Favor selecionar somente uma das opções disponíveis.", 1, 2);

        int cargo = scanner.lerInt("\nVocê cadastrará: \n[1] Diretor \n[2] Professor", "\nInput inválido. Favor selecionar somente uma das opções disponíveis.", 1, 2);
        int decideLoop = scanner.lerInt("Quantos funcionários deseja cadastrar?", "\nInput inválido.\nDigite 0 caso deseje cadastrar nenhum funcionário.", 0, 100);
        
        if(cargo == 1){
            //DIRETOR
            for(int i = 1; i != decideLoop; i++){
                sysout.consoleLog("\n\nCadastrando o diretor " + (i));
                Diretor diretor = new Diretor();
                diretor.cadastrar(); 
                diretor.setTempoDeCasa(scanner.lerInt("Há quantos meses este funcionário trabalha nesta escola? ", "\nValor inválido!", 0, Integer.MAX_VALUE));
               
                ImpostoDeRenda imposto = new ImpostoDeRenda();
                imposto.setPagantesTotal(i);
                System.out.println("Pagantes total " + imposto.getPagantesTotal());
                imposto.setImpostoTotal(diretor.getImpostoDeRenda());
                System.out.println(imposto.getMediaImposto());
            }

        } 
        else{
            //PROFESSOR
            for(int i = 0; i != decideLoop; i++){
                sysout.consoleLog("\n\nCadastrando o professor " + (i + 1));
                Professor professor = new Professor();
                professor.cadastrar();
                professor.setAnoAdmissao(scanner.lerInt("Informe o ano de admissão deste funcionário: ", "\nValor inválido!", 1930, 2020));
            }  
        }
        

        //  for(Funcionario seila : funcionariosList){
        //     System.out.println(seila.getSalario());
        //     System.out.println(seila.getImpostoDeRenda(seila.getSalario()));
        //  }    

    }
}