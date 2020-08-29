import java.util.Scanner;

public class SegundoMetodo{
    //método principal
    public static void main(String[] args){
        double num = lerDouble("Informe um salario: ", "Opa, valor invalido!", 0, 1900);
        System.out.println(num);
    }

    public static double lerDouble(String mensagem, String msgError, double min, double max){
        double retorno; 
        do{
            retorno = lerDouble(mensagem);
            if(retorno < min || retorno > max){
                System.out.println(msgError);
            }
        } while (retorno < min || retorno > max);

        return retorno;
    }



    public static double lerDouble(String mensagem){
        System.out.println(mensagem);
        return lerDouble();
    }
   
    public static double lerDouble(){
        return new Scanner(System.in).nextDouble();
    }

    
}