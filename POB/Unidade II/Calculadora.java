import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args){
        System.out.println("Voce fara um \n[A]dicao \n[S]ubstracao \n[M]ultiplicacao \n[D]ivisao");
        recebeOperacao();
    }

    public static void recebeOperacao(){
        new Scanner(System.in).nextLine();
    }
}