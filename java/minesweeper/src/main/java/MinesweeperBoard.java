import java.util.ArrayList;
import java.util.List;

public class MinesweeperBoard {

    private final List<String> inputBoard;

    public MinesweeperBoard(List<String> inputBoard) {
        this.inputBoard = inputBoard;
    }

    public List<String> withNumbers() {
        List<String> outputBoard = new ArrayList<>();

        for (int i = 0; i < inputBoard.size(); i++) {
            StringBuilder rowBuilder = new StringBuilder();
            for (int j = 0; j < inputBoard.get(i).length(); j++) {
                char currentChar = inputBoard.get(i).charAt(j);
                if (currentChar == ' ') {
                    int mineCount = countAdjacentMines(i, j);
                    if (mineCount == 0)
                        rowBuilder.append(' ');
                    else
                        rowBuilder.append(mineCount);
                } else {
                    rowBuilder.append(currentChar);
                }
            }
            outputBoard.add(rowBuilder.toString());
        }

        return outputBoard;
    }

    private int countAdjacentMines(int row, int col) {
        int mineCount = 0;
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (isValidPosition(i, j) && inputBoard.get(i).charAt(j) == '*') {
                    mineCount++;
                }
            }
        }
        return mineCount;
    }

    private boolean isValidPosition(int row, int col) {
        return row >= 0 && row < inputBoard.size() && col >= 0 && col < inputBoard.get(row).length();
    }
}
