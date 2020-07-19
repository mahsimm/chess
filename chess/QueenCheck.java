package chess;

      public class QueenCheck {
      private int[][] result;

    public QueenCheck(int i, int j, int[][] Definition, boolean number, int[][] maps , int[][] Location) {
        
        int[][] result1 = new int[8][8];
        int[][] result2 = new int[8][8];
        int[][] result = new int[8][8];
    
        BishopCheck BishopCheckTest = new BishopCheck(i, j, number, maps , Location);
        RookCheck RookCheckTest = new RookCheck(i, j, Definition, number, maps , Location);
        
        result1 = BishopCheckTest.information();
        result2 = RookCheckTest.information();
        
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
