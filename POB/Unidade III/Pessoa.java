public class Pessoa{
    private String name;
    private int code;
    private double payment;
    
    public void setName(String name){
        this.name = name;
    }

    public void setCode(int code){
        this.code = code;
    }

    public void setPayment(double payment){
        this.payment = payment;
    }
    //GET
    public String getName(){
        return name;
    }

    public int getCode(){
        return code;
    }

    public double getPayment(){
        return payment;
    }

    public String getClasse(){
        String classe = "";
        if(this.getPayment() > 400 && this.getPayment() <= 950){
            classe = "F";
        } else if(this.getPayment() > 950 && this.getPayment() <= 1400){
            classe = "E";
        } else if(this.getPayment() > 1400 && this.getPayment() <= 2300){
            classe = "D";
        } else if(this.getPayment() > 2300 && this.getPayment() <= 4600){
            classe = "C";
        } else if(this.getPayment() > 4600 && this.getPayment()  <= 8100){
            classe = "B";
        } else if(this.getPayment() > 8100 && this.getPayment() <= 14400){
            classe = "A2";
        } else{
            classe = "A1";
        }
        return classe;
    }

    @Override
    public String toString() {
    return ("\nNome: "+this.getName()+
            "\nCódigo de identificação: "+ this.getCode() +
            "\nSalario: R$" + this.getPayment() +
            "\nClasse social: " + this.getClasse()
            );
    }

}