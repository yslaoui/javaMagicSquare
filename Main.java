package magicSquare;

public class Main {
    public static void main(String[] args) {
        int[][] mySquare = {{2,5,4},
                {6,7,2},
                {4, 5, 9}};
        MagicSquare square = new MagicSquare(mySquare);
        System.out.println("sum of rows" + square.sumOfRows());
        System.out.println("sum of columns" + square.sumOfColumns());
    }
}


