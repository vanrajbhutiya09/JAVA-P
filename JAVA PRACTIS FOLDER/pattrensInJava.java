class pattrensInJava {
    public static void main(String[] args) {

        int n = 20;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }
        // for (int i = n; i > 0; i--) {
        // for (int j = i; j > 0; j--) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

    }
}