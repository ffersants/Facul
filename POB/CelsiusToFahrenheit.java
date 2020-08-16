import java.util.Scanner; //Lembra do #include ? Faça esta associação por enquanto para conseguir ler.		      
  
public class CelsiusToFahrenheit{
    public static void main (String args[]){
  //inicio 
    int celsius;
    System.out.print("Informe uma temperatura em Celsius: ");
    celsius = new Scanner(System.in).nextInt( );// Comando grande, né? É só isso para ler um double
    float convertido;
    convertido = (celsius * 9/5) + 32;
    System.out.printf(" \n Em graus Fahrenheit, %d graus Celsius é igual a %f Fahrenheit", celsius, convertido);
  //fim 
  }
}