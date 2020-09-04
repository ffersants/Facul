/*
    https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
    Este código tem como objetivo apresentar a criação de um array list e a incrementação deste array
    fazendo uso do método .add()
*/

import java.util.ArrayList;

public class ArreiList{
    public static void main(String[] args){
        //define um array list que recebe strings, sem ter um tamanho definido de índices
        ArrayList<String> times = new ArrayList<String>();
        //adiciona itens no array
        times.add("Flamengo");
        times.add("Santos");
        System.out.println(times);
    }

    
}