import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String userPrompt = "";
        String playerAInput = "";
        String playerBInput = "";
        boolean done1 = false;
        boolean done2 = false;
        boolean done3 = false;

        do {
        do
        {
            System.out.print("\nPlayer A, please enter your Rock, Paper, Scissors move (R, P, or S): ");
            playerAInput = in.nextLine();

            if(playerAInput.equalsIgnoreCase("R"))
                {
                    done1 = true;
                } else if(playerAInput.equalsIgnoreCase("P"))
                {
                    done1 = true;
                } else if(playerAInput.equalsIgnoreCase("S")) {
                    done1 = true;
                } else {
                    System.out.println("\nPlayer A, please enter R, P, or S. You entered: " + playerAInput + ".");
                    done1 = false;
                }
        }while(!done1);

        do
        {
            System.out.print("\nPlayer B, please enter your Rock, Paper, Scissors move (R, P, or S): ");
            playerBInput = in.nextLine();

            if(playerBInput.equalsIgnoreCase("R"))
            {
                done2 = true;
            } else if(playerBInput.equalsIgnoreCase("P"))
            {
                done2 = true;
            } else if(playerBInput.equalsIgnoreCase("S")) {
                done2 = true;
            } else {
                System.out.println("\nPlayer B, please enter R, P, or S. You entered: " + playerBInput + ".");
                done2 = false;
            }
        }while(!done2);


            if(playerAInput.equalsIgnoreCase("R")) {
                if(playerBInput.equalsIgnoreCase("R")){
                    System.out.println("\nBoth players chose Rock! It's a tie!");
                } else if(playerBInput.equalsIgnoreCase("P")){
                    System.out.println("\nPaper covers Rock! Player B wins!");
                } else {
                    System.out.println("\nRock breaks Scissors! Player A wins!");
                }
            } else if(playerAInput.equalsIgnoreCase("P")) {
                if(playerBInput.equalsIgnoreCase("R")){
                    System.out.println("\nPaper covers Rock! Player A wins!");
                } else if(playerBInput.equalsIgnoreCase("P")){
                    System.out.println("\nBoth players chose Paper! It's a tie!");
                } else {
                    System.out.println("\nScissors cuts Paper! Player B wins!");
                }
            } else {
                if(playerBInput.equalsIgnoreCase("R")){
                    System.out.println("\nRock breaks Scissors! Player B wins!");
                } else if(playerBInput.equalsIgnoreCase("P")){
                    System.out.println("\nScissors cuts Paper! Player A wins!");
                } else {
                    System.out.println("\nBoth players chose Scissors! It's a tie!");
                }
            }
            do {
                System.out.print("\nWould you like to play again? Enter Y or N: ");
                userPrompt = in.nextLine();

                if(userPrompt.equalsIgnoreCase("Y"))
                {
                    done3 = true;
                } else if(userPrompt.equalsIgnoreCase("N"))
                {
                    done3 = true;
                } else
                {
                    System.out.println("\nPlease enter Y or N. You entered: " + userPrompt + ".");
                    done3 = false;
                }
            }while(!done3);
        }while (userPrompt.equalsIgnoreCase("Y"));
    }
}