public class buildMinHeap {
    static void heapify(int arr[], int i, int size){
        int lowest = i;
        int left = i * 2 + 1;
        int right = i * 2 + 2;
        if (size > left && arr[lowest] > arr[left]){
            lowest = left;
        }
        if (right < size && arr[lowest] > arr[right]){
            lowest = right;
        }

        if (lowest != i){
            int temp = arr[i];
            arr[i] = arr[lowest];
            arr[lowest] = temp;
            heapify(arr, lowest, size);
        }
    }

    static void MinHeap(int arr[], int size){
        for (int i = size / 2 - 1; i >= 0; i--){
            heapify(arr, i, size);
        }
    }


    public static void main(String[] args) {
        int arr [] = {23, 21, 34, 54, 65, 1, 3, 9};
        MinHeap(arr, arr.length);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

}
