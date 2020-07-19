package chess;

public class RookCheck {

    int[][] result = new int[8][8];

    public RookCheck(int i, int j, int[][] Definition, boolean number, int[][] maps, int[][] location) {

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

                    maps[i + k][j] = 2;
                    maps[i][j] = 0;

                    location[i + k][j] = 12;
                    location[i][j] = 0;

                    for (int l = 0; l < 8; l++) {
                        for (int m = 0; m < 8; m++) {

                            if (location[l][m] == 16) {

                                KingSituation kingSituationTest = new KingSituation(l, m, true, maps, location);
                                boolean KingSituationTime = kingSituationTest.information();

                                if (KingSituationTime == false) {
                                    result[i + k][j] = 1;
                                }

                            }
                        }
                    }

                    maps[i + k][j] = 0;
                    maps[i][j] = 2;

                    location[i + k][j] = 0;
                    location[i][j] = 12;

                    check = false;
                }

                if (check == true && i + k > -1 && i + k < 8 && maps[i + k][j] == 0) {

                    maps[i + k][j] = 2;
                    maps[i][j] = 0;

                    location[i + k][j] = 12;
                    location[i][j] = 0;

                    for (int l = 0; l < 8; l++) {
                        for (int m = 0; m < 8; m++) {

                            if (location[l][m] == 16) {

                                KingSituation kingSituationTest = new KingSituation(l, m, true, maps, location);
                                boolean KingSituationTime = kingSituationTest.information();

                                if (KingSituationTime == false) {
                                    result[i + k][j] = 1;
                                }

                            }
                        }
                    }

                    maps[i + k][j] = 0;
                    maps[i][j] = 2;

                    location[i + k][j] = 0;
                    location[i][j] = 12;
                }
            }

            check = true;

            for (int k = 1; k < 8; k++) {

                if (i + k > -1 && i + k < 8 && maps[i + k][j] == 2) {
                    check = false;
                }

                if (i + k > -1 && i + k < 8 && maps[i + k][j] == 1 && check == true) {

                    maps[i + k][j] = 2;
                    maps[i][j] = 0;

                    location[i + k][j] = 12;
                    location[i][j] = 0;

                    for (int l = 0; l < 8; l++) {
                        for (int m = 0; m < 8; m++) {

                            if (location[l][m] == 16) {

                                KingSituation kingSituationTest = new KingSituation(l, m, true, maps, location);
                                boolean KingSituationTime = kingSituationTest.information();

                                if (KingSituationTime == false) {
                                    result[i + k][j] = 1;
                                }

                            }
                        }
                    }

                    maps[i + k][j] = 0;
                    maps[i][j] = 2;

                    location[i + k][j] = 0;
                    location[i][j] = 12;

                    check = false;
                }

                if (check == true && i + k > -1 && i + k < 8 && maps[i + k][j] == 0) {

                    maps[i + k][j] = 2;
                    maps[i][j] = 0;

                    location[i + k][j] = 12;
                    location[i][j] = 0;

                    for (int l = 0; l < 8; l++) {
                        for (int m = 0; m < 8; m++) {

                            if (location[l][m] == 16) {

                                KingSituation kingSituationTest = new KingSituation(l, m, true, maps, location);
                                boolean KingSituationTime = kingSituationTest.information();

                                if (KingSituationTime == false) {
                                    result[i + k][j] = 1;
                                }

                            }
                        }
                    }

                    maps[i + k][j] = 0;
                    maps[i][j] = 2;

                    location[i + k][j] = 0;
                    location[i][j] = 12;
                }
            }

            check = true;

            for (int k = -1; k > -8; k--) {
                if (j + k > -1 && j + k < 8 && maps[i][j + k] == 2) {

                    check = false;
                }

                if (j + k > -1 && j + k < 8 && maps[i][j + k] == 1 && check == true) {

                    maps[i][j + k] = 2;
                    maps[i][j] = 0;

                    location[i][j + k] = 12;
                    location[i][j] = 0;

                    for (int l = 0; l < 8; l++) {
                        for (int m = 0; m < 8; m++) {

                            if (location[l][m] == 16) {

                                KingSituation kingSituationTest = new KingSituation(l, m, true, maps, location);
                                boolean KingSituationTime = kingSituationTest.information();

                                if (KingSituationTime == false) {
                                    result[i][j + k] = 1;
                                }

                            }
                        }
                    }

                    maps[i][j + k] = 0;
                    maps[i][j] = 2;

                    location[i][j + k] = 0;
                    location[i][j] = 12;
                    check = false;
                }

                if (check == true && j + k > -1 && j + k < 8 && maps[i][j + k] == 0) {

                    maps[i][j + k] = 2;
                    maps[i][j] = 0;

                    location[i][j + k] = 12;
                    location[i][j] = 0;

                    for (int l = 0; l < 8; l++) {
                        for (int m = 0; m < 8; m++) {

                            if (location[l][m] == 16) {

                                KingSituation kingSituationTest = new KingSituation(l, m, true, maps, location);
                                boolean KingSituationTime = kingSituationTest.information();

                                if (KingSituationTime == false) {
                                    result[i][j + k] = 1;
                                }

                            }
                        }
                    }

                    maps[i][j + k] = 0;
                    maps[i][j] = 2;

                    location[i][j + k] = 0;
                    location[i][j] = 12;

                }

            }

            check = true;

            for (int k = 1; k < 8; k++) {
                if (j + k > -1 && j + k < 8 && maps[i][j + k] == 2) {
                    check = false;
                }
                if (j + k > -1 && j + k < 8 && maps[i][j + k] == 1 && check == true) {

                    maps[i][j + k] = 2;
                    maps[i][j] = 0;

                    location[i][j + k] = 12;
                    location[i][j] = 0;

                    for (int l = 0; l < 8; l++) {
                        for (int m = 0; m < 8; m++) {

                            if (location[l][m] == 16) {

                                KingSituation kingSituationTest = new KingSituation(l, m, true, maps, location);
                                boolean KingSituationTime = kingSituationTest.information();

                                if (KingSituationTime == false) {
                                    result[i][j + k] = 1;
                                }

                            }
                        }
                    }

                    maps[i][j + k] = 0;
                    maps[i][j] = 2;

                    location[i][j + k] = 0;
                    location[i][j] = 12;
                    check = false;
                }
                if (check == true && j + k > -1 && j + k < 8 && maps[i][j + k] == 0) {

                    maps[i][j + k] = 2;
                    maps[i][j] = 0;

                    location[i][j + k] = 12;
                    location[i][j] = 0;

                    for (int l = 0; l < 8; l++) {
                        for (int m = 0; m < 8; m++) {

                            if (location[l][m] == 16) {

                                KingSituation kingSituationTest = new KingSituation(l, m, true, maps, location);
                                boolean KingSituationTime = kingSituationTest.information();

                                if (KingSituationTime == false) {
                                    result[i][j + k] = 1;
                                }

                            }
                        }
                    }

                    maps[i][j + k] = 0;
                    maps[i][j] = 2;

                    location[i][j + k] = 0;
                    location[i][j] = 12;
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

                    maps[i + k][j] = 1;
                    maps[i][j] = 0;

                    location[i + k][j] = 2;
                    location[i][j] = 0;

                    for (int l = 0; l < 8; l++) {
                        for (int m = 0; m < 8; m++) {

                            if (location[l][m] == 6) {

                                KingSituation kingSituationTest = new KingSituation(l, m, false, maps, location);
                                boolean KingSituationTime = kingSituationTest.information();

                                if (KingSituationTime == false) {
                                    result[i + k][j] = 1;
                                }

                            }
                        }
                    }

                    maps[i + k][j] = 0;
                    maps[i][j] = 1;

                    location[i + k][j] = 0;
                    location[i][j] = 2;
                    check = false;
                }

                if (check == true && i + k > -1 && i + k < 8 && maps[i + k][j] == 0) {

                    maps[i + k][j] = 1;
                    maps[i][j] = 0;

                    location[i + k][j] = 2;
                    location[i][j] = 0;

                    for (int l = 0; l < 8; l++) {
                        for (int m = 0; m < 8; m++) {

                            if (location[l][m] == 6) {

                                KingSituation kingSituationTest = new KingSituation(l, m, false, maps, location);
                                boolean KingSituationTime = kingSituationTest.information();

                                if (KingSituationTime == false) {
                                    result[i + k][j] = 1;
                                }

                            }
                        }
                    }

                    maps[i + k][j] = 0;
                    maps[i][j] = 1;

                    location[i + k][j] = 0;
                    location[i][j] = 2;

                }
            }

            check = true;

            for (int k = 1; k < 8; k++) {

                if (i + k > -1 && i + k < 8 && maps[i + k][j] == 1) {
                    check = false;
                }

                if (i + k > -1 && i + k < 8 && maps[i + k][j] == 2 && check == true) {

                    maps[i + k][j] = 1;
                    maps[i][j] = 0;

                    location[i + k][j] = 2;
                    location[i][j] = 0;

                    for (int l = 0; l < 8; l++) {
                        for (int m = 0; m < 8; m++) {

                            if (location[l][m] == 6) {

                                KingSituation kingSituationTest = new KingSituation(l, m, false, maps, location);
                                boolean KingSituationTime = kingSituationTest.information();

                                if (KingSituationTime == false) {
                                    result[i + k][j] = 1;
                                }

                            }
                        }
                    }

                    maps[i + k][j] = 0;
                    maps[i][j] = 1;

                    location[i + k][j] = 0;
                    location[i][j] = 2;

                    check = false;
                }

                if (check == true && i + k > -1 && i + k < 8 && maps[i + k][j] == 0) {

                    maps[i + k][j] = 1;
                    maps[i][j] = 0;

                    location[i + k][j] = 2;
                    location[i][j] = 0;

                    for (int l = 0; l < 8; l++) {
                        for (int m = 0; m < 8; m++) {

                            if (location[l][m] == 6) {

                                KingSituation kingSituationTest = new KingSituation(l, m, false, maps, location);
                                boolean KingSituationTime = kingSituationTest.information();

                                if (KingSituationTime == false) {
                                    result[i + k][j] = 1;
                                }

                            }
                        }
                    }

                    maps[i + k][j] = 0;
                    maps[i][j] = 1;

                    location[i + k][j] = 0;
                    location[i][j] = 2;
                }
            }

            check = true;

            for (int k = -1; k > -8; k--) {
                if (j + k > -1 && j + k < 8 && maps[i][j + k] == 1) {

                    check = false;
                }

                if (j + k > -1 && j + k < 8 && maps[i][j + k] == 2 && check == true) {

                    maps[i][j + k] = 1;
                    maps[i][j] = 0;

                    location[i][j + k] = 2;
                    location[i][j] = 0;

                    for (int l = 0; l < 8; l++) {
                        for (int m = 0; m < 8; m++) {

                            if (location[l][m] == 6) {

                                KingSituation kingSituationTest = new KingSituation(l, m, false, maps, location);
                                boolean KingSituationTime = kingSituationTest.information();

                                if (KingSituationTime == false) {
                                    result[i][j + k] = 1;
                                }

                            }
                        }
                    }

                    maps[i][j + k] = 0;
                    maps[i][j] = 1;

                    location[i][j + k] = 0;
                    location[i][j] = 2;
                    check = false;
                }

                if (check == true && j + k > -1 && j + k < 8 && maps[i][j + k] == 0) {

                    maps[i][j + k] = 1;
                    maps[i][j] = 0;

                    location[i][j + k] = 2;
                    location[i][j] = 0;

                    for (int l = 0; l < 8; l++) {
                        for (int m = 0; m < 8; m++) {

                            if (location[l][m] == 6) {

                                KingSituation kingSituationTest = new KingSituation(l, m, false, maps, location);
                                boolean KingSituationTime = kingSituationTest.information();

                                if (KingSituationTime == false) {
                                    result[i][j + k] = 1;
                                }

                            }
                        }
                    }

                    maps[i][j + k] = 0;
                    maps[i][j] = 1;

                    location[i][j + k] = 0;
                    location[i][j] = 2;

                }

            }

            check = true;

            for (int k = 1; k < 8; k++) {
                if (j + k > -1 && j + k < 8 && maps[i][j + k] == 1) {
                    check = false;
                }
                if (j + k > -1 && j + k < 8 && maps[i][j + k] == 2 && check == true) {

                    maps[i][j + k] = 1;
                    maps[i][j] = 0;

                    location[i][j + k] = 2;
                    location[i][j] = 0;

                    for (int l = 0; l < 8; l++) {
                        for (int m = 0; m < 8; m++) {

                            if (location[l][m] == 6) {

                                KingSituation kingSituationTest = new KingSituation(l, m, false, maps, location);
                                boolean KingSituationTime = kingSituationTest.information();

                                if (KingSituationTime == false) {
                                    result[i][j + k] = 1;
                                }

                            }
                        }
                    }

                    maps[i][j + k] = 0;
                    maps[i][j] = 1;

                    location[i][j + k] = 0;
                    location[i][j] = 2;
                    check = false;
                }
                if (check == true && j + k > -1 && j + k < 8 && maps[i][j + k] == 0) {

                    maps[i][j + k] = 1;
                    maps[i][j] = 0;

                    location[i][j + k] = 2;
                    location[i][j] = 0;

                    for (int l = 0; l < 8; l++) {
                        for (int m = 0; m < 8; m++) {

                            if (location[l][m] == 6) {

                                KingSituation kingSituationTest = new KingSituation(l, m, false, maps, location);
                                boolean KingSituationTime = kingSituationTest.information();

                                if (KingSituationTime == false) {
                                    result[i][j + k] = 1;
                                }

                            }
                        }
                    }

                    maps[i][j + k] = 0;
                    maps[i][j] = 1;

                    location[i][j + k] = 0;
                    location[i][j] = 2;
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
