import java.util.Scanner;
public class PrintAndGetInput{

    public static void main(String [] args){
    }
	public static int printAndGetInput(String mensagem){
		new Sysout(mensagem);
		return new Scanner(System.in).nextInt();
	}
}