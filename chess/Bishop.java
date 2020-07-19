package chess;

public class Bishop {

    int[][] result = new int[8][8];

    public Bishop(int i, int j, boolean number, int[][] maps) {

        int[][] result = new int[8][8];
        for (int k = 0; k < result.length; k++) {
            for (int l = 0; l < result.length; l++) {
                result[k][l] = 0;
            }
        }
        boolean check = true;
        if (number == true) {
            for (int k = -1; k > -8; k--) {

                if (i + k > -1 && i + k < 8 && j + k > -1 && j + k < 8 && maps[i + k][j + k] == 2) {
                    check = false;
                }

                if (i + k > -1 && i + k < 8 && j + k > -1 && j + k < 8 && maps[i + k][j + k] == 1 && check == true) {
                    check = false;
                    result[i + k][j + k] = 1;

                }

                if (i + k > -1 && i + k < 8 && j + k > -1 && j + k < 8 && maps[i + k][j + k] == 0 && check == true) {
                    result[i + k][j + k] = 1;
                }

            }

            check=true;
            
            for (int k = 1; k <8; k++) {

                if (i + k > -1 && i + k < 8 && j + k > -1 && j + k < 8 && maps[i + k][j + k] == 2) {
                    check = false;
                }

                if (i + k > -1 && i + k < 8 && j + k > -1 && j + k < 8 && maps[i + k][j + k] == 1 && check == true) {
                    check = false;
                    result[i + k][j + k] = 1;

                }

                if (i + k > -1 && i + k < 8 && j + k > -1 && j + k < 8 && maps[i + k][j + k] == 0 && check == true) {
                    result[i + k][j + k] = 1;
                }

            }
            
            check=true;
            
            for (int k = -1; k > -8; k--) {

                if (i - k > -1 && i - k < 8 && j + k > -1 && j + k < 8 && maps[i - k][j + k] == 2) {
                    check = false;
                }

                if (i - k > -1 && i - k < 8 && j + k > -1 && j + k < 8 && maps[i - k][j + k] == 1 && check == true) {
                    check = false;
                    result[i - k][j + k] = 1;

                }

                if (i - k > -1 && i - k < 8 && j + k > -1 && j + k < 8 && maps[i - k][j + k] == 0 && check == true) {
                    result[i - k][j + k] = 1;
                }

            }
       
            check=true;     
            
            for (int k = -1; k > -8; k--) {

                if (i + k > -1 && i + k < 8 && j - k > -1 && j - k < 8 && maps[i + k][j - k] == 2) {
                    check = false;
                }

                if (i + k > -1 && i + k < 8 && j - k > -1 && j - k < 8 && maps[i + k][j - k] == 1 && check == true) {
                    check = false;
                    result[i + k][j - k] = 1;

                }

                if (i + k > -1 && i + k < 8 && j - k > -1 && j - k < 8 && maps[i + k][j - k] == 0 && check == true) {
                    result[i + k][j - k] = 1;
                }

            }
        
            check=true;
            
        }

                if (number == false) {
            for (int k = -1; k > -8; k--) {

                if (i + k > -1 && i + k < 8 && j + k > -1 && j + k < 8 && maps[i + k][j + k] == 1) {
                    check = false;
                }

                if (i + k > -1 && i + k < 8 && j + k > -1 && j + k < 8 && maps[i + k][j + k] == 2 && check == true) {
                    check = false;
                    result[i + k][j + k] = 1;

                }

                if (i + k > -1 && i + k < 8 && j + k > -1 && j + k < 8 && maps[i + k][j + k] == 0 && check == true) {
                    result[i + k][j + k] = 1;
                }

            }

            check=true;
            
            for (int k = 1; k <8; k++) {

                if (i + k > -1 && i + k < 8 && j + k > -1 && j + k < 8 && maps[i + k][j + k] == 1) {
                    check = false;
                }

                if (i + k > -1 && i + k < 8 && j + k > -1 && j + k < 8 && maps[i + k][j + k] == 2 && check == true) {
                    check = false;
                    result[i + k][j + k] = 1;

                }

                if (i + k > -1 && i + k < 8 && j + k > -1 && j + k < 8 && maps[i + k][j + k] == 0 && check == true) {
                    result[i + k][j + k] = 1;
                }

            }
            
            check=true;
            
            for (int k = -1; k > -8; k--) {

                if (i - k > -1 && i - k < 8 && j + k > -1 && j + k < 8 && maps[i - k][j + k] == 1) {
                    check = false;
                }

                if (i - k > -1 && i - k < 8 && j + k > -1 && j + k < 8 && maps[i - k][j + k] == 2 && check == true) {
                    check = false;
                    result[i - k][j + k] = 1;

                }

                if (i - k > -1 && i - k < 8 && j + k > -1 && j + k < 8 && maps[i - k][j + k] == 0 && check == true) {
                    result[i - k][j + k] = 1;
                }

            }
       
            check=true;     
            
            for (int k = -1; k > -8; k--) {

                if (i + k > -1 && i + k < 8 && j - k > -1 && j - k < 8 && maps[i + k][j - k] == 1) {
                    check = false;
                }

                if (i + k > -1 && i + k < 8 && j - k > -1 && j - k < 8 && maps[i + k][j - k] == 2 && check == true) {
                    check = false;
                    result[i + k][j - k] = 1;

                }

                if (i + k > -1 && i + k < 8 && j - k > -1 && j - k < 8 && maps[i + k][j - k] == 0 && check == true) {
                    result[i + k][j - k] = 1;
                }

            }
        
            check=true;
            
        }
      this.result=result;  
    }

    public int[][] information(){
        return result;
    }
    
}
