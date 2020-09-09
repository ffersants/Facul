public class ImpostoDeRenda{
    private int pagantesTotal;
    private double impostoTotal;
    private double mediaImposto;

    public void setPagantesTotal(int i){
        this.pagantesTotal = i;
    }

  
    public void setImpostoTotal(double imposto){
         this.impostoTotal += imposto; 
     }

    public int getPagantesTotal(){
        return pagantesTotal;
    }


     public double getImpostoTotal(){
         return impostoTotal;
     }

     public double getMediaImposto(){
         return getImpostoTotal() / getPagantesTotal();  
     }
    
}