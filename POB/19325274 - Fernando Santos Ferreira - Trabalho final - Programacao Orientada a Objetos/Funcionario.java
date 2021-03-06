
public class Funcionario{

    Sysout sysout = new Sysout();
    ScannerMEU scanner = new ScannerMEU();

    //variables
    private String name;
    private String matricula;
    private String cpf;
    private double salario;
 
    public void cadastrar(){
        String name = scanner.lerString("Digite o nome do funcionario: ");
        if(name.equals("")){
            do{
                name = scanner.lerString("\nInput inválido. \nDigite o nome do funcionario: ");
            } while(name.equals(""));     
        } 
        setName(name);
        
        String matricula = scanner.lerString("\nDigite a matrícula deste funcionário:");
        if(matricula.equals("")){
            do{
                matricula = scanner.lerString("\nInput inválido. \nDigite a matrícula deste funcionário:");
            } while(matricula.equals(""));     
        }    
        setMatricula(matricula);
        
        String cpf = scanner.lerString("\nDigite o CPF deste funcionário: \nNão insira pontos e nem traços");
        if(cpf.equals("") || cpf.length() != 11){
            do{
                cpf = scanner.lerString("\nCPF inválido. \nDigite o CPF deste funcionário: \nNão insira pontos e nem traços");
            } while(cpf.equals("") || cpf.length() != 11);
        }
        setCpf(cpf);
        
        double salario = scanner.lerDouble("\nQual o salário deste funcionário?", "Valor inválido!\n", 1046, Double.MAX_VALUE);
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

    public double getImpostoDeRenda(){
        return 0;
        //este método será sobrescrito nas classes
    }
}