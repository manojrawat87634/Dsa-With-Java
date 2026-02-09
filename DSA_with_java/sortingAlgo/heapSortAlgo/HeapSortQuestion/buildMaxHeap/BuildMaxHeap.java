class BuildMaxHeap{
    static void heapify(int arr[], int size, int i){
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        
        if (left < size && arr[largest] < arr[left]){
            largest = left;
        }
        
        if (right < size && arr[largest] < arr[right]){
            largest = right;
        } 

        if (largest != i){
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            heapify(arr, size, largest);
        }
    }

    static void buildMaxHeap(int arr[]){
        for (int i = arr.length / 2 - 1; i >= 0; i--){
            heapify(arr, arr.length, i);
        }

     
    }

    public static void main(String [] args){
        int myArr [] = {34, 53, 12, 54, 76, 89, 1, 3};
        buildMaxHeap(myArr);
        for (int i = 0; i < myArr.length; i++){
            System.out.println(myArr[i]);
        }
    }
}