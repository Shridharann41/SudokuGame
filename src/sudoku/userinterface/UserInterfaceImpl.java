package sudoku.userinterface;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;

import javafx.stage.Stage;
import sudoku.problemdomain.Coordinates;
import sudoku.problemdomain.SudokuGame;

import java.util.HashMap;


/**
 * Manages the window, and displays a pop up notification when the user completes the puzzle.
 */

public class UserInterfaceImpl implements IUserInterfaceContract.View,
        EventHandler<KeyEvent> {
    private final Stage stage;
    private final Group root;

    //how do we keep track of 81 different text fields?

    //This HashMap stores the Hash Values (a unique identifier which is automatically generated;
    // see java.lang.object in the documentation) of each TextField by their Coordinates. When a SudokuGame
    //is given to the updateUI method, we iterate through it by X and Y coordinates and assign the values to the
    //appropriate TextField therein. This means we don't need to hold a reference variable for every god damn
    //text field in this app; which would be awful.
    //The Key (<Key, Value> -> <Coordinates, Integer>) will be the HashCode of a given InputField for ease of lookup

    private HashMap <Coordinates, SudokuTextField> textFieldCoordinates;
    private IUserInterfaceContract.EventListener listener;
    private static final double WINDOW_Y = 732;
    private static final double WINDOW_X = 668;
    private static final double BOARD_PADDING = 50;
    protected static final double BOARD_X_AND_Y = 576;

    private static final Color WINDOW_BACKGROUND_COLOR = Color.rgb(0, 150, 136);
    private static final Color BOARD_BACKGROUND_COLOR = Color.rgb(224, 242, 241);
    private static final String SUDOKU = "Sudoku";



    public UserInterfaceImpl(Stage stage, Group root) {
        this.stage = stage;
        this.root = new Group();
        this.textFieldCoordinates = new HashMap<>();
        initializeUserInterface();
    }

    private void initializeUserInterface() {
        drawBackground(root);
        drawTitle(root);
        drawSudokuBoard(root);
        drawTextFields(root);
        drawGridLines(root);
        stage.show();
    }

    private void drawGridLines(Group root) {
        int xAndY = 114;
        int index = 0;
        while (index < 8) {
            int thickness;

            if (index == 2 || 5) {
                thickness = 3;
            } else {
                thickness = 2;
            }

            Rectangle verticalLine = getLine(
                    xAndY + 64 * index,
                    BOARD_PADDING,
                    BOARD_X_AND_Y,
                    thickness

            );
        }
    }

    private void drawTextFields(Group root) {
    }

    private void drawSudokuBoard(Group root) {
    }

    private void drawTitle(Group root) {
    }

    private void drawBackground(Group root) {
    }


    @Override
    public void setListener(IUserInterfaceContract.EventListener listener) {
        this.listener = listener;

    }

    @Override
    public void updateSquare(int x, int y, int input) {

    }

    @Override
    public void updateBoard(SudokuGame game) {

    }

    @Override
    public void showDialog(String Message) {

    }

    @Override
    public void showError(String Message) {

    }

    @Override
    public void handle(KeyEvent keyEvent) {

    }
}


