#include <stdlib.h>n
#include <stdio.h>
#include <locale.h>

main(){
	setlocale(LC_ALL, "Portuguese");
	int age;
	
	printf("Vamos descobrir em qual fase da vida você está?\nQuantos anos você tem? ");
	scanf("%i", &age);

	if(age <= 11){
		printf("Voce está na fase da infância.");
	} else if (age >= 12 && age <= 20){
		printf("Voce está na fase da adolescência.");
	} else if (age >= 21 && age <= 59){
		printf("Voce está na fase adulta.");
	} else if (age > 59) {
		printf("Você está na fase da velhice.");
	}	
}
