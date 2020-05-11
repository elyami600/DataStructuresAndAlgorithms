public class SelctionSort {
    public static void main(String[] args){

        int[] intArray = {20,35,-15,7,55,1,-22};



        for(int  lastUnSortIndex = intArray.length-1; lastUnSortIndex > 0; lastUnSortIndex-- ){
            int largests = 0;

            for(int i = 1; i <= lastUnSortIndex; i++){
                if(intArray[i] > intArray[largests]){
                    largests = i;


                }

            }
            swap(intArray, lastUnSortIndex,largests);

        }
        System.out.print("Selection sort array   \n");
        for(int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }

    }

    public static void swap(int []arr, int i, int j){
        if(i ==j){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
