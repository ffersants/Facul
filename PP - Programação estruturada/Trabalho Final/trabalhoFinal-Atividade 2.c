#include <stdlib.h>n
#include <stdio.h>
#include <locale.h>

main(){
	setlocale(LC_ALL, "Portuguese");
	int age;
	
	printf("Vamos descobrir em qual fase da vida voc� est�?\nQuantos anos voc� tem? ");
	scanf("%i", &age);

	if(age <= 11){
		printf("Voce est� na fase da inf�ncia.");
	} else if (age >= 12 && age <= 20){
		printf("Voce est� na fase da adolesc�ncia.");
	} else if (age >= 21 && age <= 59){
		printf("Voce est� na fase adulta.");
	} else if (age > 59) {
		printf("Voc� est� na fase da velhice.");
	}	
}
