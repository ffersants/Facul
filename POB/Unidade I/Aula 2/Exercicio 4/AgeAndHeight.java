import java.util.Scanner;
import java.util.Locale;

public class AgeAndHeight{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] idade = new int[9];
        double[] altura = new double[9];
        int total = 0;
        double moreThanFifty = 0;

        for(int person = 0; person <= 2; person++ ){
            System.out.println("Digite a idade da pessoa " + (person + 1));
            idade[person] = scan.nextInt();
             
            System.out.println("Digite a altura da pessoa " + (person + 1));
            altura[person] = scan.useLocale(Locale.US).nextDouble();
            
            if(idade[person] > 50){
                moreThanFifty += altura[person];
                total++;
            }
        }//for ends

        double media = moreThanFifty / total;
        System.out.println("A média é de " + media);  
    }
}