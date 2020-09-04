import java.util.ArrayList;

public class GetInArrei{
    public static void main(String[] args){
        //define um array list que recebe strings, sem ter um tamanho definido de índices
        ArrayList<String> times = new ArrayList<String>();
        //adiciona itens no array
        times.add("Flamengo");
        times.add("Santos");
        times.add("Barcelona");
        times.add("Real");
        times.add("Boca Jr");
        for(int i=0; i < times.size(); i++){
            String time = times.get(i);
            System.out.println("Esse eh o " + time + " na posicao " + i);
        }
    }
}