/*
    Todo funcionario deverá ter;
    String nome
    String matricula 
    String cpf
    Double salario
*/

import java.util.Scanner;
import java.lang.Double; 


public class Funcionario{
    
    Sysout sysout = new Sysout();
    ScannerMEU scanner = new ScannerMEU();

    //variables
    private String name;
    private String matricula;
    private String cpf;
    private double salario;
    ///////////////////////////CONSTRUCTOR///////////////////////////
    public void cadastrar(){
        String name = scanner.lerString("Digite o nome do funcionario: ");
        if(name.equals("")){
            do{
                name = scanner.lerString("Digite o nome do funcionario: ");
            } while(name.equals(""));     
        } 
        setName(name);
        
        String matricula = scanner.lerString("Digite a matrícula deste funcionário:");
        if(matricula.equals("")){
            do{
                matricula = scanner.lerString("Digite a matrícula deste funcionário:");
            } while(matricula.equals(""));     
        }    
        setMatricula(matricula);
        
        String cpf = scanner.lerString("Digite o CPF deste funcionário:");
        if(cpf.equals("")){
            do{
                cpf = scanner.lerString("Digite o CPF deste funcionário:");
            } while(cpf.equals(""));
        }
        setCpf(cpf);
        
        double salario = scanner.lerDouble("Qual o salário deste funcionário?", "Valor inválido!", 1, Double.MAX_VALUE);
        setSalario(salario);
    }
    ///////////////////////////SET AREA//////////////////////////////

    public void setName(String name){
        this.name= name;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public void setSalario(Double salario){
        this.salario = salario;
    }

    public void setCpf(String cpf){        
        this.cpf = cpf;
    }

///////////////////////////GET AREA//////////////////////////////

    public String getName(){
        return name;
    }
    public String getMatricula(){
        return matricula;
    }
    public double getSalario(){
        return salario;
    }
    public String getCpf(){
        return cpf;
    }

    private double getImpostoDeRenda(){
        return 0;
        //este método será sobrescrito nas classes
    }

     @Override
                public String toString() {
                return ("Name: "+this.getName()+
                        "\nMatricula: "+ this.getMatricula() +
                        "\nCPF: " + this.getCpf() +
                        "\nSalario: " + this.getSalario()
                        );
                }
}