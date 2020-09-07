public class Professor extends Funcionario{
    int anoAdmissao;

    public int getAnoAdmissao(){
        return anoAdmissao;
    }

    public void setAnoAdmissao(int anoAdmissao){
        this.anoAdmissao = anoAdmissao;
    }

    private double getImpostoDeRenda(){
        return getSalario() * 0.20;
    }
}