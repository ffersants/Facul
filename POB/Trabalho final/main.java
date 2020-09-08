import java.util.Scanner;
import java.util.ArrayList;

public class main{
       
    public static void main(String[] args){
        ScannerMEU scanner = new ScannerMEU();
        Sysout sysout = new Sysout();
        ImpostoDeRenda imposto = new ImpostoDeRenda();
        Diretor diretor = new Diretor();
        Professor professor = new Professor();
        
        int decideLoop = scanner.lerInt("\nVamos começar! \nQuantos funcionários deseja cadastrar?", "\nInput inválido.\nDigite 0 caso deseje cadastrar nenhum funcionário.", 0, Integer.MAX_VALUE);
        int cargo = scanner.lerInt("\nVocê cadastrará: \n[1] Diretor \n[2] Professor", "\nInput inválido. \nFavor selecionar somente uma das opções disponíveis.", 1, 2);
        int decisao;
        do{
            if(cargo == 1){
                //DIRETOR
                for(int i = 1; i <= decideLoop; i++){

                    sysout.consoleLog("\n\nCadastrando o diretor " + (i));
                    // Diretor diretor = new Diretor();
                    diretor.cadastrar(); 
                    diretor.setTempoDeCasa(scanner.lerInt("\nHá quantos meses este funcionário trabalha nesta escola? ", "\nValor inválido!", 0, Integer.MAX_VALUE));
                    // ImpostoDeRenda imposto = new ImpostoDeRenda();
                    imposto.setPagantesTotal(i);
                    // //System.out.println("Pagantes total " + imposto.getPagantesTotal());
                    imposto.setImpostoTotal(diretor.getImpostoDeRenda());
                    // //System.out.println(imposto.getMediaImposto());
                }    
            } 
            else{
                //PROFESSOR
                for(int i = 1; i <= decideLoop; i++){
                    sysout.consoleLog("\n\nCadastrando o professor " + i);
                    // Professor professor = new Professor();
                    professor.cadastrar();
                    professor.setAnoAdmissao(scanner.lerInt("\nInforme o ano de admissão deste funcionário: ", "\nValor inválido!", 1930, 2020));
                    // ImpostoDeRenda imposto = new ImpostoDeRenda();
                    imposto.setPagantesTotal(i);
                    // //System.out.println("Pagantes total " + imposto.getPagantesTotal());
                    imposto.setImpostoTotal(diretor.getImpostoDeRenda());
                    // //System.out.println(imposto.getMediaImposto());
                }  
            }

            decisao = scanner.lerInt("\nUsuários cadastrados! Agora você deseja: \n[0] Sair do programa \n[1] Cadastrar novos funcionários \n[2] Verificar imposto de renda", "\nInput inválido. Favor selecionar somente uma das opções disponíveis.", 0, 2);
        } while(decisao == 1);

        if(decisao == 2){
            sysout.consoleLog("A média do imposto de renda é de R$" + imposto.getMediaImposto() +
                            "\nE o total a ser pago é o montante de R$" + imposto.getImpostoTotal() 
            );

        }

    } 
}