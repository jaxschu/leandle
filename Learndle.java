import java.util.*;

class Learndle
{
    //set parameters
    static Player playPerson = new Player();
    static WordLength wordLength = new WordLength();
    static String hidden_word = wordLength.getHiddenWord();
    static int word_len = wordLength.getGuessLength();
    static Scanner scan = new Scanner(System.in);
    static boolean isUsrValid = false;

    //to utilize guess function
    public static void Guess()
    {
        String guess = "guess";
        System.out.println("Guess the word now, word length is " + wordLength.getHiddenWordLen());
        //to get user input
        if (scan.hasNextLine())
        {
            guess = scan.nextLine();
        }
        //set temporary variables
        boolean correct_guess = false;
        int guess_time = 4;
        int attempts = 0;
        //loop to guess the word
        while (correct_guess == false)
        {
            if (guess.length() == hidden_word.length())
            {
                if (guess.equals(hidden_word))
                {
                    correct_guess = true;
                    System.out.println("Congrats! You win!");
                    //to set score and set the highest score
                    playPerson.setScore((guess_time-attempts)*10);
                    playPerson.setHighestScore(playPerson.getScore());
                    break;
                }
                else
                {
                    //use stringbuilder class to change the string
                    StringBuilder stringBuilder = new StringBuilder(guess);
                    System.out.println(hidden_word);
                    System.out.println(guess);
                    //to set the _ in the incorrect guess
                    for (int m=0;m<guess.length();m++)
                    {
                        if (guess.charAt(m) == hidden_word.charAt(m))
                        {
                            continue;
                        }
                        else if(guess.charAt(m) != hidden_word.charAt(m))
                        {
                            stringBuilder.setCharAt(m,'_');
                        }
                    }
                    correct_guess = false;
                    System.out.println(stringBuilder.toString());
                    guess_time = guess_time - 1;
                    attempts = attempts + 1;
                    //playPerson.setScore((guess_time - num_attempts)*10);
                    if (guess_time == 0)
                    {
                        System.out.println("Time out. You lose.");
                        playPerson.setScore(0);
                        playPerson.setHighestScore(playPerson.getScore());
                        break;
                    }
                    System.out.println("Guess the word now, word length is " + wordLength.getHiddenWordLen());
                    if (scan.hasNextLine())
                    {
                        guess = scan.nextLine();
                    }
                }
            }
            else
            {
                System.out.println("two words' length do not match.");
                break;
            }
        }
        System.out.println(playPerson.toString());
    }

    //function to get user name
    public static void getUsrName()
    {
        System.out.println("Enter player's name");
        System.out.println("with no upper case and within 8 characters: ");
        String usrName = "Unknown";
        usrName = scan.nextLine();
        //check if the user name is valid
        if (usrName.length() > 8)
        {
            isUsrValid = false;
        }
        else if (!usrName.equals(usrName.toLowerCase()))
        {
            isUsrValid = false;
        }
        else 
        {
            isUsrValid = true;
        }
        if (isUsrValid == true)
        {
            playPerson.setName(usrName);
            System.out.println(playPerson.toString());
        }
        else
        {
            System.out.println("invalid user name");
        }
    }

    //the main function in the game
    public static void main(String[] args)
    {
        System.out.println("The guess times is " + word_len);
        System.out.println("The hidden word is " + hidden_word);
        getUsrName();
        if (isUsrValid)
        {
            Guess();
            String to_play = "yes";
            //loop to play again
            while (to_play == "yes")
            {
                System.out.println("Want to play again? Enter yes to continue, otherwise abort");
                if (scan.hasNextLine())
                {
                    to_play = scan.nextLine();
                    if (to_play.equalsIgnoreCase("yes"))
                    {
                        Guess();
                        System.out.println("Highest Score is " + playPerson.getHighestScore());
                        continue;
                    }
                    else
                    {
                        System.out.println("User abort");
                        System.out.println("Highest Score is " + playPerson.getHighestScore());
                        break;
                    }
                }
            }
        }
        else
        {
            System.out.println("End Game");
        }
    }
}
