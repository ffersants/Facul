#include <stdio.h>
#include <stdlib.h>
#include <time.h>
int main() { 
  // Inicializa gerador de n�meros aleat�rios
  srand( time(0) ) ; 

  // Antes da corrida a dist�ncia percorrida por cada cavalo � zero
  int distanciaGarrucha = 0;
  int distanciaSoberano = 0;
  int distanciaValente = 0;
  int distanciaChampanhe = 0;

  // Captura 10 momentos da corrida
  for (int i=1; i <= 3; i++) {
     printf("---------------------------------\n") ;
     printf("Momento %i\n", i) ;

     // Atualiza distancia percorrida de cada cavalo
     distanciaGarrucha += (rand() % 50) + 1 ;
     distanciaSoberano += (rand() % 50) + 1 ;
     distanciaValente += (rand() % 50) + 1 ;
     distanciaChampanhe += (rand() % 50) + 1 ;

     // Mostra distancia percorrida por cada cavalo
     printf("- Garrucha percorreu %d metros\n", distanciaGarrucha) ;
     printf("- Soberano percorreu %d metros\n", distanciaSoberano) ;
     printf("- Valente percorreu %d metros\n", distanciaValente) ;
     printf("- Champanhe percorreu %d metros\n", distanciaChampanhe) ;
     _sleep(3000) ;    // No compilador online troque por sleep(3000) ;
  }

  printf("---------------------------------\n") ;
  printf("Fim da corrida!\n") ;

  // Verifica quem foi o vencedor da corrida

     char campeao[40];
     if (distanciaGarrucha > distanciaSoberano && distanciaGarrucha > distanciaValente && distanciaGarrucha > distanciaChampanhe){
     	char campeao[40] = "Garrucha";
	 } if(distanciaSoberano > distanciaValente && distanciaSoberano > distanciaChampanhe){
	 	char campeao[40] = "Soberano";
	 } if(distanciaValente > distanciaChampanhe){
	 	char campeao[40] = "Valente";
	 } else{
	 	char campeao[40] = "Champanhe";
	 }
  printf( "%s venceu a corrida!", campeao ); 
}
