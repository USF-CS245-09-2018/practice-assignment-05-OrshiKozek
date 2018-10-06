public class InsertionSort implements SortingAlgorithm {

    @Override
    public void sort(int[] a) {

        int sorted = 0; //index of the last element in the sorted array
        int tempval = 0; //default value set to 0
        int counter = 0;

        while(sorted < a.length-1){
            if (a[sorted + 1] >= a[sorted]){ //if the next element is greater than the last element of the sorted array, move the marker one to the right.
                sorted++;
            }
            else {

                tempval = a[sorted + 1];
                counter = sorted;
                while(a[counter] > tempval){
                    a[counter + 1] = a[counter];
                    if (counter == 0)
                        break;
                    else if(a[counter-1] < a[counter] && a[counter-1] < tempval)
                        break;
                    else
                        counter--;
                }
                a[counter] = tempval;
                sorted++;
            }
        }
    }
}
