public class Main{
	public static void main(String [] args) {
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Fernando");
		aluno1.setNotaUm(3);
		aluno1.setNotaDois(6);
		//passar como parâmetro o valor da média
		aluno1.isAproved(3);
	}
}