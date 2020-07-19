package chess;

public class KnightCheck {

    private int[][] result;

    public KnightCheck(int i, int j, int[][] Definition, boolean number, int[][] maps, int[][] location) {

        int[][] result = new int[8][8];

        for (int k = 0; k < 8; k++) {
            for (int l = 0; l < 8; l++) {
                result[k][l] = 0;

            }
        }

        if (number == true) {

            if ((i + 2) > -1 && (i + 2) < 8 && (j + 1) > -1 && (j + 1) < 8 && maps[i + 2][j + 1] == 0) {

                maps[i + 2][j + 1] = 2;
                maps[i][j] = 0;

                int remember = location[i + 2][j + 1];

                location[i + 2][j + 1] = 13;
                location[i][j] = 0;

                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {

                        if (location[k][l] == 16) {
                            
                            KingSituation kingSituationTest = new KingSituation(k, l, true, maps, location);
                            boolean KingSituaTionTime = kingSituationTest.information();

                            if (KingSituaTionTime == false) {
                                result[i + 2][j + 1] = 1;
                            }

                        }

                    }
                }
                maps[i + 2][j + 1] = 0;
                maps[i][j] = 2;

                location[i + 2][j + 1] = remember;
                location[i][j] = 13;
            }

            if ((i + 2) > -1 && (i + 2) < 8 && (j + 1) > -1 && (j + 1) < 8 && maps[i + 2][j + 1] == 1) {

                maps[i + 2][j + 1] = 2;
                maps[i][j] = 0;

                int remember = location[i + 2][j + 1];

                location[i + 2][j + 1] = 13;
                location[i][j] = 0;

                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {

                        if (location[k][l] == 16) {
                            KingSituation kingSituationTest = new KingSituation(k, l, true, maps, location);
                            boolean KingSituaTionTime = kingSituationTest.information();

                            if (KingSituaTionTime == false) {
                                result[i + 2][j + 1] = 1;
                            }

                        }

                    }
                }
                maps[i + 2][j + 1] = 1;
                maps[i][j] = 2;

                location[i + 2][j + 1] = remember;
                location[i][j] = 13;
            }

            if ((i + 2) > -1 && (i + 2) < 8 && (j - 1) > -1 && (j - 1) < 8 && maps[i + 2][j - 1] == 0) {

                maps[i + 2][j - 1] = 2;
                maps[i][j] = 0;

                int remember = location[i + 2][j - 1];

                location[i + 2][j - 1] = 13;
                location[i][j] = 0;

                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {

                        if (location[k][l] == 16) {
                            KingSituation kingSituationTest = new KingSituation(k, l, true, maps, location);
                            boolean KingSituaTionTime = kingSituationTest.information();

                            if (KingSituaTionTime == false) {
                                result[i + 2][j - 1] = 1;
                            }

                        }

                    }
                }
                maps[i + 2][j - 1] = 0;
                maps[i][j] = 2;

                location[i + 2][j - 1] = remember;
                location[i][j] = 13;
            }

            if ((i + 2) > -1 && (i + 2) < 8 && (j - 1) > -1 && (j - 1) < 8 && maps[i + 2][j - 1] == 1) {

                maps[i + 2][j - 1] = 2;
                maps[i][j] = 0;

                int remember = location[i + 2][j - 1];

                location[i + 2][j - 1] = 13;
                location[i][j] = 0;

                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {

                        if (location[k][l] == 16) {
                            KingSituation kingSituationTest = new KingSituation(k, l, true, maps, location);
                            boolean KingSituaTionTime = kingSituationTest.information();

                            if (KingSituaTionTime == false) {
                                result[i + 2][j - 1] = 1;
                            }

                        }

                    }
                }
                maps[i + 2][j - 1] = 1;
                maps[i][j] = 2;

                location[i + 2][j - 1] = remember;
                location[i][j] = 13;
            }

            if ((i + 1) > -1 && (i + 1) < 8 && (j + 2) > -1 && (j + 2) < 8 && maps[i + 1][j + 2] == 0) {

                maps[i + 1][j + 2] = 2;
                maps[i][j] = 0;

                int remember = location[i + 1][j + 2];

                location[i + 1][j + 2] = 13;
                location[i][j] = 0;

                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {

                        if (location[k][l] == 16) {
                            KingSituation kingSituationTest = new KingSituation(k, l, true, maps, location);
                            boolean KingSituaTionTime = kingSituationTest.information();

                            if (KingSituaTionTime == false) {
                                result[i + 1][j + 2] = 1;
                            }

                        }

                    }
                }
                maps[i + 1][j + 2] = 0;
                maps[i][j] = 2;

                location[i + 1][j + 2] = remember;
                location[i][j] = 13;
            }

            if ((i + 1) > -1 && (i + 1) < 8 && (j + 2) > -1 && (j + 2) < 8 && maps[i + 1][j + 2] == 1) {

                maps[i + 1][j + 2] = 2;
                maps[i][j] = 0;

                int remember = location[i + 1][j + 2];

                location[i + 1][j + 2] = 13;
                location[i][j] = 0;

                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {

                        if (location[k][l] == 16) {
                            KingSituation kingSituationTest = new KingSituation(k, l, true, maps, location);
                            boolean KingSituaTionTime = kingSituationTest.information();

                            if (KingSituaTionTime == false) {
                                result[i + 1][j + 2] = 1;
                            }

                        }

                    }
                }
                maps[i + 1][j + 2] = 1;
                maps[i][j] = 2;

                location[i + 1][j + 2] = remember;
                location[i][j] = 13;
            }

            if ((i + 1) > -1 && (i + 1) < 8 && (j - 2) > -1 && (j - 2) < 8 && maps[i + 1][j - 2] == 0) {

                maps[i + 1][j - 2] = 2;
                maps[i][j] = 0;

                int remember = location[i + 1][j - 2];

                location[i + 1][j - 2] = 13;
                location[i][j] = 0;

                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {

                        if (location[k][l] == 16) {
                            KingSituation kingSituationTest = new KingSituation(k, l, true, maps, location);
                            boolean KingSituaTionTime = kingSituationTest.information();

                            if (KingSituaTionTime == false) {
                                result[i + 1][j - 2] = 1;
                            }

                        }

                    }
                }
                maps[i + 1][j - 2] = 0;
                maps[i][j] = 2;

                location[i + 1][j - 2] = remember;
                location[i][j] = 13;

            }

            if ((i + 1) > -1 && (i + 1) < 8 && (j - 2) > -1 && (j - 2) < 8 && maps[i + 1][j - 2] == 1) {

                maps[i + 1][j - 2] = 2;
                maps[i][j] = 0;

                int remember = location[i + 1][j - 2];

                location[i + 1][j - 2] = 13;
                location[i][j] = 0;

                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {

                        if (location[k][l] == 16) {
                            KingSituation kingSituationTest = new KingSituation(k, l, true, maps, location);
                            boolean KingSituaTionTime = kingSituationTest.information();

                            if (KingSituaTionTime == false) {
                                result[i + 1][j - 2] = 1;
                            }

                        }

                    }
                }
                maps[i + 1][j - 2] = 1;
                maps[i][j] = 2;

                location[i + 1][j - 2] = remember;
                location[i][j] = 13;
            }

            if ((i - 2) > -1 && (i - 2) < 8 && (j + 1) > -1 && (j + 1) < 8 && maps[i - 2][j + 1] == 0) {

                maps[i - 2][j + 1] = 2;
                maps[i][j] = 0;

                int remember = location[i - 2][j + 1];

                location[i - 2][j + 1] = 13;
                location[i][j] = 0;

                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {

                        if (location[k][l] == 16) {
                            KingSituation kingSituationTest = new KingSituation(k, l, true, maps, location);
                            boolean KingSituaTionTime = kingSituationTest.information();

                            if (KingSituaTionTime == false) {
                                result[i - 2][j + 1] = 1;
                            }

                        }

                    }
                }
                maps[i - 2][j + 1] = 0;
                maps[i][j] = 2;

                location[i - 2][j + 1] = remember;
                location[i][j] = 13;
            }

            if ((i - 2) > -1 && (i - 2) < 8 && (j + 1) > -1 && (j + 1) < 8 && maps[i - 2][j + 1] == 1) {

                maps[i - 2][j + 1] = 2;
                maps[i][j] = 0;

                int remember = location[i - 2][j + 1];

                location[i - 2][j + 1] = 13;
                location[i][j] = 0;

                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {

                        if (location[k][l] == 16) {
                            KingSituation kingSituationTest = new KingSituation(k, l, true, maps, location);
                            boolean KingSituaTionTime = kingSituationTest.information();

                            if (KingSituaTionTime == false) {
                                result[i - 2][j + 1] = 1;
                            }

                        }

                    }
                }
                maps[i - 2][j + 1] = 1;
                maps[i][j] = 2;

                location[i - 2][j + 1] = remember;
                location[i][j] = 13;
            }

            if ((i - 2) > -1 && (i - 2) < 8 && (j - 1) > -1 && (j - 1) < 8 && maps[i - 2][j - 1] == 0) {

                maps[i - 2][j - 1] = 2;
                maps[i][j] = 0;

                int remember = location[i - 2][j - 1];

                location[i - 2][j - 1] = 13;
                location[i][j] = 0;

                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {

                        if (location[k][l] == 16) {
                            KingSituation kingSituationTest = new KingSituation(k, l, true, maps, location);
                            boolean KingSituaTionTime = kingSituationTest.information();

                            if (KingSituaTionTime == false) {
                                result[i - 2][j - 1] = 1;
                            }

                        }

                    }
                }
                maps[i - 2][j - 1] = 0;
                maps[i][j] = 2;

                location[i - 2][j - 1] = remember;
                location[i][j] = 13;
            }

            if ((i - 2) > -1 && (i - 2) < 8 && (j - 1) > -1 && (j - 1) < 8 && maps[i - 2][j - 1] == 1) {

                maps[i - 2][j - 1] = 2;
                maps[i][j] = 0;

                int remember = location[i - 2][j - 1];

                location[i - 2][j - 1] = 13;
                location[i][j] = 0;

                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {

                        if (location[k][l] == 16) {
                            KingSituation kingSituationTest = new KingSituation(k, l, true, maps, location);
                            boolean KingSituaTionTime = kingSituationTest.information();

                            if (KingSituaTionTime == false) {
                                result[i - 2][j - 1] = 1;
                            }

                        }

                    }
                }
                maps[i - 2][j - 1] = 1;
                maps[i][j] = 2;

                location[i - 2][j - 1] = remember;
                location[i][j] = 13;
            }

            if ((i - 1) > -1 && (i - 1) < 8 && (j + 2) > -1 && (j + 2) < 8 && maps[i - 1][j + 2] == 0) {

                maps[i - 1][j + 2] = 2;
                maps[i][j] = 0;

                int remember = location[i - 1][j + 2];

                location[i - 1][j + 2] = 13;
                location[i][j] = 0;

                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {

                        if (location[k][l] == 16) {
                            KingSituation kingSituationTest = new KingSituation(k, l, true, maps, location);
                            boolean KingSituaTionTime = kingSituationTest.information();

                            if (KingSituaTionTime == false) {
                                result[i - 1][j + 2] = 1;
                            }

                        }

                    }
                }
                maps[i - 1][j + 2] = 0;
                maps[i][j] = 2;

                location[i - 1][j + 2] = remember;
                location[i][j] = 13;
            }

            if ((i - 1) > -1 && (i - 1) < 8 && (j + 2) > -1 && (j + 2) < 8 && maps[i - 1][j + 2] == 1) {

                maps[i - 1][j + 2] = 2;
                maps[i][j] = 0;

                int remember = location[i - 1][j + 2];

                location[i - 1][j + 2] = 13;
                location[i][j] = 0;

                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {

                        if (location[k][l] == 16) {
                            KingSituation kingSituationTest = new KingSituation(k, l, true, maps, location);
                            boolean KingSituaTionTime = kingSituationTest.information();

                            if (KingSituaTionTime == false) {
                                result[i - 1][j + 2] = 1;
                            }

                        }

                    }
                }
                maps[i - 1][j + 2] = 1;
                maps[i][j] = 2;

                location[i - 1][j + 2] = remember;
                location[i][j] = 13;
            }

            if ((i - 1) > -1 && (i - 1) < 8 && (j - 2) > -1 && (j - 2) < 8 && maps[i - 1][j - 2] == 0) {

                maps[i - 1][j - 2] = 2;
                maps[i][j] = 0;

                int remember = location[i - 1][j - 2];

                location[i - 1][j - 2] = 13;
                location[i][j] = 0;

                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {

                        if (location[k][l] == 16) {
                            KingSituation kingSituationTest = new KingSituation(k, l, true, maps, location);
                            boolean KingSituaTionTime = kingSituationTest.information();

                            if (KingSituaTionTime == false) {
                                result[i - 1][j - 2] = 1;
                            }

                        }

                    }
                }
                maps[i - 1][j - 2] = 0;
                maps[i][j] = 2;

                location[i - 1][j - 2] = remember;
                location[i][j] = 13;
            }

            if ((i - 1) > -1 && (i - 1) < 8 && (j - 2) > -1 && (j - 2) < 8 && maps[i - 1][j - 2] == 1) {

                maps[i - 1][j - 2] = 2;
                maps[i][j] = 0;

                int remember = location[i - 1][j - 2];

                location[i - 1][j - 2] = 13;
                location[i][j] = 0;

                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {

                        if (location[k][l] == 16) {
                            KingSituation kingSituationTest = new KingSituation(k, l, true, maps, location);
                            boolean KingSituaTionTime = kingSituationTest.information();

                            if (KingSituaTionTime == false) {
                                result[i - 1][j - 2] = 1;
                            }

                        }

                    }
                }
                maps[i - 1][j - 2] = 1;
                maps[i][j] = 2;

                location[i - 1][j - 2] = remember;
                location[i][j] = 13;
            }

        }
        if (number == false) {

            if ((i + 2) > -1 && (i + 2) < 8 && (j + 1) > -1 && (j + 1) < 8 && maps[i + 2][j + 1] == 0) {

                maps[i + 2][j + 1] = 1;
                maps[i][j] = 0;

                int remember = location[i + 2][j + 1];

                location[i + 2][j + 1] = 2;
                location[i][j] = 3;

                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {

                        if (location[k][l] == 6) {
                            KingSituation kingSituationTest = new KingSituation(k, l, false, maps, location);
                            boolean KingSituaTionTime = kingSituationTest.information();

                            if (KingSituaTionTime == false) {
                                result[i + 2][j + 1] = 1;
                            }

                        }

                    }
                }
                maps[i + 2][j + 1] = 0;
                maps[i][j] = 1;

                location[i + 2][j + 1] = remember;
                location[i][j] = 3;
            }

            if ((i + 2) > -1 && (i + 2) < 8 && (j + 1) > -1 && (j + 1) < 8 && maps[i + 2][j + 1] == 2) {
                maps[i + 2][j + 1] = 1;
                maps[i][j] = 0;

                int remember = location[i - 1][j - 2];

                location[i + 2][j + 1] = 0;
                location[i][j] = 3;

                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {

                        if (location[k][l] == 6) {
                            KingSituation kingSituationTest = new KingSituation(k, l, false, maps, location);
                            boolean KingSituaTionTime = kingSituationTest.information();

                            if (KingSituaTionTime == false) {
                                result[i + 2][j + 1] = 1;
                            }

                        }

                    }
                }
                maps[i + 2][j + 1] = 2;
                maps[i][j] = 1;

                location[i + 2][j + 1] = remember;
                location[i][j] = 3;
            }

            if ((i + 2) > -1 && (i + 2) < 8 && (j - 1) > -1 && (j - 1) < 8 && maps[i + 2][j - 1] == 0) {

                maps[i + 2][j - 1] = 1;
                maps[i][j] = 0;

                int remember = location[i + 2][j - 1];

                location[i + 2][j - 1] = 3;
                location[i][j] = 0;

                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {

                        if (location[k][l] == 6) {
                            KingSituation kingSituationTest = new KingSituation(k, l, false, maps, location);
                            boolean KingSituaTionTime = kingSituationTest.information();

                            if (KingSituaTionTime == false) {
                                result[i + 2][j - 1] = 1;
                            }

                        }

                    }
                }
                maps[i + 2][j - 1] = 0;
                maps[i][j] = 1;

                location[i + 2][j - 1] = remember;
                location[i][j] = 3;
            }

            if ((i + 2) > -1 && (i + 2) < 8 && (j - 1) > -1 && (j - 1) < 8 && maps[i + 2][j - 1] == 2) {

                maps[i + 2][j - 1] = 1;
                maps[i][j] = 0;

                int remember = location[i + 2][j - 1];

                location[i + 2][j - 1] = 3;
                location[i][j] = 0;

                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {

                        if (location[k][l] == 6) {
                            KingSituation kingSituationTest = new KingSituation(k, l, false, maps, location);
                            boolean KingSituaTionTime = kingSituationTest.information();

                            if (KingSituaTionTime == false) {
                                result[i + 2][j - 1] = 1;
                            }

                        }

                    }
                }
                maps[i + 2][j - 1] = 2;
                maps[i][j] = 1;

                location[i + 2][j - 1] = remember;
                location[i][j] = 3;
            }

            if ((i + 1) > -1 && (i + 1) < 8 && (j + 2) > -1 && (j + 2) < 8 && maps[i + 1][j + 2] == 0) {

                maps[i + 1][j + 2] = 1;
                maps[i][j] = 0;

                int remember = location[i + 1][j + 2];

                location[i + 1][j + 2] = 3;
                location[i][j] = 0;

                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {

                        if (location[k][l] == 6) {
                            KingSituation kingSituationTest = new KingSituation(k, l, false, maps, location);
                            boolean KingSituaTionTime = kingSituationTest.information();

                            if (KingSituaTionTime == false) {
                                result[i + 1][j + 2] = 1;
                            }

                        }

                    }
                }

                maps[i + 1][j + 2] = 0;
                maps[i][j] = 1;

                location[i + 1][j + 2] = remember;
                location[i][j] = 3;
            }

            if ((i + 1) > -1 && (i + 1) < 8 && (j + 2) > -1 && (j + 2) < 8 && maps[i + 1][j + 2] == 2) {

                maps[i + 1][j + 2] = 1;
                maps[i][j] = 0;

                int remember = location[i + 1][j + 2];

                location[i + 1][j + 2] = 3;
                location[i][j] = 0;

                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {

                        if (location[k][l] == 6) {
                            KingSituation kingSituationTest = new KingSituation(k, l, false, maps, location);
                            boolean KingSituaTionTime = kingSituationTest.information();

                            if (KingSituaTionTime == false) {
                                result[i + 1][j + 2] = 1;
                            }

                        }

                    }
                }

                maps[i + 1][j + 2] = 2;
                maps[i][j] = 1;

                location[i + 1][j + 2] = remember;
                location[i][j] = 3;
            }

            if ((i + 1) > -1 && (i + 1) < 8 && (j - 2) > -1 && (j - 2) < 8 && maps[i + 1][j - 2] == 0) {

                maps[i + 1][j - 2] = 1;
                maps[i][j] = 0;

                int remember = location[i + 1][j - 2];

                location[i + 1][j - 2] = 3;
                location[i][j] = 0;

                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {

                        if (location[k][l] == 6) {
                            KingSituation kingSituationTest = new KingSituation(k, l, false, maps, location);
                            boolean KingSituaTionTime = kingSituationTest.information();

                            if (KingSituaTionTime == false) {
                                result[i + 1][j - 2] = 1;
                            }

                        }

                    }
                }
                maps[i + 1][j - 2] = 0;
                maps[i][j] = 1;

                location[i + 1][j - 2] = remember;
                location[i][j] = 3;

            }

            if ((i + 1) > -1 && (i + 1) < 8 && (j - 2) > -1 && (j - 2) < 8 && maps[i + 1][j - 2] == 2) {

                maps[i + 1][j - 2] = 1;
                maps[i][j] = 0;

                int remember = location[i + 1][j - 2];

                location[i + 1][j - 2] = 3;
                location[i][j] = 0;

                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {

                        if (location[k][l] == 6) {
                            KingSituation kingSituationTest = new KingSituation(k, l, false, maps, location);
                            boolean KingSituaTionTime = kingSituationTest.information();

                            if (KingSituaTionTime == false) {
                                result[i + 1][j - 2] = 1;
                            }

                        }

                    }
                }
                maps[i + 1][j - 2] = 2;
                maps[i][j] = 1;

                location[i + 1][j - 2] = remember;
                location[i][j] = 3;

            }

            if ((i - 2) > -1 && (i - 2) < 8 && (j + 1) > -1 && (j + 1) < 8 && maps[i - 2][j + 1] == 0) {

                maps[i - 2][j + 1] = 1;
                maps[i][j] = 0;

                int remember = location[i - 2][j + 1];

                location[i - 2][j + 1] = 3;
                location[i][j] = 0;

                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {

                        if (location[k][l] == 6) {
                            KingSituation kingSituationTest = new KingSituation(k, l, false, maps, location);
                            boolean KingSituaTionTime = kingSituationTest.information();

                            if (KingSituaTionTime == false) {
                                result[i - 2][j + 1] = 1;
                            }

                        }

                    }
                }
                maps[i - 2][j + 1] = 0;
                maps[i][j] = 1;

                location[i - 2][j + 1] = remember;
                location[i][j] = 3;
            }

            if ((i - 2) > -1 && (i - 2) < 8 && (j + 1) > -1 && (j + 1) < 8 && maps[i - 2][j + 1] == 2) {

                maps[i - 2][j + 1] = 1;
                maps[i][j] = 0;

                int remember = location[i - 2][j + 1];

                location[i - 2][j + 1] = 3;
                location[i][j] = 0;

                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {

                        if (location[k][l] == 6) {
                            KingSituation kingSituationTest = new KingSituation(k, l, false, maps, location);
                            boolean KingSituaTionTime = kingSituationTest.information();

                            if (KingSituaTionTime == false) {
                                result[i - 2][j + 1] = 1;
                            }

                        }

                    }
                }
                maps[i - 2][j + 1] = 2;
                maps[i][j] = 1;

                location[i - 2][j + 1] = remember;
                location[i][j] = 3;

            }

            if ((i - 2) > -1 && (i - 2) < 8 && (j - 1) > -1 && (j - 1) < 8 && maps[i - 2][j - 1] == 0) {

                maps[i - 2][j - 1] = 1;
                maps[i][j] = 0;

                int remember = location[i - 2][j - 1];

                location[i - 2][j - 1] = 3;
                location[i][j] = 0;

                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {

                        if (location[k][l] == 6) {
                            KingSituation kingSituationTest = new KingSituation(k, l, false, maps, location);
                            boolean KingSituaTionTime = kingSituationTest.information();

                            if (KingSituaTionTime == false) {
                                result[i - 2][j - 1] = 1;
                            }

                        }

                    }
                }
                maps[i - 2][j - 1] = 0;
                maps[i][j] = 1;

                location[i - 2][j - 1] = remember;
                location[i][j] = 3;
            }

            if ((i - 2) > -1 && (i - 2) < 8 && (j - 1) > -1 && (j - 1) < 8 && maps[i - 2][j - 1] == 2) {

                maps[i - 2][j - 1] = 1;
                maps[i][j] = 0;

                int remember = location[i - 2][j - 1];

                location[i - 2][j - 1] = 3;
                location[i][j] = 0;

                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {

                        if (location[k][l] == 6) {
                            KingSituation kingSituationTest = new KingSituation(k, l, false, maps, location);
                            boolean KingSituaTionTime = kingSituationTest.information();

                            if (KingSituaTionTime == false) {
                                result[i - 2][j - 1] = 1;
                            }

                        }

                    }
                }
                maps[i - 2][j - 1] = 2;
                maps[i][j] = 1;

                location[i - 2][j - 1] = remember;
                location[i][j] = 3;
            }

            if ((i - 1) > -1 && (i - 1) < 8 && (j + 2) > -1 && (j + 2) < 8 && maps[i - 1][j + 2] == 0) {

                maps[i - 1][j + 2] = 1;
                maps[i][j] = 0;

                int remember = location[i - 1][j + 2];

                location[i - 1][j + 2] = 3;
                location[i][j] = 0;

                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {

                        if (location[k][l] == 6) {
                            KingSituation kingSituationTest = new KingSituation(k, l, false, maps, location);
                            boolean KingSituaTionTime = kingSituationTest.information();

                            if (KingSituaTionTime == false) {
                                result[i - 1][j + 2] = 1;
                            }

                        }

                    }
                }
                maps[i - 1][j + 2] = 0;
                maps[i][j] = 1;

                location[i - 1][j + 2] = remember;
                location[i][j] = 3;
            }

            if ((i - 1) > -1 && (i - 1) < 8 && (j + 2) > -1 && (j + 2) < 8 && maps[i - 1][j + 2] == 2) {

                maps[i - 1][j + 2] = 1;
                maps[i][j] = 0;

                int remember = location[i - 1][j + 2];

                location[i - 1][j + 2] = 3;
                location[i][j] = 0;

                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {

                        if (location[k][l] == 6) {
                            KingSituation kingSituationTest = new KingSituation(k, l, false, maps, location);
                            boolean KingSituaTionTime = kingSituationTest.information();

                            if (KingSituaTionTime == false) {
                                result[i - 1][j + 2] = 1;
                            }

                        }

                    }
                }
                maps[i - 1][j + 2] = 2;
                maps[i][j] = 1;

                location[i - 1][j + 2] = remember;
                location[i][j] = 3;
            }

            if ((i - 1) > -1 && (i - 1) < 8 && (j - 2) > -1 && (j - 2) < 8 && maps[i - 1][j - 2] == 0) {

                maps[i - 1][j - 2] = 1;
                maps[i][j] = 0;

                int remember = location[i - 1][j - 2];

                location[i - 1][j + 2] = 3;
                location[i][j] = 0;

                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {

                        if (location[k][l] == 6) {
                            KingSituation kingSituationTest = new KingSituation(k, l, false, maps, location);
                            boolean KingSituaTionTime = kingSituationTest.information();

                            if (KingSituaTionTime == false) {
                                result[i - 1][j - 2] = 1;
                            }

                        }

                    }
                }
                maps[i - 1][j - 2] = 0;
                maps[i][j] = 1;

                location[i - 1][j - 2] = remember;
                location[i][j] = 3;
            }

            if ((i - 1) > -1 && (i - 1) < 8 && (j - 2) > -1 && (j - 2) < 8 && maps[i - 1][j - 2] == 2) {

                maps[i - 1][j - 2] = 1;
                maps[i][j] = 0;

                int remember = location[i - 1][j - 2];

                location[i - 1][j + 2] = 3;
                location[i][j] = 0;

                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {

                        if (location[k][l] == 6) {
                            KingSituation kingSituationTest = new KingSituation(k, l, false, maps, location);
                            boolean KingSituaTionTime = kingSituationTest.information();

                            if (KingSituaTionTime == false) {
                                result[i - 1][j - 2] = 1;
                            }

                        }

                    }
                }
                maps[i - 1][j - 2] = 2;
                maps[i][j] = 1;

                location[i - 1][j - 2] = remember;
                location[i][j] = 3;
            }

        }
        this.result = result;
    }

    public int[][] information() {
        return result;
    }

}
