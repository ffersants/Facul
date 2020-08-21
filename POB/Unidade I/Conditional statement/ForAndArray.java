public class ForAndArray{
    public static void main(String[] args){
        int [ ] numeros = new int [5];
        for( int i=0; i<numeros.length; i++){
            numeros[i] = i;
            System.out.println(numeros[i]);
        }
    }
}