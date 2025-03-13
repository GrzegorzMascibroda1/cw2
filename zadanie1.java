public class zadanie1 {
    public static int[] filterEvenIndexOddValue(int[] arr) {
        int ile =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1 && i % 2 == 0) {
                ile++;
            }
        }
        int[] result = new int[ile];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1 && i % 2 == 0) {
                result[i] = arr[i];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] tablica_1 = {1,2,3,4,5,6};
        int[] wynik = filterEvenIndexOddValue(tablica_1);
        for (int i = 0; i < wynik.length; i++) {
            System.out.print(wynik[i] + " ");
        }
    }
}
