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
<h2>:white_circle: Conditionals / Flux control</h2><br>
The syntax of all conditionals is the same of Javascript and C, just in <strong>if/else</strong> statements you can't put the block of code between brackets. So it looks like this:<br>

```java
public class Teste{
    public static void main(String[] args){
        int num1 = 10, num2 = 20; 
	//no semicolon after the parenthesis
        if( num1 == num2)
            System.out.println("Iguais"); 
        if(num1 != num2) 
	//and neither bracket to hug the block of code
            System.out.println("Diferentes");
	else
            System.out.println("Whatever");
    }
}
```
<br>
<h4>:white_circle: Arrays</h4><br>
The things with arrays is just the declaring part, it's a little bit different from C and Javascript. Take a look: <br>
```java
public class TwoWaysOfDeclaringArrays{
	public static void main(String[] args) {
		int [ ] nums = new int [5]; 
			//or
		int [ ] numsDois = {0,0,0,0,0}; 
	}
}	
```
<br>
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
<h2>:heavy_exclamation_mark: Known Issues :heavy_exclamation_mark:</h2><br>
	<ul>
		<li> Don't use simple 'quotation marks';</li>
	</ul>
	<br>
			
			
