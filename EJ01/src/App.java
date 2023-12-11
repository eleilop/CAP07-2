public class App {
    public static void main(String[] args) throws Exception {
        int[][] num = new int[3][6];
        num[0][0] = 0;
        num[0][1] = 30;
        num[0][2] = 2;
        num[0][5] = 5;
        num[1][0] = 75;
        num[1][4] = 0;
        num[2][2] = -2;
        num[2][3] = 9;
        num[2][5] = 11;
        for(int x = 0; x < 3; x++) {
            System.out.print("Fila: " + x);
            for(int y = 0; y < 6; y++) {
                System.out.printf("%10d ", num[x][y]);
            }
            System.out.println();
        }
    }
}