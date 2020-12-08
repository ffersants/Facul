#include <stdio.h>
#include <stdlib.h>

//int main(){
//	
//	float salario;
//	printf("Qual o seu salario? ");
//	scanf("%f", &salario);
//	
//	float valorEmprestimo;
//	printf("\n Entre com o valor do emprestimo...");
//	scanf("%f", &valorEmprestimo);
//	
//	float valorMaxEmprestimo = (30.0 / 100.0) * salario;
//	
//	if(valorEmprestimo > valorMaxEmprestimo){
//		printf("Nao eh possivel realizar o emprestimo. O valor maximo eh %.2f", valorMaxEmprestimo);
//	}
//}

int main(){
	
	int salario = 800;
	int carrosMontados;
	
	printf("Quantos carros o funcionario auxiliou na montagem? ");
	scanf("%i", &carrosMontados);
	
	if(carrosMontados > 20 && carrosMontados < 50){
		int adicional = 150 * carrosMontados;
		printf("O funcionario recebera um total de %i.\nSendo assim, seu salario ficara em: %i.", adicional, salario + adicional);
	} else if (carrosMontados > 50){
		int adicional = carrosMontados * 250;
		printf("O funcionario recebera um total de %i.\nSendo assim, seu salario ficara em: %i.", adicional, salario + adicional);
	} else{
		printf("Producao inferior a 20 veiculos. Sem adicional.");
	}
	
}
