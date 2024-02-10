import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int birthMonth = 0;
        String error = " ";

        System.out.print("Enter your birth month: ");
        if (in.hasNextInt()) {
            birthMonth = in.nextInt();
            in.nextLine();
            if (birthMonth >= 1 && birthMonth <= 12) {
                System.out.println("Your birth month is " + birthMonth);
            } else {
                System.out.println( birthMonth + " is not a valid birth month value");
            }

        }
        else{
                error = in.nextLine();
                System.out.println("Pleas enter a valid integer not " + error);
            }
        }



    }

