public class Main {
    public static void main(String[] args) {
        String[][] arr = new String[7][5];

        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[i].length; k++) {
                if (i == 0 || i == 3 || i == 6) {
                    if ( k != 4) {
                        arr[i][k] = " * ";
                    }
                } else if (k == 0 || k == 4) {
                    arr[i][k] = " * ";
                } else {
                    arr[i][k] = "   ";
                }
            }

        }
        for (String[] row : arr) {
            for (String col : row) {
                if ( col != null) {
                    System.out.print(col);
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}