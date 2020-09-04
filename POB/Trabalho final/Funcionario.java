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
    String name;
    String matricula;
    double salario;
    String cpf;
    String admissaoAno;

    public void setName(String name){
        if(name.equals("")){
            do{
                System.out.println("Input vazio. \nFavor digitar um valor valido.");
                name = new Scanner(System.in).nextLine();
            } while(name.equals(""));     
        } 
        this.name= name;
    }

            public String getName(){
                return name;
            }

    public void setMatricula(String matricula){
        if(matricula.equals("")){
            do{
                System.out.println("Input vazio. \nFavor digitar um valor valido.");
                matricula = new Scanner(System.in).nextLine();
            } while(matricula.equals(""));     
        } 
    
        this.matricula = matricula;
    }

            public String getMatricula(){
                return matricula;
            }

    public void setSalario(double salario){
        this.salario = salario;
    }

            public double getSalario(){
                return salario;
            }

    public void setCpf(String cpf){
        this.cpf = cpf;
        if(cpf.equals("")){
            do{
                System.out.println("Input vazio. \nFavor digitar um valor valido.");
                cpf = new Scanner(System.in).nextLine();
            } while(cpf.equals(""));
        }

        this.cpf = cpf;
    }

            public String getCpf(){
                return cpf;
            }
}