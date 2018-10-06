public class QuickSort implements SortingAlgorithm {

    @Override
    public void sort(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        quickSort(arr, left, right);
    }

    private void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int p = partition(arr, left, right);
            quickSort(arr, left, p - 1);
            quickSort(arr, p + 1, right);
        }
    }

    private int partition (int[] arr, int left, int right){
            int pivot = left;
            int i = left+1;
            int k = right;
            while (i < k){
                while(i < right && arr[i] <= arr[pivot]){
                    i++;
                }
                while(k > i && arr[k] > arr[pivot]){
                    k--;
                }

                if (arr[i] < arr[pivot]) //i<k
                    swap(arr, i, k);
            }//while i<k

            swap(arr, pivot, k);
            return k;
    }//method

    public void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[second] = arr[first];
        arr[first] = temp;
    }
}
