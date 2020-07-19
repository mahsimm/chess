package chess;

public class Queen {

    private int[][] result;

    public Queen(int i, int j, int[][] Definition, boolean number, int[][] maps) {
        
        int[][] result1 = new int[8][8];
        int[][] result2 = new int[8][8];
        int[][] result = new int[8][8];
    
        Bishop BishopTest = new Bishop(i, j, number, maps);
        Rook RookTest = new Rook(i, j, Definition, number, maps);
        
        result1 = BishopTest.information();
        result2 = RookTest.information();
        
        for (int k = 0; k < 8; k++) {
            for (int l = 0; l < 8; l++) {
        
                if (result1[k][l] > 0 || result2[k][l] > 0) {
                    result[k][l] = 1;
                } else {
                    result[k][l] = 0;
                }
            
            }
        
        }
        
        this.result = result;
    }

    public int[][] information() {
        return result;
    }
}
