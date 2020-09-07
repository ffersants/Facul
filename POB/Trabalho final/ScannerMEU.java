import java.util.Scanner;

@SuppressWarnings("all")
public class ScannerMEU{
    //INT
    public static int lerInt(){
        return new Scanner(System.in).nextInt();
    }

    public static int lerInt(String msg){
        System.out.println(msg);
        return lerInt();
    }
    public static int lerInt(String msg, String erro, int min, int max){
        int valor;
        boolean errado;
        do{
            valor = lerInt(msg);
            errado = valor < min || valor > max;
            if(errado){
                System.out.println(erro);
            } 
        } while(errado);
        return valor;
    }
    //DOUBLE
    public static double lerDouble(){
        return new Scanner(System.in).nextDouble();
    }
    public static double lerDouble(String msg){
        System.out.println(msg);
        return lerDouble();
    }
    public static double lerDouble(String msg, String erro, double min, double max){
        double valor;
        boolean errado;
        do{
            valor = lerDouble(msg);
            errado = valor < min || valor > max;
            if(errado){
                System.out.println(erro);
            } 
        } while(errado);

        return valor;
    }
    //STRING
    public static String lerString(){
        return new Scanner(System.in).nextLine();
    }

    public static String lerString(String msg){
        System.out.println(msg);
        return lerString();
    }

    //CHAR 
    public static char lerChar(){
        return lerString().charAt(0);
    }

    public static char lerChar(String msg){
        System.out.println(msg);
        return lerChar();
    }
}