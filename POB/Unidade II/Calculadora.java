import java.util.Scanner;

public class Calculadora{
<<<<<<< HEAD
    public static void main(String[] args){
        System.out.println("Voce fara um \n[A]dicao \n[S]ubstracao \n[M]ultiplicacao \n[D]ivisao");
        recebeOperacao();
    }

    public static void recebeOperacao(){
        new Scanner(System.in).nextLine();
=======
    public static void main(String[] args){       
        double valorUm = lerDouble("Digite o valor 1: ");
        char operador = lerOperador("Digite o operador da operacao:\n + para adicacao\n - para subtracao\n / para divisao\n * para multiplicacao");
        double valorDois = lerDouble("Digite o valor 2: ");
        double resultado = 0;
        switch(operador){
            case '+' : resultado = soma(valorUm, valorDois);
            break;
            case '-' : resultado = subtrai(valorUm, valorDois);
            break;
            case '*' : resultado = multiplica(valorUm, valorDois);
            break;
            case '/' : resultado = divide(valorUm, valorDois);
            break;
        }
        
        System.out.println(valorUm + " " + operador + " " + valorDois + " = " + resultado);
   
    }

    public static double lerDouble(String texto){
        System.out.println(texto);
        return new Scanner(System.in).nextDouble();
    }

    public static char lerOperador(String operador){
        System.out.println(operador);
        return new Scanner(System.in).next().charAt(0);
    }

    public static double soma(double first, double second){
        return first + second;
    }

    public static double subtrai(double first, double second){
        return first - second;
    }
     public static double divide(double first, double second){
        return first/second;
    }

     public static double multiplica(double first, double second){
        return first*second;
>>>>>>> 8a94fbefb2f1def282ed8c4740c1c139f02ceb7d
    }
}