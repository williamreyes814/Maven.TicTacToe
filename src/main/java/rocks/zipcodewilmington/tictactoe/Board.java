package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    char winner ;
    public Board(Character[][] matrix) {
        winner = checkallRows(matrix);

        char checker = checkallCol(matrix);
        if(checker!= ' ') {winner = checker;}

        checker = checkDiagonals(matrix);
        if(checker != ' '){winner= checker;}

    }

    public Boolean isInFavorOfX() {



        return winner == 'X';
    }

    public Boolean isInFavorOfO() {


        return winner == 'O';
    }

    public Boolean isTie() {


        return winner == ' ';
    }

    public String getWinner() {
        String winString = "";

        if(winner != ' '){
            winString += winner;


        }

        return winString;
    }


    public Character checkRow(Character[][] matrix, int rowNum ){

        Character winner = ' ';

        if(matrix[rowNum][0] == matrix[rowNum][1] && matrix[rowNum][0]==matrix[rowNum][2])winner = matrix[rowNum][0];

        return  winner;
    }


    public Character checkallRows(Character[][] matrix) {

        Character winner = ' ';

        for(int i = 0; i < 3; i++) {

            winner = checkRow(matrix, i);
            if(winner != ' ') return winner;
        }
        return winner;
    }



    public Character checkCol(Character[][] matrix, int colNum ){

        Character winner = ' ';


        if(matrix[1][colNum] == matrix[0][colNum] && matrix[2][colNum]==matrix[0][colNum])winner = matrix[0][colNum];

        return  winner;
    }
    public Character checkallCol(Character[][] matrix) {
        Character winner = ' ';

        for (int i = 0; i < 3; i++) {

            winner = checkCol(matrix, i);
            if (winner != ' ') return winner;
        }
        return winner;
    }
    public Character checkDiagonals(Character[][] matrix){

        Character winner = ' ';
        if(matrix[0][0] == matrix[1][1] && matrix[0][0] == matrix[2][2])winner = matrix[1][1];

     if(winner != ' ') return  winner;

      if(matrix[0][2]== matrix [1][1] && matrix[2][0]== matrix[0][2]) winner = matrix[1][1];

      return winner;
    }
}


