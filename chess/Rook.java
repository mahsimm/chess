package chess;

public class Rook {

    int[][] result = new int[8][8];

    public Rook(int i, int j, int[][] Definition, boolean number, int[][] maps) {

        int[][] result = new int[8][8];
        for (int k = 0; k < 8; k++) {
            for (int l = 0; l < 8; l++) {
                result[k][l] = 0;
            }
        }
        boolean check = true;
        if (number == true) {
            for (int k = -1; k > -8; k--) {

                if (i + k > -1 && i + k < 8 && maps[i + k][j] == 2) {
                    check = false;
                }

                if (i + k > -1 && i + k < 8 && maps[i + k][j] == 1 && check == true) {
                    result[i + k][j] = 1;
                    check = false;
                }

                if (check == true && i + k > -1 && i + k < 8 && maps[i + k][j] == 0) {
                    result[i + k][j] = 1;
                }
            }

            check = true;

            for (int k = 1; k < 8; k++) {

                if (i + k > -1 && i + k < 8 && maps[i + k][j] == 2) {
                    check = false;
                }

                if (i + k > -1 && i + k < 8 && maps[i + k][j] == 1 && check == true) {
                    result[i + k][j] = 1;
                    check = false;
                }

                if (check == true && i + k > -1 && i + k < 8 && maps[i + k][j] == 0) {
                    result[i + k][j] = 1;
                }
            }

            check = true;

            for (int k = -1; k > -8; k--) {
                if (j + k > -1 && j + k < 8 && maps[i][j + k] == 2) {

                    check = false;
                }

                if (j + k > -1 && j + k < 8 && maps[i][j + k] == 1 && check == true) {
                    result[i][j + k] = 1;
                    check = false;
                }

                if (check == true && j + k > -1 && j + k < 8 && maps[i][j + k] == 0) {
                    result[i][j + k] = 1;
                }

            }

            check = true;

            for (int k = 1; k < 8; k++) {
                if (j + k > -1 && j + k < 8 && maps[i][j + k] == 2) {
                    check = false;
                }
                if (j + k > -1 && j + k < 8 && maps[i][j + k] == 1 && check == true) {
                    result[i][j + k] = 1;
                    check = false;
                }
                if (check == true && j + k > -1 && j + k < 8 && maps[i][j + k] == 0) {
                    result[i][j + k] = 1;
                }
            }

            check = true;
        }
        if (number == false) {
            for (int k = -1; k > -8; k--) {

                if (i + k > -1 && i + k < 8 && maps[i + k][j] == 1) {
                    check = false;
                }

                if (i + k > -1 && i + k < 8 && maps[i + k][j] == 2 && check == true) {
                    result[i + k][j] = 1;
                    check = false;
                }

                if (check == true && i + k > -1 && i + k < 8 && maps[i + k][j] == 0) {
                    result[i + k][j] = 1;
                }
            }

            check = true;

            for (int k = 1; k < 8; k++) {

                if (i + k > -1 && i + k < 8 && maps[i + k][j] == 1) {
                    check = false;
                }

                if (i + k > -1 && i + k < 8 && maps[i + k][j] == 2 && check == true) {
                    result[i + k][j] = 1;
                    check = false;
                }

                if (check == true && i + k > -1 && i + k < 8 && maps[i + k][j] == 0) {
                    result[i + k][j] = 1;
                }
            }

            check = true;

            for (int k = -1; k > -8; k--) {
                if (j + k > -1 && j + k < 8 && maps[i][j + k] == 1) {

                    check = false;
                }

                if (j + k > -1 && j + k < 8 && maps[i][j + k] == 2 && check == true) {
                    result[i][j + k] = 1;
                    check = false;
                }

                if (check == true && j + k > -1 && j + k < 8 && maps[i][j + k] == 0) {
                    result[i][j + k] = 1;
                }

            }

            check = true;

            for (int k = 1; k < 8; k++) {
                if (j + k > -1 && j + k < 8 && maps[i][j + k] == 1) {
                    check = false;
                }
                if (j + k > -1 && j + k < 8 && maps[i][j + k] == 2 && check == true) {
                    result[i][j + k] = 1;
                    check = false;
                }
                if (check == true && j + k > -1 && j + k < 8 && maps[i][j + k] == 0) {
                    result[i][j + k] = 1;
                }
            }

            check = true;
        }    
        this.result = result;
    }

    public int[][] information() {
        return result;
    }
}
