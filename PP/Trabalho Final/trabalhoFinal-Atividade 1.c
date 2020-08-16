#include <stdlib.h>
#include <stdio.h>
#include <locale.h>

int main (){
	setlocale(LC_ALL, "Portuguese");
	float r1, r2, vIn, vOut;
	
	
	printf("Digite o valor de r1:");
	scanf("%f", &r1);
	printf("\nDigite o valor de r2:");
	scanf("%f", &r2);
	printf("\nDigite o valor de vIn:");
	scanf("%f", &vIn);
	
	vOut = vIn * r2 / (r1 + r2);
	
	printf("O valor da tensão de saida é: %f \n", vOut);
	
	
}

