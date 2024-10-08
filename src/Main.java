import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String userPrompt = "";
        String playerAInput = "";
        String playerBInput = "";
        String trash = "";
        boolean done1 = false;
        boolean done2 = false;

        do
        {
            System.out.print("Player A, please enter your Rock, Paper, Scissors move (R, P, or S): ");
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
                    System.out.println("Please enter R, P, or S. You entered: " + playerAInput + ".");
                }
        }while(!done1);


        do
        {



            System.out.print("\n\nPlayer B, please enter your Rock, Paper, Scissors move (R, P, or S): ");

        }while (userPrompt.equalsIgnoreCase("Y"));

        //		do
        //output “Player A, please enter your Rock, Paper, Scissors move (R, P, or S): ”
        //			input playerAInput
        //output “Player B, please enter your Rock, Paper, Scissors move (R, P, or S): ”
        //			input playerBInput
        //			if playerAInput == “R” then
        //				if playerBInput == “R” then
        //					output “Both players chose Rock; it’s a tie!”
        //				else if playerBInput == “P” then
        //					output “Paper beats Rock; Player B wins!”
        //				else if playerBInput == “S” then
        //					output “Rock beats Scissors; Player A wins!”
        //				else
        //output “Player B entered an invalid input: ” + playerBInput
        //				endIf
        //			else if playerAInput == “P” then
        //				if playerBInput == “R” then
        //					output “Paper beats Rock; Player A wins!”
        //				else if playerBInput == “P” then
        //output “Both players chose Paper; it’s a tie!”
        //				else if playerBInput == “S” then
        //					output “Scissors beats Paper; Player B wins!”
        //				else
        //output “Player B entered an invalid input: ” + playerBInput
        //				endIf
        //			else if playerAInput == “S” then
        //				if playerBInput == “R” then
        //					output “Rock beats Scissors; Player B wins!”
        //				else if playerBInput == “P” then
        //output “Scissors beats Paper; Player A wins!”
        //				else if playerBInput == “S” then
        //output “Both players chose Scissors; it’s a tie!”
        //				else
        //output “Player B entered an invalid input: ” + playerBInput
        //				endIf
        //			else
        //output “Player A entered an invalid input: ” + playerAInput
        //			endIf
        //			output “Would you like to keep playing? Enter Y or N: ”
        //			input userPrompt
        //		while userPrompt == “Y”
    }
}