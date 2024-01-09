class ReverseInArary {

    static int[] reverseArray(int[] arr) {

        int s = arr[0];
        int e = arr.length - 1;
        while (s <= e) {
            int t = arr[s];
            arr[s] = arr[e];
            arr[e] = t;
            s++;
            e--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 23, 4, 5, 5, 7, 7, 9 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        reverseArray(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}