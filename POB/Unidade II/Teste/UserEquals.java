/*
    Essa classe tem como único objetivo apresentar a maneira ideal de comparar variáveis do tipo primitivo String,
    usando o método .equals()
*/

public class UserEquals{
    static public void main(String[] args){
        String a = new String("Java");
        String b = new String("Java");

        if(a.equals(b)){
            System.out.println("True -> Same value");
        } else{
            System.out.println("False -> Different value");
        }
    }
}