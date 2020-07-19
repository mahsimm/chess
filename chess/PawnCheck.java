package chess;

public class PawnCheck {

    private int[][] result;

    public PawnCheck(int i, int j, int[][] definition, boolean difration, boolean number, int[][] maps, int[][] location) {
        int[][] result = new int[8][8];
        for (int k = 0; k < result.length; k++) {
            for (int l = 0; l < result.length; l++) {
                result[k][l] = 0;

            }
        }
        if (difration == true) {

            if (i - 1 > -1 && i - 1 < 8 && j - 1 > -1 && j - 1 < 8 && maps[i - 1][j - 1] == 1) {

                definition[i - 1][j - 1] = 1;
                definition[i][j] = 0;

                maps[i - 1][j - 1] = 2;
                maps[i][j] = 0;

                location[i - 1][j - 1] = 11;
                location[i][j] = 0;

                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {

                        if (location[k][l] == 16) {

                            KingSituation kingSituationTest = new KingSituation(k, l, true, maps, location);
                            boolean KingsituationTime = kingSituationTest.information();

                            if (KingsituationTime == false) {
                                result[i - 1][j - 1] = 1;
                            }

                        }

                    }
                }

                definition[i - 1][j - 1] = 0;
                definition[i][j] = 1;

                maps[i - 1][j - 1] = 1;
                maps[i][j] = 2;

                location[i - 1][j - 1] = 0;
                location[i][j] = 11;
            }

            if (i - 1 > -1 && i - 1 < 8 && j + 1 > -1 && j + 1 < 8 && maps[i - 1][j + 1] == 1) {

                definition[i - 1][j + 1] = 1;
                definition[i][j] = 0;

                maps[i - 1][j + 1] = 2;
                maps[i][j] = 0;

                location[i - 1][j + 1] = 11;
                location[i][j] = 0;

                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {

                        if (location[k][l] == 16) {

                            KingSituation kingSituationTest = new KingSituation(k, l, true, maps, location);
                            boolean KingsituationTime = kingSituationTest.information();

                            if (KingsituationTime == false) {
                                result[i - 1][j + 1] = 1;
                            }

                        }

                    }
                }

                definition[i - 1][j + 1] = 0;
                definition[i][j] = 1;

                maps[i - 1][j + 1] = 0;
                maps[i][j] = 2;

                location[i - 1][j + 1] = 0;
                location[i][j] = 11;
            }

            if (definition[i - 1][j] == 0) {

                definition[i - 1][j] = 1;
                definition[i][j] = 0;

                maps[i - 1][j] = 2;
                maps[i][j] = 0;

                location[i - 1][j] = 11;
                location[i][j] = 0;

                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {

                        if (location[k][l] == 16) {

                            KingSituation kingSituationTest = new KingSituation(k, l, true, maps, location);
                            boolean KingsituationTime = kingSituationTest.information();

                            if (KingsituationTime == false) {
                                result[i - 1][j] = 1;
                            }

                        }

                    }
                }

                definition[i - 1][j] = 0;
                definition[i][j] = 1;

                maps[i - 1][j] = 0;
                maps[i][j] = 2;

                location[i - 1][j] = 0;
                location[i][j] = 11;
            }

            if (number == true) {
                if (definition[i - 2][j] == 0 && definition[i - 1][j] == 0) {

                    definition[i - 2][j] = 1;
                    definition[i][j] = 0;

                    maps[i - 2][j] = 2;
                    maps[i][j] = 0;

                    location[i - 2][j] = 11;
                    location[i][j] = 0;

                    for (int k = 0; k < 8; k++) {
                        for (int l = 0; l < 8; l++) {

                            if (location[k][l] == 16) {

                                KingSituation kingSituationTest = new KingSituation(k, l, true, maps, location);
                                boolean KingsituationTime = kingSituationTest.information();

                                if (KingsituationTime == false) {
                                    result[i - 2][j - 1] = 1;
                                }

                            }

                        }
                    }

                    definition[i - 2][j] = 0;
                    definition[i][j] = 1;

                    maps[i - 2][j] = 0;
                    maps[i][j] = 2;

                    location[i - 2][j] = 0;
                    location[i][j] = 11;
                }
            }

        }
        if (difration == false) {

            if (i + 1 > -1 && i + 1 < 8 && j + 1 > -1 && j + 1 < 8 && maps[i + 1][j + 1] == 2) {

                definition[i + 1][j + 1] = 1;
                definition[i][j] = 0;

                maps[i + 1][j + 1] = 1;
                maps[i][j] = 0;

                location[i + 1][j + 1] = 1;
                location[i][j] = 0;

                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {

                        if (location[k][l] == 6) {

                            KingSituation kingSituationTest = new KingSituation(k, l, false, maps, location);
                            boolean KingsituationTime = kingSituationTest.information();

                            if (KingsituationTime == false) {
                                result[i + 1][j + 1] = 1;
                            }

                        }

                    }
                }

                definition[i + 1][j + 1] = 0;
                definition[i][j] = 1;

                maps[i + 1][j + 1] = 0;
                maps[i][j] = 1;

                location[i + 1][j + 1] = 0;
                location[i][j] = 1;
            }

            if (i + 1 > -1 && i + 1 < 8 && j - 1 > -1 && j - 1 < 8 && maps[i + 1][j - 1] == 2) {

                definition[i + 1][j - 1] = 1;
                definition[i][j] = 0;

                maps[i + 1][j - 1] = 1;
                maps[i][j] = 0;

                location[i + 1][j - 1] = 1;
                location[i][j] = 0;

                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {

                        if (location[k][l] == 6) {

                            KingSituation kingSituationTest = new KingSituation(k, l, false, maps, location);
                            boolean KingsituationTime = kingSituationTest.information();

                            if (KingsituationTime == false) {
                                result[i + 1][j - 1] = 1;
                            }

                        }

                    }
                }

                definition[i + 1][j - 1] = 0;
                definition[i][j] = 1;

                maps[i + 1][j - 1] = 0;
                maps[i][j] = 1;

                location[i + 1][j - 1] = 0;
                location[i][j] = 1;
            }

            if (definition[i + 1][j] == 0) {

                definition[i + 1][j] = 1;
                definition[i][j] = 0;

                maps[i + 1][j] = 1;
                maps[i][j] = 0;

                location[i + 1][j] = 1;
                location[i][j] = 0;

                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {

                        if (location[k][l] == 6) {

                            KingSituation kingSituationTest = new KingSituation(k, l, false, maps, location);
                            boolean KingsituationTime = kingSituationTest.information();

                            if (KingsituationTime == false) {
                                result[i + 1][j] = 1;
                            }

                        }

                    }
                }

                definition[i + 1][j] = 0;
                definition[i][j] = 1;

                maps[i + 1][j] = 0;
                maps[i][j] = 1;

                location[i + 1][j] = 0;
                location[i][j] = 1;
            }

            if (number == true) {
                if (definition[i + 2][j] == 0 && definition[i + 1][j] == 0) {

                    definition[i + 2][j] = 1;
                    definition[i][j] = 0;

                    maps[i + 2][j] = 1;
                    maps[i][j] = 0;

                    location[i + 2][j] = 1;
                    location[i][j] = 0;

                    for (int k = 0; k < 8; k++) {
                        for (int l = 0; l < 8; l++) {

                            if (location[k][l] == 6) {

                                KingSituation kingSituationTest = new KingSituation(k, l, false, maps, location);
                                boolean KingsituationTime = kingSituationTest.information();

                                if (KingsituationTime == false) {
                                    result[i + 2][j] = 1;
                                }

                            }

                        }
                    }

                    definition[i + 2][j] = 0;
                    definition[i][j] = 1;

                    maps[i + 2][j] = 0;
                    maps[i][j] = 1;

                    location[i + 2][j] = 0;
                    location[i][j] = 1;
                }
            }

        }

        this.result = result;

    }
 
    public int[][] information(){
        return result;
    }
    
}
