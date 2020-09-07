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
    
    //variables
    private String name;
    private String matricula;
    private String cpf;
    private double salario;
    
    ///////////////////////////CONSTRUCTOR///////////////////////////

    public Funcionario(String name, String matricula, String cpf, double salario){
        setName(name);
        setMatricula(matricula);
        setCpf(cpf);
        setSalario(salario);
    };

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

     @Override
                public String toString() {
                return ("Name: "+this.getName()+
                        "\nMatricula: "+ this.getMatricula() +
                        "\nCPF: " + this.getCpf() +
                        "\nSalario: " + this.getSalario()
                        );
                }
}