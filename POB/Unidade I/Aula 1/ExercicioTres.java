import java.util.Scanner;

public class ExercicioTres {
	public static void main(String args[]) {
		int nota1, nota2, media;
		System.out.print("Insira a primeira nota: ");
		nota1 = new Scanner(System.in).nextInt();
		System.out.print("\n Insira a sgunda nota: ");
		nota2 = new Scanner(System.in).nextInt();
		media = (nota1 + nota2) / 2;
		System.out.printf("\n A media das notas eh: %d", media);
	}
}
