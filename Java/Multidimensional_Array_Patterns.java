public class App {
    public static void main(String[] args) throws Exception {
        String[][] mdArray = {
                { "S", "L", "A", "M" },
                { "T", "I", "L", "E" },
                { "E", "A", "T", "S" },
                { "P", "R", "O", "S" }
        };

        int i, j;
        // Base Table
        for (i = 0; i < mdArray.length; i++) {
            for (j = 0; j < mdArray.length; j++) {
                System.out.print(mdArray[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");

        System.out.println("Accross & Down:");
        System.out.print("1.\n");
        // 1. SLAM
        for (i = 0; i < mdArray.length; i++) {
            for (j = 0; j < mdArray.length; j++) {
                if (i == 0) {
                    System.out.print(mdArray[i][j] + " ");
                }
            }
        }

        // 2. TILE
        System.out.println("\n");
        System.out.print("2.\n");
        for (i = 0; i < mdArray.length; i++) {
            for (j = 0; j < mdArray.length; j++) {
                if (i == 1) {
                    System.out.print(mdArray[i][j] + " ");
                }
            }
        }

        // 3. PROS
        System.out.println("\n");
        System.out.print("3.\n");
        for (i = 0; i < mdArray.length; i++) {
            for (j = 0; j < mdArray.length; j++) {
                if (i == 3) {
                    System.out.print(mdArray[i][j] + " ");
                }
            }
        }

        // 4. PRO
        System.out.println("\n");
        System.out.print("4.\n");
        for (i = 0; i < mdArray.length; i++) {
            for (j = 0; j < mdArray.length - 1; j++) {
                if (i == 3) {
                    System.out.print(mdArray[i][j] + " ");
                }
            }
        }

        // 5. STEP
        System.out.println("\n");
        System.out.print("5.\n");
        for (i = 0; i < mdArray.length; i++) {
            for (j = 0; j < mdArray.length; j++) {
                if (j == 0) {
                    System.out.println(mdArray[i][j] + " ");
                }
            }
        }

        // 6. LIAR
        System.out.println("\n");
        System.out.print("6.\n");
        for (i = 0; i < mdArray.length; i++) {
            for (j = 0; j < mdArray.length; j++) {
                if (j == 1) {
                    System.out.println(mdArray[i][j] + " ");
                }
            }
        }

        // 7. ALTO
        System.out.println("\n");
        System.out.print("7.\n");
        for (i = 0; i < mdArray.length; i++) {
            for (j = 0; j < mdArray.length; j++) {
                if (j == 2) {
                    System.out.println(mdArray[i][j] + " ");
                }
            }
        }

        // 8. ALT
        System.out.println("\n");
        System.out.print("8.\n");
        for (i = 0; i < mdArray.length - 1; i++) {
            for (j = 0; j < mdArray.length; j++) {
                if (j == 2) {
                    System.out.println(mdArray[i][j] + " ");
                }
            }
        }

        // 9. MESS
        System.out.println("\n");
        System.out.print("9.\n");
        for (i = 0; i < mdArray.length; i++) {
            for (j = 0; j < mdArray.length; j++) {
                if (j == 3) {
                    System.out.println(mdArray[i][j] + " ");
                }
            }
        }

        // 10. SEM
        System.out.println("\n");
        System.out.println("\nReverse:");
        System.out.print("10.\n");
        for (i = mdArray.length - 2; i >= 0; i--) {
            for (j = 0; j < mdArray.length; j++) {
                if (j == 3) {
                    System.out.println(mdArray[i][j] + " ");
                }
            }
        }

        // 11. PETS
        System.out.println("\n");
        System.out.print("11.\n");
        for (i = mdArray.length - 1; i >= 0; i--) {
            for (j = 0; j < mdArray.length; j++) {
                if (j == 0) {
                    System.out.println(mdArray[i][j] + " ");
                }
            }
        }

        // 12. PET
        System.out.println("\n");
        System.out.print("12.\n");
        for (i = mdArray.length - 1; i >= 1; i--) {
            for (j = 0; j < mdArray.length; j++) {
                if (j == 0) {
                    System.out.println(mdArray[i][j] + " ");
                }
            }
        }

        // 13. RAIL
        System.out.println("\n");
        System.out.print("13.\n");
        for (i = mdArray.length - 1; i >= 0; i--) {
            for (j = 0; j < mdArray.length; j++) {
                if (j == 1) {
                    System.out.println(mdArray[i][j] + " ");
                }
            }
        }

        // 14. AIL
        System.out.println("\n");
        System.out.print("14.\n");
        for (i = mdArray.length - 2; i >= 0; i--) {
            for (j = 0; j < mdArray.length; j++) {
                if (j == 1) {
                    System.out.println(mdArray[i][j] + " ");
                }
            }
        }

        // 15. LIT
        System.out.print("\n");
        System.out.print("");
        System.out.print("15.\n");
        for (j = mdArray.length - 2; j >= 0; j--) {
            for (i = 0; i < mdArray.length; i++) {
                if (i == 1) {
                    System.out.print(mdArray[i][j] + " ");
                }
            }
        }

        // 16. SITS
        System.out.println("\n");
        System.out.print("DIAGONAL\n");
        System.out.print("16.");
        for (i = 0; i < mdArray.length; i++) {
            System.out.println("");
            for (j = 0; j < mdArray.length; j++) {
                if (i == j) {
                    System.out.print(mdArray[i][j]);
                } else {
                    System.out.print(" ");
                }
            }
        }

        // 17. SIT
        System.out.println("\n");
        System.out.print("17.");
        for (i = 0; i < mdArray.length - 1; i++) {
            System.out.println("");
            for (j = 0; j < mdArray.length; j++) {
                if (i == j) {
                    System.out.print(mdArray[i][j]);
                } else {
                    System.out.print(" ");
                }
            }
        }

        // 18. PALM
        System.out.println("\n");
        System.out.print("18.\n");
        for (i = 0; i < mdArray.length; i++) {
            for (j = 0; j < mdArray.length; j++) {
                if ((i == 0 && j == 3) || (i == 1 && j == 2) || (i == 2 && j == 1) || (i == 3 && j == 0)) {
                    System.out.print(mdArray[i][j]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        // 19. PAL
        System.out.println("\n");
        System.out.print("19.");
        for (i = 0; i < mdArray.length; i++) {
            for (j = 0; j < mdArray.length - 1; j++) {
                if ((i == 3 && j == 0) || (i == 2 && j == 1) || (i == 1 && j == 2) || (i == 0 && j == 3)) {
                    System.out.print(mdArray[i][j]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        // 20. TAO
        System.out.println("\n");
        System.out.print("20.");
        for (i = 0; i < mdArray.length; i++) {

            for (j = 0; j < mdArray.length; j++) {
                if ((i == 3 && j == 2) || (i == 2 && j == 1) || (i == 1 && j == 0)) {
                    System.out.print(mdArray[i][j]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }
}
