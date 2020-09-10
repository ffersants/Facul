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

<br>

I've just experienced this while I was working on the second exercises from the first class in the second unity. 
Those two java file are stored in the same folder. 
<br>
First you create the class with the method that's going to be called in the other class file

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
Now you create a new class and call that method that's in the other class and you want to use
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

<h2>:white_circle: Comparing strings</h2>

<br>

The following code must return true or false?
```java
 String a = new String("Java");
 String b = new String("Java");

        if(a == b){
            System.out.println("True -> Same value");
        } else{
            System.out.println("False -> Different value");
        }
```
Well, the answear is <strong>FALSE</strong>! And what about this next one?
```java
String a = "Java";
String b = "Java";

        if(a == b){
            System.out.println("True -> Same value");
        } else{
            System.out.println("False -> Different value");
        }
```
The answear for the last is <strong>TRUE</strong>!
<br><br>
But whaaat?! Aren't they the same values??? Well... In the first case they were the same memory address while in the next they were different objects and most important also in different memory address. That's why it returned FALSE.
<br><br>
So now you might be worring... <strong>Which one is the right way to compare things between themselves? Use the method .equals() that belongs tot the class String, that can be checked <a href="https://docs.oracle.com/javase/7/docs/api/java/lang/String.html">here</a></strong>
```java Object.equals(Object)```
That's the right way of doing it. The following code will now return <strong>True -> Same value</strong>
```java
String a = new String("Java");
String b = new String("Java");
//attention now
        if(a.equals(b)){
            System.out.println("True -> Same value");
        } else{
            System.out.println("False -> Different value");
        }
```

<br><h2>:heavy_exclamation_mark: To remember :heavy_exclamation_mark:</h2>
	<ul>
		<li><strong>new Object();</srtrong> it calls the constructor method of that class and intances an object that's attributed to the 			variable declared</li>
		<li><strong>new Aluno( );</strong> é a instanciação de um objeto</li>
		<li><strong>new Aluno[3];</strong> é instanciação de um array de objetos</li>
		<li><strong>.size();</strong> When dealing with array list, the property length won't be able for you to discover the total of 				indexes in the array, cause in this case you must use the method <strong>.size()</strong> from the from the 					java.util.ArrayList package 
		</li>
		<li>
			 Java possui <strong>3 modificadores de acesso</strong><br>
			 • private<br> 
			 • protected<br>
			 • public <br> 
			E também <strong>4 níveis de acesso</strong><br> 
			• na própria classe (private)<br>
			• por pacote ou herança (protected)<br>
			• de qualquer lugar (public)<br>
			• somente por pacote (default, sem declaração)<br>
	</ul>
<br>

<br>
<h2>:heavy_exclamation_mark: Known Issues :heavy_exclamation_mark:</h2>
<br>
	<ul>
		<li> Don't use simple 'quotation marks';</li>
	</ul>
	<br>
			
			
