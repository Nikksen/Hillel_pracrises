import java.util.Scanner;

public class Main {
    static int[][] ticTacToeArray = {
            {-9,-9,-9},
            {-9,-9,-9},
            {-9,-9,-9}
    };

    public static void main(String[] args) {
        while (true){
            printArray(ticTacToeArray);
            setCellPerson(ticTacToeArray);
            if (checkWinsV2(ticTacToeArray)){
                printArray(ticTacToeArray);
                break;
            }
            setCellComputer(ticTacToeArray);
            if (checkWinsV2(ticTacToeArray)){
                printArray(ticTacToeArray);
                break;
            }
        }
    }

    public static boolean checkWinsV2(int[][] array){
        return (array[0][0] != -9 && array[0][1] == array[0][0]  && array[0][2] ==array[0][0] )||
                (array[1][0] != -9 && array[1][1] == array[1][0] && array[1][2] ==array[1][0]) ||
                (array[2][0] != -9 && array[2][1] == array[2][0] && array[2][2] ==array[2][0]) ||
                (array[0][0] != -9 && array[1][0] == array[0][0] && array[2][0] ==array[0][0]) ||
                (array[0][1] != -9 && array[1][1] == array[0][1] && array[2][1] ==array[0][1]) ||
                (array[0][2] != -9 && array[1][2] == array[0][2] && array[2][2] ==array[0][2]) ||
                (array[0][0] != -9 && array[1][1] == array[0][0] && array[2][2] ==array[0][0]) ||
                (array[0][2] != -9 && array[1][1] == array[0][2] && array[2][0] ==array[0][2]);
    }

    static boolean checkWins(int[][] array){
        boolean result = false;
        int counter = 0;
        int reverseCounter = 0;
        int diagonalMainCounter = 0 ;
        int diagonalReverseCounter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                counter += array[i][j];
                reverseCounter += array[j][i];
                /*
                {-9,-9,-9},
                {-9,-9,-9},
                {-9,-9,-9}
                 */
                if (i == j){
                    diagonalMainCounter += array[i][j];
                }
                if (i + j == 2) {
                    diagonalReverseCounter += array[i][j];
                }
            }
            if (counter == 0 || reverseCounter == 0 || diagonalMainCounter == 0 || diagonalReverseCounter == 0) {
                System.out.println("Computer wins");
                result = true;
                break;
            } else if (counter == 3 || reverseCounter == 3 || diagonalMainCounter == 3 || diagonalReverseCounter == 3) {
                System.out.println("User wins");
                result = true;
                break;
            } else {
                counter = 0;
                reverseCounter = 0;
//                diagonalMainCounter = 0 ;
//                diagonalReverseCounter = 0;
            }
        }
        return result;
    }

    public static void setCellPerson(int[][] array){
        System.out.println("Please enter digit from 1 to 9");
        Scanner scanner = new Scanner(System.in);
        int cell;
        while(true){
            if (scanner.hasNextInt()){
                cell = scanner.nextInt();
                if (checkEmptyCell(array,cell) && cell > 0 && cell < 10){
                    fillCellPerson(array,1,cell);
                    break;
                } else {
                    System.out.println("Wrong data! Please enter digit from 1 to 9");
                }
            }else {
                System.out.println("Wrong data! Please enter digit from 1 to 9");
                scanner.nextLine();
            }
        }
    }

    public static void setCellComputer(int[][] array){
        while (true){
            int cell = (int) (Math.random() * 9) + 1;
            if (checkEmptyCell(array,cell)){
                fillCellPerson(array,0,cell);
                break;
            }
        }
    }

    public static boolean checkEmptyCell(int[][] array, int cell){
        if (cell == 1 && array[0][0] == -9) return true;
        else if (cell == 2 && array[0][1] == -9) return true;
        else if (cell == 3 && array[0][2] == -9) return true;
        else if (cell == 4 && array[1][0] == -9) return true;
        else if (cell == 5 && array[1][1] == -9) return true;
        else if (cell == 6 && array[1][2] == -9) return true;
        else if (cell == 7 && array[2][0] == -9) return true;
        else if (cell == 8 && array[2][1] == -9) return true;
        else return  (cell == 9 && array[2][2] == -9);
    }

    public static void fillCellPerson(int[][] array, int k,int cell){
        switch (cell){
            case 1:
                array[0][0] = k;
                break;
            case 2:
                array[0][1] = k;
                break;
            case 3:
                array[0][2] = k;
                break;
            case 4:
                array[1][0] = k;
                break;
            case 5:
                array[1][1] = k;
                break;
            case 6:
                array[1][2] = k;
                break;
            case 7:
                array[2][0] = k;
                break;
            case 8:
                array[2][1] = k;
                break;
            case 9:
                array[2][2] = k;
                break;
        }
    }


    public static void printArray(int[][] array){
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 0){
                    System.out.print("0\t");
                }else if(array[i][j] == 1){
                    System.out.print("X\t");
                }else{
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

}
