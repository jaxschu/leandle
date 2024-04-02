// Player class
public class Player 
{
    private String name;
    private int score;
    private int highest_score;

    public Player() 
    {
        // Default constructor
    }

    public Player(String name) 
    {
        this.name = name;
    }

    // Accessor methods
    public String getName() 
    {
        return name;
    }

    public int getScore() 
    {
        return score;
    }

    public int getHighestScore()
    {
        return highest_score;
    }

    // Mutator methods
    public void setName(String name) 
    {
        this.name = name;
    }

    public void setScore(int score) 
    {
        this.score = score;
    }

    //set the highest score
    public void setHighestScore(int high)
    {
        highest_score = high;
        if (high < highest_score)
        {
            this.highest_score = highest_score;
        }
        else
        {
            this.highest_score = high;
        }
    }

    // Return the state of the player as a string
    public String toString() 
    {
        return "Player: " + name + ", Score: " + score;
    }
}
