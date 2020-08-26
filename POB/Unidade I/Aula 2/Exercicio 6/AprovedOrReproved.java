import java.util.Scanner;
/*
Faça um programa Java que receba duas notas de um estudante em valores double. 
Na sequência, apresente todos os valores informados, a média, e se ele está aprovado ou reprovado. 
Detalhe: você não deve permitir que os valores informados como notas sejam inferiores a 0 ou superiores a 10. 
Para validação, use do/while.
*/
public class AprovedOrReproved{
    public static void main(String[] agrs){
        Scanner scan = new Scanner(System.in);
        double nota1, nota2;

        System.out.println("Insert the first note: ");
        nota1 = scan.nextDouble();
            while(nota1 < 0 || nota1 > 10){
                System.out.println("The input was invalid. Please insert a value greather than 0 and lesser than 10");
                System.out.println("Insert the first note: ");
                nota1 = scan.nextDouble();
            }

        System.out.println("Insert the second note: ");
        nota2 = scan.nextDouble();
            while(nota2 < 0 || nota2 > 10){
                System.out.println("The input was invalid. Please insert a value greather than 0 and lesser than 10");
                System.out.println("Insert the second note: ");
                nota2 = scan.nextDouble();
            }

        
        //media = 7;
        if((nota1 + nota2) / 2 < 7){
            System.out.println("This student has terribly failed hahaha...");
        } else{
            System.out.println("Great! This students has passed, congradulations!");
        }

    }
}