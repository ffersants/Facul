import java.util.Scanner;
public class HighestAndLowestNum {

   public static void main(String[] args) {

      int []nums = new int[5];
      int maior = nums[0];
      int menor = nums[0];
      double media;
      double soma = 0;
      int i;

      for (i = 0; i < nums.length; i++) {
        do {
            System.out.printf("Insira o "+(i+1)+ "° número inteiro:");
            nums[i] = new Scanner(System.in).nextInt();

            if (nums[i] > nums[maior]) {
                maior = i;
            }


            if (nums[i] < nums[menor]) {
            menor = i;
            }


            soma += nums[i];


            if(nums[i] < 0) {
                System.out.println("Valor inválido! Insira um número positivo!");
            }
            
        }while (nums[i] < 0);
      }

      media = soma/i;
      System.out.println("------------------------------------------");
      System.out.println("O menor valor dos números inseridos foi: "+nums[menor]);
      System.out.println("O maior valor dos números inseridos foi: "+nums[maior] );
      System.out.println("A média dos números inseridos foi: " +media);
   }
}

