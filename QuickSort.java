public class QuickSort implements SortingAlgorithm {

    @Override

    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length-1);
    }
    public void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int p = partition(arr, left, right);
            quickSort(arr, left, p - 1);
            quickSort(arr, p + 1, right);
        }
    }

    public int partition (int[] arr, int left, int right){
        int pivot = arr[right]; //pivot is the first element
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, right);
        return i+1;
    }//method

    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
