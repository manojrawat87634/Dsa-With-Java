class Main {
    public static void main(String[] args) {
        int arr [][] = { 
            {3, 5, 6},
            {13, 15, 56},
            {34, 51, 61},
        };
        
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
        for (int j = 0;j < arr[i].length; j++){
            sum += arr[i][j];
            // System.out.print(arr[i][j] +  " ");
        }
        System.out.print("\n");
    }
    System.out.print(sum);
    }
    
    
}
