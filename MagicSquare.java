package magicSquare;

import java.util.ArrayList;

public class MagicSquare {
    int[][] square;

    public MagicSquare(int[][] square) {
        this.square = square;
    }

    public ArrayList<Integer> sumOfRows() {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i=0; i<this.square.length; i++) {
            int sum = 0;
            for (int j=0; j< this.square[i].length; j++) {
                sum += this.square[i][j];
            }
            result.add(sum);
        }
        return result;
    }




}
