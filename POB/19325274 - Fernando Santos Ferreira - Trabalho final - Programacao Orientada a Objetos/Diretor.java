public class Diretor extends Funcionario{

    private int tempoDeCasa;
    
    public void setTempoDeCasa(int tempoDeCasa){
        this.tempoDeCasa = tempoDeCasa;
    }
    @Override
    public double getImpostoDeRenda(){ 
       return getSalario() * 0.23;
    }
}
