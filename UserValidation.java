import java.util.*;

public class UserValidation {
    static boolean isUsrValid = false;
    static Player playPerson = new Player();
    //function to get user name
    public static void getUsrName()
    {
        System.out.println("Enter player's name");
        System.out.println("with no upper case and within 8 characters: ");
        String usrName = "Unknown";
        usrName = Learndle.scan.nextLine();

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
}
