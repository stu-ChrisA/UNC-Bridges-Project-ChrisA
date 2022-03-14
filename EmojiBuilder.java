import bridges.games.NonBlockingGame;
import bridges.base.NamedColor;
import bridges.base.NamedSymbol;

public class EmojiBuilder extends NonBlockingGame {
    // Grid must be less than 1024 cells total. The largest square grid is 32 x 32

    // class (static) variables -- numRows, numCols
    private static int numRows = 10; // change the numRows dimension if you would like
    //YOUR LINE OF CODE HERE:
    private static int numCols = 10;
    

    // constructor
    public EmojiBuilder(int assid, String login, String apiKey, int numRows, int numCols) {
        super(assid, login, apiKey, numRows, numCols);
        // set game title
        setTitle("Give you emoji a title");
        // Set a description which will show under the title
        setDescription("Give your emoji a description");
        // start method
        start();
    }

    //main method
    public static void main(String args[]) {
        // Create an EmojiBuilder object -- Don't forget to fill in your assignment number, username, and apiKey
        // (numRows and numCols values are passed in from the class variables above)
        EmojiBuilder emoji = new EmojiBuilder(1, "seight", "1025828236556", numRows, numCols);
    }

    // initialize
    public void initialize() {
        // Use nested loops to set the background color of your emoji
        // HINT: Remember that getBoardHeight() and getBoardWidth() exist for your use
        // YOUR CODE HERE:
        for(int row = 0; row < getBoardWidth(); row++)
        {
            for(int col = 0; col < getBoardHeight(); col++)
            {
                setBGColor(row,col, NamedColor.darkgreen);
            }
        }

        // use setBGColor calls for your emoji
        // for example:
        //setBGColor(2,3, NamedColor.darkmagenta);
        //setBGColor(2,5, NamedColor.darkmagenta);
        //YOUR CODE HERE:
        setBGColor(2,3,NamedColor.chocolate);
        setBGColor(2,6,NamedColor.chocolate);
        setBGColor(5,3,NamedColor.cyan);
        setBGColor(6,3,NamedColor.cyan);
        setBGColor(6,4,NamedColor.cyan);
        setBGColor(6,5,NamedColor.cyan);
        setBGColor(6,6,NamedColor.cyan);
        setBGColor(5,6,NamedColor.cyan);
        
    }

    // gameloop
    public void gameLoop() {
        //not used for this since only making the emoji drawing once
    }
} // end class

