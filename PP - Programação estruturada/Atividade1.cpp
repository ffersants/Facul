#include <stdio.h>
#include <string.h>

char cpf[20], tel[20], nome[100], genero[100], newGenre[20];
int bagagem[20];
float bagagemPeso[20];

int main(){
	printf("Qual seu nome?\n");
	scanf("%s", &nome);
	fflush(stdin);
	
	//GENERO INPUT
	printf("\n Qual o seu gênero? \n [M]asculino | [F]eminino | [O]utro \n");
	scanf("%s", genero);
	fflush(stdin);
	
	
	
	if(strcmp(genero, "M")==0){
		char newGenre[20] = "Masculino";
	} 
	else if (strcmp(genero, "m")==0) {
		char newGenre[20] = "Masculino";
	} 
	else if(strcmp(genero, "F")==0){
		char newGenre[20] = "Feminino";
	} 
	else if(strcmp(genero, "f")==0){
		char newGenre[20] = "Feminino";
	} 
	else if(strcmp(genero, "O")==0){
		char newGenre[20] = "Undefined";
	}
	else if(strcmp(genero, "o")==0){
		char newGenre[20] = "Undefined";
	}
	
	else{
		char genero [100] = "Undefined";
	}
	
	// /GENERO INPUT
	
	
	printf("\n Qual seu CPF? \n");
	scanf("%s", cpf);
	fflush(stdin);
	
	printf("\n Digite seu número: \n");
	scanf("%s", tel);
	fflush(stdin);
	
	printf("\n Quantas malas você está levando? \n");
	scanf("%d", &bagagem);
	fflush(stdin);
	
	printf("\n Qual o peso total da sua bagagem? \n");
	scanf("%f", &bagagemPeso);
	fflush(stdin);

	printf("Nome: %s\n", nome);
	printf("Genero: %s\n", genero);
	printf("CPF: %s\n", cpf);
	printf("Telefone: %s\n", tel);
}	

//char nome[256];
//
//
//int main(){	
//	printf("Qual seu nome?\n");
//	gets(nome);
//	printf("%s\n", nome);	
//}
