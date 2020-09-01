public class CallMethodGetInput{
    public static void main(String[] args){
        //that's the main part,I'm creating a variable of reference to that method in the other class
        PrintAndGetInput callMethod = new PrintAndGetInput();
        int number = callMethod.printAndGetInput("Type a number: ");
        System.out.println("The number typed was... " + number);
    }
}