#include <stdlib.h>
#include <stdio.h>

int main() {
  
  int linha, coluna, i1, i2, i3;
  int matrizA[3][4] ;//3 linhas e 4 colunas, e 4 linhas e 3 colunas
  
  for (i1 = 0; i1 < 4; i1++)//preenche primeira linha
  {
  	printf("Linha 1, Coluna %i \n", i1);
    printf("Digite o valor da matriz na linha 1, coluna %i: ", i1);
    scanf("%i", &matrizA[0][i1]); 
  }
  
  	printf("-----------------------------------------------------------------------------------------\n");
  
	for (i2 = 0; i2 < 4; i2++)//preenche a segunda linha
	{
		printf("Linha 2, Coluna %i \n", i2);
   		printf("Digite o valor da matriz na linha 1, coluna %i: ", i2);
    	scanf("%i", &matrizA[1][i2]); 
	}  
	
	 printf("-----------------------------------------------------------------------------------------\n");
	
	for (i3 = 0; i3 < 4; i3++)//preenche a terceira linha
	{
		printf("Linha 2, Coluna %i \n", i3);
   		printf("Digite o valor da matriz na linha 1, coluna %i: ", i3);
    	scanf("%i", &matrizA[2][i3]); 
	}  
	
	 printf("-----------------------------------------------------------------------------------------\n MATRIZ A: 4x3 \n");
	
	for( linha = 0; linha < 3; linha++){
		for(coluna = 0; coluna < 4; coluna++){
			printf(" %i ", matrizA[linha][coluna]);
		}
		printf("\n");
	}
	
	printf("-----------------------------------------------------------------------------------------\n MATRIZ T: 4x3 \n");	
	
	for( linha = 0; linha < 2; linha++){
		for(coluna = 0; coluna < 3; coluna++){
			printf(" %i ", matrizA[linha][coluna]);
		}
		printf("\n");
	}
}
    
  

