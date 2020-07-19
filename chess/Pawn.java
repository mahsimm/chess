package chess;

public class Pawn {

    private int[][] result;

    public Pawn(int i, int j, int[][] definition, boolean difration, boolean number, int[][] maps) {
        int[][] result = new int[8][8];
        for (int k = 0; k < result.length; k++) {
            for (int l = 0; l < result.length; l++) {
                result[k][l] = 0;

            }
        }
        if (difration == true) {
       
            if (i - 1 > -1 && i - 1 < 8 && j - 1 > -1 && j - 1 < 8 && maps[i - 1][j - 1] == 1) {
                result[i - 1][j - 1] = 1;
            }
            
            if (i - 1 > -1 && i - 1 < 8 && j + 1 > -1 && j + 1 < 8 && maps[i - 1][j + 1] == 1) {
                result[i - 1][j + 1] = 1;
            }
            
            if (definition[i - 1][j] == 0) {
                result[i - 1][j] = 1;
            }
            
            if (number == true) {
                if (definition[i - 2][j] == 0 && definition[i - 1][j] == 0) {
                    result[i - 2][j] = 1;
                }
            }
        
        }
        if (difration == false) {

            if (i + 1 > -1 && i + 1 < 8 && j + 1 > -1 && j + 1 < 8 && maps[i + 1][j + 1] == 2) {
                result[i + 1][j + 1] = 1;
            }

            if (i + 1 > -1 && i + 1 < 8 && j - 1 > -1 && j - 1 < 8 && maps[i + 1][j - 1] == 2) {
                result[i + 1][j - 1] = 1;
            }

            if (definition[i + 1][j] == 0) {
                result[i + 1][j] = 1;
            }
        
            if (number == true) {
                if (definition[i + 2][j] == 0 && definition[i + 1][j] == 0) {
                    result[i + 2][j] = 1;
                }
            }
        
        }
        
        this.result = result;
    
    }

    public int[][] information() {
        return result;
    }
}
