
public class FahrenheintToCelsius{
    public static void main(String[] args){
        //importando método de outra classe
        BillsAndInterest billsAndInterest = new BillsAndInterest();
        double celsius = billsAndInterest.getInput("Passa o celsius: ");
        double celsiusInFah = convertCelsius(celsius);
        System.out.println(celsius + " em graus Fahrenheint eh igual a " + celsiusInFah); 
    }

    public static double convertCelsius(double celsius){
        return celsius * 9/5 + 32;
    }
}