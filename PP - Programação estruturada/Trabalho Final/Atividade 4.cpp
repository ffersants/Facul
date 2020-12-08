#include <stdlib.h>
#include <stdio.h>
#include <locale.h>

float calcularVOut(float r1, float r2, float vIn){
	float vOut;
	vOut = vIn * r2 / (r1 + r2);
	
	return vOut;
}

int main (){
	setlocale(LC_ALL, "Portuguese");
	float r1, r2, vIn, resultado;
	
	printf("Digite o valor de r1:");
	scanf("%f", &r1);
	printf("\nDigite o valor de r2:");
	scanf("%f", &r2);
	printf("\nDigite o valor de vIn:");
	scanf("%f", &vIn);
	
	resultado = calcularVOut(r1, r2, vIn);
	
	printf("O valor da tensão de saida é: %f", resultado);
}


