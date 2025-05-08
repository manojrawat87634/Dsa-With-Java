public class HeapSort {

    static void heapify(int arr[],int i, int size){
        int largest = i;
        int left = i * 2 + 1;
        int right = i * 2 + 2;
        if (left < size && arr[left] > arr[largest]){
            largest = left;
        }
        if (right < size && arr[right] > arr[largest]){
            largest = right;
        }
        if (i != largest){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, largest, size);
        }
    }

    static void buildMaxHeap(int arr[], int size){
        for (int i = size / 2 - 1; i >= 0; i--) {
            heapify(arr, i, size);
        }    
        
        for (int i = size - 1; i >= 0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, 0, i);
        }
    }

    static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {      
        int arr[] = {43, 54, 65, 12, 1, 3, 4, 66, 89, 98, 103};
        System.out.println("Heap Sort Start");
        buildMaxHeap(arr, arr.length);
        System.out.println("Heap Sort End");
        printArr(arr);
    }
}
