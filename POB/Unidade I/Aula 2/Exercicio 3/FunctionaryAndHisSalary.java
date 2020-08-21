import java.util.Scanner;

public class FunctionaryAndHisSalary{
    public static void main(String[] args){
        System.out.println("Insert the functionary's name: ");
        String name = new Scanner(System.in).nextLine();
        
        System.out.println("Insert his salary: ");
        double salary = new Scanner(System.in).nextDouble();

        System.out.println("Insert his total sells: ");
        int totalSells = new Scanner(System.in).nextInt();

        float commition = totalSells / 100 * salary;

        System.out.println(commition);
    }
}