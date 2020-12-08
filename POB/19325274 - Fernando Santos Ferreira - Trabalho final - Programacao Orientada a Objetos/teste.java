import java.util.Calendar;
public class teste{
  public static void main(String args[]){
				
    //objeto professor
    Professor prof = new Professor();
    prof.setNome("João da Silva");
    prof.setCpf("165.812.493-60");
    prof.setSalario(8000);        
    prof.setTitulacao("MESTRE");
				
    //objeto administrativo 
    Administrativo adm = new Administrativo();
    // admitido em 1 de março de 2000
    Calendar dtAdmissao = Calendar.getInstance();
    dtAdmissao.set(Calendar.YEAR, 2000); //ano 2000
    dtAdmissao.set(Calendar.MONTH,Calendar.MARCH);//mês de março
    dtAdmissao.set(Calendar.DAY_OF_MONTH, 1);// dia 1
    adm.setDataAdmissao(dtAdmissao);
    System.out.println(adm.getDataAdmissao());
    adm.setNome("José da Sivva");
    adm.setCpf("877.388.152-05");
    adm.setSalario(1200);        
    adm.setDependentes(2);
				                
    //vamos falar de polimorfismo
    Funcionario f;
    f = prof; //atribuindo professor a funcionario
    System.out.println("Funcionário(a) "+f.getNome()+" tem direito de: R$ "+f.getGratificao());
    f = adm; //atribuindo administrativo a funcionario
    System.out.println("Funcionário(a) "+f.getNome()+" tem direito de: R$ "+f.getGratificao());
  }
}
class Funcionario {
  private String nome;
  private String cpf;
  private double salario; 
  public void setNome(String nome){
    this.nome = nome;
  }
  public String getNome(){
    return nome;
  }
  public void setCpf(String cpf){
    this.cpf = cpf;
  }
  public String getCpf(){
    return cpf;
  }
  public void setSalario(double salario){
    this.salario = salario;
  }
  public double getSalario(){
    return salario;
  }
  public double getGratificao(){
    return 0;//Já que depende do tipo fr funcionário para receber é 0
  }
}
class Professor extends Funcionario{//vinculo de herança
  private String titulacao;
  public void setTitulacao(String titulacao){
    this.titulacao = titulacao;
  }
  public String getTitulacao(){
    return titulacao;
  }
  public double getImpostoRenda(){
    return getSalario() * 0.15; //taxa fixa de 15% do salário
  }
				
  public double getGratificao(){
    //testando String
    if(getTitulacao().equalsIgnoreCase("ESPECIALISTA"))
        return getSalario() * 0.1;//10% para especialista
      else if(getTitulacao().equalsIgnoreCase("MESTRE"))
        return getSalario() * 0.12;//12% para mestre
      else if(getTitulacao().equalsIgnoreCase("DOUTOR"))
        return getSalario() * 0.15;//15% para doutor
      else
        return 0;//caso não seja identificado - 0
  }
}
class Administrativo extends Funcionario{//vínculo de herança
  private int dependentes;
  private Calendar dataAdmissao;
  public void setDependentes(int dependentes){
    this.dependentes = dependentes;
  }
  public int getDependentes(){
    return dependentes;
  }
  public double getContribuicaoSindical(){
    return getSalario() * 0.01; //taxa fixa de 1% do salario
  }
  public double getGratificao(){
    return getDiasTrabalhados() * .30;//30 centavos por cada dia trabalhado
  }
  public Calendar getDataAdmissao() {
    return dataAdmissao;
  }
  public void setDataAdmissao(Calendar dataAdmissao) {
    this.dataAdmissao = dataAdmissao;
  }
  //retorna a quantidade de dias trabalhado
  public int getDiasTrabalhados(){
    Calendar dtAtual = Calendar.getInstance();
    int MILLIS_IN_DAY = 86400000;//milisegundos de um dia
    return (int) ((dtAtual.getTimeInMillis() - getDataAdmissao().getTimeInMillis()) / MILLIS_IN_DAY);
  }
}