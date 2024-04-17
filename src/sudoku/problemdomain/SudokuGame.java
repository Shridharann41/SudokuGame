package sudoku.problemdomain;

import sudoku.constants.GameState;

import java.io.Serializable;

public class SudokuGame implements Serializable {
    private final GameState gameState;
    private final int[][] gridState;

    public static final int GRID_BOUNDARY =9;

    public SudokuGame(int[][] gridState, GameState gameState) {
        this.gridState = gridState;
        this.gameState = gameState;
    }

    public GameState getGameState() {
        return gameState;
    }

    public int[][] getCopyOfGridState() {
        return SodokuUtilities.copytoNewArray(gridState);
    }
}


