public class threedArra {
    public static void main(String[] args) {
        //b[1][1]=[3];
        //System.out.println(b[1][1]);
        int[][][] c = {{{1, 2}, {3, 4}}, {{5, 6, 7}}};
        System.out.println(c.length);
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                for(int k = 0; k<c[i][j].length;k++){
                    System.out.print(c[i][j][k] + " ");
                }
                System.out.println();

            }

        }
    }
}
