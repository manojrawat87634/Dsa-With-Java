class MergeSortAlgo{
    static void merge(int left, int mid, int right, int [] result){
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int leftArr[] = new int[n1];
        int rightArr[] = new int[n2];

        for (int i = 0; i < n1; i++){
            leftArr[i] = result[left + i];
        }
        for (int j = 0; j < n2; j++){
            rightArr[j] = result[mid + 1 + j];
        }
        int i = 0, j = 0, k = left;

        while ((i < n1) && (j < n2)){
            if (leftArr[i] < rightArr[j]){
                result[k++] = leftArr[i++];
            }
            else{
                result[k++] = rightArr[j++];
            }
        }

        while (i < n1){
            result[k++] = leftArr[i++];
        }

        while (j < n2){
            result[k++] = rightArr[j++];
        }
    }   

    static void mergeSort(int left, int right, int [] result){
        if (left >= right){
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(left, mid, result);
        mergeSort(mid + 1, right, result);
        merge(left, mid, right, result);
    }
  
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int arr [] = {3, 54, 12, 1, 23, 98, 100, 454, 15, 10};

        mergeSort(0, arr.length - 1, arr);

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}