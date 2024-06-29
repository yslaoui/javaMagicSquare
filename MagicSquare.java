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

    public ArrayList<Integer> sumOfColumns() {
        ArrayList<Integer> result = new ArrayList<>();
        int numberOfColumns =  this.square[0].length;
        int numberOfRows = this.square.length;
        for (int j=0; j< numberOfColumns; j++) {
            int sum = 0;
            for (int i=0; i<numberOfRows; i++) {
                sum += this.square[i][j];
            }
            result.add(sum);
        }
        return result;
    }

    public ArrayList<Integer> sumOfDiagonals() {
        ArrayList<Integer> result = new ArrayList<>();
        int firstDiagonalSum = 0;
        int secondDiagonalSum = 0;
        for (int i=0; i<this.square.length; i++) {
            firstDiagonalSum += this.square[i][i];
            secondDiagonalSum += this.square[i][this.square.length-i-1];
        }

        result.add(firstDiagonalSum);
        result.add(secondDiagonalSum);
        return result;
    }








}
