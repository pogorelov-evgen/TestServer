public class Logika {
    public static void printMassiv(int[][] mass) {
        for (int i = 0; i < 3; i++) {
            System.out.println("");
            for (int j = 0; j < 3; j++) {
                System.out.print(mass[i][j]);
            }
        }
    }

    public static void poiskChisla(int a, int[][] mass) {
        if (a == 1) mass[0][0] = 0;
        if (a == 2) mass[0][1] = 0;
        if (a == 3) mass[0][2] = 0;
        if (a == 4) mass[1][0] = 0;
        if (a == 5) mass[1][1] = 0;
        if (a == 6) mass[1][2] = 0;
        if (a == 7) mass[2][0] = 0;
        if (a == 8) mass[2][1] = 0;
        if (a == 9) mass[2][2] = 0;
    }

    public static void proverka(int[][] mass) {
        if ((mass[0][0] + mass[1][1] + mass[2][2]) == 0) {
            System.out.println("Client WIN!");

        }
        if ((mass[0][2] + mass[1][1] + mass[2][0]) == 0) {
            System.out.println("Client WIN!");

        }
        if ((mass[0][0] + mass[0][1] + mass[0][2]) == 0) {
            System.out.println("Client WIN!");

        }
        if ((mass[1][0] + mass[1][1] + mass[1][2]) == 0) {
            System.out.println("Client WIN!");

        }
        if ((mass[2][0] + mass[2][1] + mass[2][2]) == 0) {
            System.out.println("Client WIN!");
        }
    }
    public static void randomnoe (int[][] massiv){
            while(true) {
            int random = (int)(Math.random()*10);

            if ((random == 1) && (massiv[0][0] != 0)){
                massiv[0][0] = 0;
                break;
            }
            if ((random == 2) && (massiv[0][1] != 0)){
                massiv[0][1] = 0;
                break;
            }if ((random == 3) && (massiv[0][2] != 0)){
                massiv[0][2] = 0;
                break;
            }if ((random == 4) && (massiv[1][0] != 0)){
                massiv[1][0] = 0;
                break;
            }if ((random == 5) && (massiv[1][1] != 0)){
                massiv[1][1] = 0;
                break;
            }if ((random == 6) && (massiv[1][2] != 0)){
                massiv[1][2] = 0;
                break;
            }if ((random == 7) && (massiv[2][0] != 0)){
                massiv[2][0] = 0;
                break;
            }if ((random == 8) && (massiv[2][1] != 0)){
                massiv[2][1] = 0;
                break;
            }if ((random == 9) && (massiv[2][2] != 0)){
                massiv[2][2] = 0;
                break;
            }

        }

    }
    public static void proverkaServ(int[][] mass) {
        if ((mass[0][0] + mass[1][1] + mass[2][2]) == 0) {
            System.out.println("Client WIN!");

        }
        if ((mass[0][2] + mass[1][1] + mass[2][0]) == 0) {
            System.out.println("Client WIN!");

        }
        if ((mass[0][0] + mass[0][1] + mass[0][2]) == 0) {
            System.out.println("Client WIN!");

        }
        if ((mass[1][0] + mass[1][1] + mass[1][2]) == 0) {
            System.out.println("Client WIN!");

        }
        if ((mass[2][0] + mass[2][1] + mass[2][2]) == 0) {
            System.out.println("Client WIN!");
        }
    }
}
