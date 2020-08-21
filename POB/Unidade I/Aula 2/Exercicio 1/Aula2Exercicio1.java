import java.util.Scanner;

public class Aula2Exercicio1{
	public static void main(String[] args) {
		double salary;
		int childrenAge;
		String hasHealthPlan;
		
		System.out.printf("Insert your salary: ");
		salary = new Scanner(System.in).nextDouble();
		
		System.out.printf("\nHow old is the children? ");
		childrenAge = new Scanner(System.in).nextInt();
		
		System.out.printf("\nDo you have health plan?\n[Y]es or [N]o\n");
		hasHealthPlan = new Scanner(System.in).nextLine();
		
		System.out.printf("His salary is: %f \nHe has health care? %s \nHow old is the girl? %d", salary, hasHealthPlan, childrenAge);
	}
}