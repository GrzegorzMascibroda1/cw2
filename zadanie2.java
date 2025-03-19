public class zadanie2 {
    public static int findDominant(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int ile = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    ile++;
                }
            }
            if (ile > arr.length / 2) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] tablica = {3, 3, 3, 2, 2, 2, 2, 2, 2, 1};
        if (findDominant(tablica) == -1) {
            System.out.print("nie ma dominujacego elementu");
        }
        else {
            System.out.println(findDominant(tablica));
        }
    }
}
