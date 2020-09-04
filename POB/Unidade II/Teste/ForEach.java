/*
    Este código apresenta o loop foreach em Java, melhor do que ficar usando for e apontando índice incremental
    para assim resgatar individualmente os valores dentro de um array
*/

import java.util.ArrayList;

public class ForEach{
    public static void main(String[] args){
        //define um array list que recebe strings, sem ter um tamanho definido de índices
        ArrayList<String> times = new ArrayList<String>();
        //adiciona itens no array
        times.add("Flamengo");
        times.add("Santos");
        for(String time : times){
            System.out.println("O time da vez eh o " + time);
        }
    }
}