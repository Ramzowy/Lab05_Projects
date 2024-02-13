import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;

        System.out.print("Enter your birth month in digits: ");

        if (in.hasNextInt())
        {
            birthMonth = in.nextInt();
            in.nextLine();
            if (birthMonth >= 21)
            {
                System.out.println("You can get a wristband");
            } else
            {
                System.out.println("Sorry, you are still young");
            }
        } else
        {
            System.out.println("Please enter a valid birth month");
        }




    }
}