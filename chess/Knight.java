package chess;

public class Knight {

    private int[][] result;

    public Knight(int i, int j, int[][] Definition, boolean number, int[][] maps) {
        int[][] result = new int[8][8];
        for (int k = 0; k < 8; k++) {
            for (int l = 0; l < 8; l++) {
                result[k][l] = 0;

            }
        }
        if (number == true) {
            if ((i + 2) > -1 && (i + 2) < 8 && (j + 1) > -1 && (j + 1) < 8 && maps[i + 2][j + 1] == 0) {

                result[i + 2][j + 1] = 1;
            }
            if ((i + 2) > -1 && (i + 2) < 8 && (j + 1) > -1 && (j + 1) < 8 && maps[i + 2][j + 1] == 1) {

                result[i + 2][j + 1] = 1;
            }

            if ((i + 2) > -1 && (i + 2) < 8 && (j - 1) > -1 && (j - 1) < 8 && maps[i + 2][j - 1] == 0) {

                result[i + 2][j - 1] = 1;
            }
            if ((i + 2) > -1 && (i + 2) < 8 && (j - 1) > -1 && (j - 1) < 8 && maps[i + 2][j - 1] == 1) {

                result[i + 2][j - 1] = 1;
            }

            if ((i + 1) > -1 && (i + 1) < 8 && (j + 2) > -1 && (j + 2) < 8 && maps[i + 1][j + 2] == 0) {

                result[i + 1][j + 2] = 1;
            }
            if ((i + 1) > -1 && (i + 1) < 8 && (j + 2) > -1 && (j + 2) < 8 && maps[i + 1][j + 2] == 1) {

                result[i + 1][j + 2] = 1;
            }

            if ((i + 1) > -1 && (i + 1) < 8 && (j - 2) > -1 && (j - 2) < 8 && maps[i + 1][j - 2] == 0) {

                result[i + 1][j - 2] = 1;
            }
            if ((i + 1) > -1 && (i + 1) < 8 && (j - 2) > -1 && (j - 2) < 8 && maps[i + 1][j - 2] == 1) {

                result[i + 1][j - 2] = 1;
            }

            if ((i - 2) > -1 && (i - 2) < 8 && (j + 1) > -1 && (j + 1) < 8 && maps[i - 2][j + 1] == 0) {

                result[i - 2][j + 1] = 1;
            }
            if ((i - 2) > -1 && (i - 2) < 8 && (j + 1) > -1 && (j + 1) < 8 && maps[i - 2][j + 1] == 1) {

                result[i - 2][j + 1] = 1;
            }

            if ((i - 2) > -1 && (i - 2) < 8 && (j - 1) > -1 && (j - 1) < 8 && maps[i - 2][j - 1] == 0) {

                result[i - 2][j - 1] = 1;
            }
            if ((i - 2) > -1 && (i - 2) < 8 && (j - 1) > -1 && (j - 1) < 8 && maps[i - 2][j - 1] == 1) {

                result[i - 2][j - 1] = 1;
            }

            if ((i - 1) > -1 && (i - 1) < 8 && (j + 2) > -1 && (j + 2) < 8 && maps[i - 1][j + 2] == 0) {

                result[i - 1][j + 2] = 1;
            }
            if ((i - 1) > -1 && (i - 1) < 8 && (j + 2) > -1 && (j + 2) < 8 && maps[i - 1][j + 2] == 1) {

                result[i - 1][j + 2] = 1;
            }

            if ((i - 1) > -1 && (i - 1) < 8 && (j - 2) > -1 && (j - 2) < 8 && maps[i - 1][j - 2] == 0) {

                result[i - 1][j - 2] = 1;
            }
            if ((i - 1) > -1 && (i - 1) < 8 && (j - 2) > -1 && (j - 2) < 8 && maps[i - 1][j - 2] == 1) {

                result[i - 1][j - 2] = 1;
            }

        }
        if (number == false) {
            if ((i + 2) > -1 && (i + 2) < 8 && (j + 1) > -1 && (j + 1) < 8 && maps[i + 2][j + 1] == 0) {

                result[i + 2][j + 1] = 1;
            }
            if ((i + 2) > -1 && (i + 2) < 8 && (j + 1) > -1 && (j + 1) < 8 && maps[i + 2][j + 1] == 2) {

                result[i + 2][j + 1] = 1;
            }

            if ((i + 2) > -1 && (i + 2) < 8 && (j - 1) > -1 && (j - 1) < 8 && maps[i + 2][j - 1] == 0) {

                result[i + 2][j - 1] = 1;
            }
            if ((i + 2) > -1 && (i + 2) < 8 && (j - 1) > -1 && (j - 1) < 8 && maps[i + 2][j - 1] == 2) {

                result[i + 2][j - 1] = 1;
            }

            if ((i + 1) > -1 && (i + 1) < 8 && (j + 2) > -1 && (j + 2) < 8 && maps[i + 1][j + 2] == 0) {

                result[i + 1][j + 2] = 1;
            }
            if ((i + 1) > -1 && (i + 1) < 8 && (j + 2) > -1 && (j + 2) < 8 && maps[i + 1][j + 2] == 2) {

                result[i + 1][j + 2] = 1;
            }

            if ((i + 1) > -1 && (i + 1) < 8 && (j - 2) > -1 && (j - 2) < 8 && maps[i + 1][j - 2] == 0) {

                result[i + 1][j - 2] = 1;
            }
            if ((i + 1) > -1 && (i + 1) < 8 && (j - 2) > -1 && (j - 2) < 8 && maps[i + 1][j - 2] == 2) {

                result[i + 1][j - 2] = 1;
            }

            if ((i - 2) > -1 && (i - 2) < 8 && (j + 1) > -1 && (j + 1) < 8 && maps[i - 2][j + 1] == 0) {

                result[i - 2][j + 1] = 1;
            }
            if ((i - 2) > -1 && (i - 2) < 8 && (j + 1) > -1 && (j + 1) < 8 && maps[i - 2][j + 1] == 2) {

                result[i - 2][j + 1] = 1;
            }

            if ((i - 2) > -1 && (i - 2) < 8 && (j - 1) > -1 && (j - 1) < 8 && maps[i - 2][j - 1] == 0) {

                result[i - 2][j - 1] = 1;
            }
            if ((i - 2) > -1 && (i - 2) < 8 && (j - 1) > -1 && (j - 1) < 8 && maps[i - 2][j - 1] == 2) {

                result[i - 2][j - 1] = 1;
            }

            if ((i - 1) > -1 && (i - 1) < 8 && (j + 2) > -1 && (j + 2) < 8 && maps[i - 1][j + 2] == 0) {

                result[i - 1][j + 2] = 1;
            }
            if ((i - 1) > -1 && (i - 1) < 8 && (j + 2) > -1 && (j + 2) < 8 && maps[i - 1][j + 2] == 2) {

                result[i - 1][j + 2] = 1;
            }

            if ((i - 1) > -1 && (i - 1) < 8 && (j - 2) > -1 && (j - 2) < 8 && maps[i - 1][j - 2] == 0) {

                result[i - 1][j - 2] = 1;
            }
            if ((i - 1) > -1 && (i - 1) < 8 && (j - 2) > -1 && (j - 2) < 8 && maps[i - 1][j - 2] == 2) {

                result[i - 1][j - 2] = 1;
            }

        }
        this.result = result;
    }

    Knight(int i, int j, boolean number, int[][] maps) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int[][] information() {
        return result;
    }
}
