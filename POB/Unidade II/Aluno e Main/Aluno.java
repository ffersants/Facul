 public class Aluno{
     String nome;
     double notaUm;
     double notaDois;
     public double getMedia(){
         return (notaUm + notaDois) / 2;
     }
     
     public String getNome() {
    	 return nome;
     }
     
     public void setNome(String nome) {
    	 this.nome = nome;
     }
     
     public double getNotaUm(){
    	 return notaUm;
     }
     
     public void setNotaUm(double notaUm) {
    	 this.notaUm = notaUm;
     }
     
     public double getNotaDois() {
    	 return notaDois;
     }
     
     public void setNotaDois(double notaDois) {
    	 this.notaDois = notaDois;
     }
     
     public void isAproved(int media) {
    	 if (getMedia() > media) {
 			 System.out.println("Aluno aprovado!");
 		} else {
 			 System.out.println("Aluno reprovado!");
 		}
     }
 }