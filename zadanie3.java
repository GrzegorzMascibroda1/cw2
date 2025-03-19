public class zadanie3 {
    public static int[] rotateArray(int[] arr, int position) {
        if (position > arr.length){
            position = position % arr.length;
        }
        int[] newArr = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            index = i+position;
            if(index >= arr.length){
                index = index - arr.length;
            }
            newArr[i] = arr[index];
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        int position=3;
        int[] newArr= rotateArray(arr,position);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }
    }
}
