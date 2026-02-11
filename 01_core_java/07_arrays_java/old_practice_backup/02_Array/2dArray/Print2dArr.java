class Print2dArr {
    public static void main(String[] args) {
        int arr [][] = { 
            {3, 5, 6},
            {13, 15, 56},
            {34, 51, 61},
        };
        
        for (int i = 0; i < arr.length; i++){
        for (int j = 0;j < arr[i].length; j++){
            System.out.print(arr[i][j] +  " ");
        }
        System.out.print("\n");
    }
    }
}
