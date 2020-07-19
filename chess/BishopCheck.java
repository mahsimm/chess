package chess;

public class BishopCheck {

    int[][] result = new int[8][8];

    public BishopCheck(int i, int j, boolean number, int[][] maps, int[][] location) {

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

                    maps[i + k][j + k] = 2;
                    maps[i][j] = 0;

                    int remember = location[i + k][j + k];

                    location[i + k][j + k] = 14;
                    location[i][j] = 0;

                    for (int l = 0; l < 8; l++) {
                        for (int m = 0; m < 8; m++) {
                            if (location[l][m] == 16) {

                                KingSituation kingSituationTest = new KingSituation(l, m, true, maps, location);
                                boolean KingSituationTime = kingSituationTest.information();

                                if (KingSituationTime == false) {
                                    result[i + k][j + k] = 1;
                                }

                            }
                        }
                    }

                    maps[i + k][j + k] = 1;
                    maps[i][j] = 2;

                    location[i + k][j + k] = remember;
                    location[i][j] = 14;

                }

                if (i + k > -1 && i + k < 8 && j + k > -1 && j + k < 8 && maps[i + k][j + k] == 0 && check == true) {

                    maps[i + k][j + k] = 2;
                    maps[i][j] = 0;

                    int remember = location[i + k][j + k];

                    location[i + k][j + k] = 14;
                    location[i][j] = 0;

                    for (int l = 0; l < 8; l++) {
                        for (int m = 0; m < 8; m++) {
                            if (location[l][m] == 16) {

                                KingSituation kingSituationTest = new KingSituation(l, m, true, maps, location);
                                boolean KingSituationTime = kingSituationTest.information();

                                if (KingSituationTime == false) {
                                    result[i + k][j + k] = 1;
                                }

                            }
                        }
                    }

                    maps[i + k][j + k] = 0;
                    maps[i][j] = 2;

                    location[i + k][j + k] = remember;
                    location[i][j] = 14;

                }

            }

            check = true;

            for (int k = 1; k < 8; k++) {

                if (i + k > -1 && i + k < 8 && j + k > -1 && j + k < 8 && maps[i + k][j + k] == 2) {
                    check = false;
                }

                if (i + k > -1 && i + k < 8 && j + k > -1 && j + k < 8 && maps[i + k][j + k] == 1 && check == true) {
                    check = false;

                    maps[i + k][j + k] = 2;
                    maps[i][j] = 0;

                    int remember = location[i + k][j + k];

                    location[i + k][j + k] = 14;
                    location[i][j] = 0;

                    for (int l = 0; l < 8; l++) {
                        for (int m = 0; m < 8; m++) {
                            if (location[l][m] == 16) {

                                KingSituation kingSituationTest = new KingSituation(l, m, true, maps, location);
                                boolean KingSituationTime = kingSituationTest.information();

                                if (KingSituationTime == false) {
                                    result[i + k][j + k] = 1;
                                }

                            }
                        }
                    }

                    maps[i + k][j + k] = 1;
                    maps[i][j] = 2;

                    location[i + k][j + k] = remember;
                    location[i][j] = 14;

                }

                if (i + k > -1 && i + k < 8 && j + k > -1 && j + k < 8 && maps[i + k][j + k] == 0 && check == true) {

                    maps[i + k][j + k] = 2;
                    maps[i][j] = 0;

                    int remember = location[i + k][j + k];

                    location[i + k][j + k] = 14;
                    location[i][j] = 0;

                    for (int l = 0; l < 8; l++) {
                        for (int m = 0; m < 8; m++) {
                            if (location[l][m] == 16) {

                                KingSituation kingSituationTest = new KingSituation(l, m, true, maps, location);
                                boolean KingSituationTime = kingSituationTest.information();

                                if (KingSituationTime == false) {
                                    result[i + k][j + k] = 1;
                                }

                            }
                        }
                    }

                    maps[i + k][j + k] = 0;
                    maps[i][j] = 2;

                    location[i + k][j + k] = remember;
                    location[i][j] = 14;

                }

            }

            check = true;

            for (int k = -1; k > -8; k--) {

                if (i - k > -1 && i - k < 8 && j + k > -1 && j + k < 8 && maps[i - k][j + k] == 2) {
                    check = false;
                }

                if (i - k > -1 && i - k < 8 && j + k > -1 && j + k < 8 && maps[i - k][j + k] == 1 && check == true) {
                    check = false;

                    maps[i - k][j + k] = 2;
                    maps[i][j] = 0;

                    int remember = location[i - k][j + k];

                    location[i - k][j + k] = 14;
                    location[i][j] = 0;

                    for (int l = 0; l < 8; l++) {
                        for (int m = 0; m < 8; m++) {
                            if (location[l][m] == 16) {

                                KingSituation kingSituationTest = new KingSituation(l, m, true, maps, location);
                                boolean KingSituationTime = kingSituationTest.information();

                                if (KingSituationTime == false) {
                                    result[i - k][j + k] = 1;
                                }

                            }
                        }
                    }

                    maps[i - k][j + k] = 1;
                    maps[i][j] = 2;

                    location[i - k][j + k] = remember;
                    location[i][j] = 14;

                }

                if (i - k > -1 && i - k < 8 && j + k > -1 && j + k < 8 && maps[i - k][j + k] == 0 && check == true) {

                    maps[i - k][j + k] = 2;
                    maps[i][j] = 0;

                    int remember = location[i - k][j + k];

                    location[i - k][j + k] = 14;
                    location[i][j] = 0;

                    for (int l = 0; l < 8; l++) {
                        for (int m = 0; m < 8; m++) {
                            if (location[l][m] == 16) {

                                KingSituation kingSituationTest = new KingSituation(l, m, true, maps, location);
                                boolean KingSituationTime = kingSituationTest.information();

                                if (KingSituationTime == false) {
                                    result[i - k][j + k] = 1;
                                }

                            }
                        }
                    }

                    maps[i - k][j + k] = 0;
                    maps[i][j] = 2;

                    location[i - k][j + k] = remember;
                    location[i][j] = 14;
                }

            }

            check = true;

            for (int k = -1; k > -8; k--) {

                if (i + k > -1 && i + k < 8 && j - k > -1 && j - k < 8 && maps[i + k][j - k] == 2) {
                    check = false;
                }

                if (i + k > -1 && i + k < 8 && j - k > -1 && j - k < 8 && maps[i + k][j - k] == 1 && check == true) {
                    check = false;

                    maps[i + k][j - k] = 2;
                    maps[i][j] = 0;

                    int remember = location[i + k][j - k];

                    location[i + k][j - k] = 14;
                    location[i][j] = 0;

                    for (int l = 0; l < 8; l++) {
                        for (int m = 0; m < 8; m++) {
                            if (location[l][m] == 16) {

                                KingSituation kingSituationTest = new KingSituation(l, m, true, maps, location);
                                boolean KingSituationTime = kingSituationTest.information();

                                if (KingSituationTime == false) {
                                    result[i + k][j - k] = 1;
                                }

                            }
                        }
                    }

                    maps[i + k][j - k] = 1;
                    maps[i][j] = 2;

                    location[i + k][j - k] = remember;
                    location[i][j] = 14;

                }

                if (i + k > -1 && i + k < 8 && j - k > -1 && j - k < 8 && maps[i + k][j - k] == 0 && check == true) {

                    maps[i + k][j - k] = 2;
                    maps[i][j] = 0;

                    int remember = location[i + k][j - k];

                    location[i + k][j - k] = 14;
                    location[i][j] = 0;

                    for (int l = 0; l < 8; l++) {
                        for (int m = 0; m < 8; m++) {
                            if (location[l][m] == 16) {

                                KingSituation kingSituationTest = new KingSituation(l, m, true, maps, location);
                                boolean KingSituationTime = kingSituationTest.information();

                                if (KingSituationTime == false) {
                                    result[i + k][j - k] = 1;
                                }

                            }
                        }
                    }

                    maps[i + k][j - k] = 0;
                    maps[i][j] = 2;

                    location[i + k][j - k] = remember;
                    location[i][j] = 14;

                }

            }

            check = true;

        }

        if (number == false) {
            for (int k = -1; k > -8; k--) {

                if (i + k > -1 && i + k < 8 && j + k > -1 && j + k < 8 && maps[i + k][j + k] == 1) {
                    check = false;
                }

                if (i + k > -1 && i + k < 8 && j + k > -1 && j + k < 8 && maps[i + k][j + k] == 2 && check == true) {
                    check = false;

                    maps[i + k][j + k] = 1;
                    maps[i][j] = 0;

                    int remember = location[i + k][j + k];

                    location[i + k][j + k] = 4;
                    location[i][j] = 0;

                    for (int l = 0; l < 8; l++) {
                        for (int m = 0; m < 8; m++) {
                            if (location[l][m] == 6) {

                                KingSituation kingSituationTest = new KingSituation(l, m, false, maps, location);
                                boolean KingSituationTime = kingSituationTest.information();

                                if (KingSituationTime == false) {
                                    result[i + k][j + k] = 1;
                                }

                            }
                        }
                    }

                    maps[i + k][j + k] = 2;
                    maps[i][j] = 1;

                    location[i + k][j + k] = remember;
                    location[i][j] = 4;

                }

                if (i + k > -1 && i + k < 8 && j + k > -1 && j + k < 8 && maps[i + k][j + k] == 0 && check == true) {
                    maps[i + k][j + k] = 1;
                    maps[i][j] = 0;

                    int remember = location[i + k][j + k];

                    location[i + k][j + k] = 4;
                    location[i][j] = 0;

                    for (int l = 0; l < 8; l++) {
                        for (int m = 0; m < 8; m++) {
                            if (location[l][m] == 6) {

                                KingSituation kingSituationTest = new KingSituation(l, m, false, maps, location);
                                boolean KingSituationTime = kingSituationTest.information();

                                if (KingSituationTime == false) {
                                    result[i + k][j + k] = 1;
                                }

                            }
                        }
                    }

                    maps[i + k][j + k] = 0;
                    maps[i][j] = 1;

                    location[i + k][j + k] = remember;
                    location[i][j] = 4;
                }

            }

            check = true;

            for (int k = 1; k < 8; k++) {

                if (i + k > -1 && i + k < 8 && j + k > -1 && j + k < 8 && maps[i + k][j + k] == 1) {
                    check = false;
                }

                if (i + k > -1 && i + k < 8 && j + k > -1 && j + k < 8 && maps[i + k][j + k] == 2 && check == true) {
                    check = false;

                    maps[i + k][j + k] = 1;
                    maps[i][j] = 0;

                    int remember = location[i + k][j + k];

                    location[i + k][j + k] = 4;
                    location[i][j] = 0;

                    for (int l = 0; l < 8; l++) {
                        for (int m = 0; m < 8; m++) {
                            if (location[l][m] == 6) {

                                KingSituation kingSituationTest = new KingSituation(l, m, false, maps, location);
                                boolean KingSituationTime = kingSituationTest.information();

                                if (KingSituationTime == false) {
                                    result[i + k][j + k] = 1;
                                }

                            }
                        }
                    }

                    maps[i + k][j + k] = 2;
                    maps[i][j] = 1;

                    location[i + k][j + k] = remember;
                    location[i][j] = 4;

                }

                if (i + k > -1 && i + k < 8 && j + k > -1 && j + k < 8 && maps[i + k][j + k] == 0 && check == true) {

                    maps[i + k][j + k] = 1;
                    maps[i][j] = 0;

                    int remember = location[i + k][j + k];

                    location[i + k][j + k] = 4;
                    location[i][j] = 0;

                    for (int l = 0; l < 8; l++) {
                        for (int m = 0; m < 8; m++) {
                            if (location[l][m] == 6) {

                                KingSituation kingSituationTest = new KingSituation(l, m, false, maps, location);
                                boolean KingSituationTime = kingSituationTest.information();

                                if (KingSituationTime == false) {
                                    result[i + k][j + k] = 1;
                                }

                            }
                        }
                    }

                    maps[i + k][j + k] = 0;
                    maps[i][j] = 1;

                    location[i + k][j + k] = remember;
                    location[i][j] = 4;
                }

            }

            check = true;

            for (int k = -1; k > -8; k--) {

                if (i - k > -1 && i - k < 8 && j + k > -1 && j + k < 8 && maps[i - k][j + k] == 1) {
                    check = false;
                }

                if (i - k > -1 && i - k < 8 && j + k > -1 && j + k < 8 && maps[i - k][j + k] == 2 && check == true) {
                    check = false;

                    maps[i - k][j + k] = 1;
                    maps[i][j] = 0;

                    int remember = location[i - k][j + k];

                    location[i - k][j + k] = 4;
                    location[i][j] = 0;

                    for (int l = 0; l < 8; l++) {
                        for (int m = 0; m < 8; m++) {
                            if (location[l][m] == 6) {

                                KingSituation kingSituationTest = new KingSituation(l, m, false, maps, location);
                                boolean KingSituationTime = kingSituationTest.information();

                                if (KingSituationTime == false) {
                                    result[i - k][j + k] = 1;
                                }

                            }
                        }
                    }

                    maps[i - k][j + k] = 2;
                    maps[i][j] = 1;

                    location[i - k][j + k] = remember;
                    location[i][j] = 4;

                }

                if (i - k > -1 && i - k < 8 && j + k > -1 && j + k < 8 && maps[i - k][j + k] == 0 && check == true) {

                    maps[i - k][j + k] = 1;
                    maps[i][j] = 0;

                    int remember = location[i - k][j + k];

                    location[i - k][j + k] = 4;
                    location[i][j] = 0;

                    for (int l = 0; l < 8; l++) {
                        for (int m = 0; m < 8; m++) {
                            if (location[l][m] == 6) {

                                KingSituation kingSituationTest = new KingSituation(l, m, false, maps, location);
                                boolean KingSituationTime = kingSituationTest.information();

                                if (KingSituationTime == false) {
                                    result[i - k][j + k] = 1;
                                }

                            }
                        }
                    }

                    maps[i - k][j + k] = 0;
                    maps[i][j] = 1;

                    location[i - k][j + k] = remember;
                    location[i][j] = 4;
                }

            }

            check = true;

            for (int k = -1; k > -8; k--) {

                if (i + k > -1 && i + k < 8 && j - k > -1 && j - k < 8 && maps[i + k][j - k] == 1) {
                    check = false;
                }

                if (i + k > -1 && i + k < 8 && j - k > -1 && j - k < 8 && maps[i + k][j - k] == 2 && check == true) {
                    check = false;

                    maps[i + k][j - k] = 1;
                    maps[i][j] = 0;

                    int remember = location[i + k][j - k];

                    location[i + k][j - k] = 4;
                    location[i][j] = 0;

                    for (int l = 0; l < 8; l++) {
                        for (int m = 0; m < 8; m++) {
                            if (location[l][m] == 6) {

                                KingSituation kingSituationTest = new KingSituation(l, m, false, maps, location);
                                boolean KingSituationTime = kingSituationTest.information();

                                if (KingSituationTime == false) {
                                    result[i + k][j - k] = 1;
                                }

                            }
                        }
                    }

                    maps[i + k][j - k] = 2;
                    maps[i][j] = 1;

                    location[i + k][j - k] = remember;
                    location[i][j] = 4;

                }

                if (i + k > -1 && i + k < 8 && j - k > -1 && j - k < 8 && maps[i + k][j - k] == 0 && check == true) {

                    maps[i + k][j - k] = 1;
                    maps[i][j] = 0;

                    int remember = location[i + k][j - k];

                    location[i + k][j - k] = 4;
                    location[i][j] = 0;

                    for (int l = 0; l < 8; l++) {
                        for (int m = 0; m < 8; m++) {
                            if (location[l][m] == 6) {

                                KingSituation kingSituationTest = new KingSituation(l, m, false, maps, location);
                                boolean KingSituationTime = kingSituationTest.information();

                                if (KingSituationTime == false) {
                                    result[i + k][j - k] = 1;
                                }

                            }
                        }
                    }

                    maps[i + k][j - k] = 0;
                    maps[i][j] = 1;

                    location[i + k][j - k] = remember;
                    location[i][j] = 4;

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
