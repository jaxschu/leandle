import java.util.Random;

//WordLength Class
public class WordLength 
{
    private String randWord = LearndleKeywords.generateRandomKeyword(generateRandomNum());

    public int generateRandomNum()
    {
        Random random = new Random();
        int randNum = random.nextInt(3) + 4;
        return randNum;
    }

    public WordLength()
    {
    }

    //to get the random word length minus one
    public int getGuessLength()
    {
        return randWord.length()-1;   
    }

    public int getHiddenWordLen()
    {
        return randWord.length();
    }

    public String getHiddenWord()
    {
        return randWord;
    }
}
