# Java :coffee:	
<quote> Códigos relacionados às matérias e aos projetos da faculdade.</quote>
```java

package helloworld;

public class HelloWorld{
	public static void main(String[] args) {
		System.out.print("Hello World!");
	}
}
```

<br>
<h2>:white_circle: Arrays</h2>
<br>
The things with arrays is just the declaring part, it's a little bit different from C and Javascript. Take a look... 
<br>

```java
public class TwoWaysOfDeclaringArrays{
	public static void main(String[] args) {
		int [ ] nums = new int [5]; 
			//or
		int [ ] numsDois = {0,0,0,0,0}; 
	}
}	
```

You see that the syntax is
<br> 
<strong>
	<i>
		varType [ ] varName = new varType [totalOfIndexes] 
	</i>
</strong>
<br>
	or
<br>
<strong>
	<i>
	 	varType [ ] varName = {elements, in, their, position};
	</i>
</strong>
<br>
<h2>:white_circle: Importing methods from classes in another file</h2>
I've just experienced this while I was working on the second exercises from the first class in the second unity. 
Those two .java file are stored in the same folder. 
<br>
<strong>First you create the class with the method that's going to be called in the other class file</strong>
<br>
```java
import java.util.Scanner;
public class PrintAndGetInput{

	public static void main(String [] args){
	}
	//this is the method that will be called
	public static int printAndGetInput(String mensagem){
		System.out.println(mensagem);
		return new Scanner(System.in).nextInt();
	}
}
```
<strong>Now you create a new class and call that method that's in the other class and you want to use</strong>
```java
public class CallMethodGetInput{
    public static void main(String[] args){
        //that's the main part,I'm creating a variable of reference to that method in the other class
        PrintAndGetInput callMethod = new PrintAndGetInput();
        int number = callMethod.printAndGetInput("Type a number: ");
        System.out.println("The number typed was... " + number);
    }
}
```
<br>
<h2>:heavy_exclamation_mark: Known Issues :heavy_exclamation_mark:</h2><br>
	<ul>
		<li> Don't use simple 'quotation marks';</li>
	</ul>
	<br>
			
			
