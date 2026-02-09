class PartionArray{
    static int partion(int arr[], int low, int high){
        int pivote = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++ ){

            if (pivote > arr[j]){
                 i++;
                 int temp = arr[i];
                 arr[i] = arr[j];
                arr[j] = temp; 
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    static void PartionArray(int arr[], int low, int high){
        if (low < high){
            int pi = partion(arr, low, high);
           PartionArray(arr, low, pi - 1);
           PartionArray(arr, pi + 1, high);
        }
    }
    public static void main(String[] args) {
        int arr [] = {3, 54, 12, 1, 23, 98, 100, 454, 15, 10};
        PartionArray(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }   
}