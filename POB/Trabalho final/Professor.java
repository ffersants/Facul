public class Professor{
    String name;
    int matricula;
    double salario;
    int cpf;
    int admissaoAno;

    public void setName(String name){
        this.name= name;
    }

    public String getName(){
        return name;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public int getMatricula(){
        return matricula;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return salario;
    }

    public void setCpf(int cpf){
        this.cpf = cpf;
    }

    public int getCpf(){
        return cpf;
    }

    public void setAdmissaoAno(int ano){
        this.admissaoAno = ano;
    }

    public int getAdmissaoAno(){
        return admissaoAno;
    }
}