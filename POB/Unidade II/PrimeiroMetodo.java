public class PrimeiroMetodo{
    public static void main (String[] args){
        System.out.println("Esse código faz uso do método public static int somar para retornar a soma de dois valores");
        int firstValue = 25;
        int secondValue = 16;
        //chamada do método somar
        int total = somar(firstValue, secondValue);
        System.out.println(firstValue + " + " + secondValue + " = " + total);
    }
    //método static deve ser implementado fora do main e dentro da classe, devendo ser chamado pelo nome
    public static int somar(int valorUm, int valorDois){
        return valorUm + valorDois;
    }
}