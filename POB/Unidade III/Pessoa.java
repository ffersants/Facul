public class Pessoa{
    private String name;
    private String code;
    private double payment;
    
    public void setName(String name){
        this.name = name;
    }

    public void setCode(String code){
        this.code = code;
    }

    public void setPayment(double payment){
        this.payment = payment;
    }
    //GET
    public String getName(){
        return name;
    }

    public String getCode(){
        return code;
    }

    public double getPayment(){
        return payment;
    }

    
}