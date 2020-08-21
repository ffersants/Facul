public class While_If_DifferentOperator{
    public static void main(String[] args){
        String searchedName = "Ana";
        String [ ] names = {"Fernando", "Ana", "Ricardo", "Estela"};
        System.out.println("You're looking for " + searchedName);
        for( int i=0; i<names.length; i++){
            if(names[i] == searchedName)
                System.out.println("You just found the person, that's " + searchedName + "!");
            else
                System.out.println(names[i] + " is not who you're looking for...");
        }
    }
}