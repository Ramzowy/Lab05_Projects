import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);




        System.out.print("Enter the party you are affiliated to (I,D,R); ");
        String partyAffiliation = in.nextLine();

        if (partyAffiliation.equalsIgnoreCase("R")) {
            System.out.println("You get a Democratic Donkey");
        } else if (partyAffiliation.equalsIgnoreCase("R")) {
            System.out.println("You get a Republican Elephant");

        } else if (partyAffiliation.equalsIgnoreCase("I")) {
            System.out.println("You get an Independent Man");

        } else {
            System.out.println("Invalid input!, Please try again");

        }


    }
}