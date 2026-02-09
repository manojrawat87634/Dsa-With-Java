class MergeTwoSortArray {
    static void merge(int [] leftArr, int [] rightArr, int [] resultArr){
        int i = 0, j = 0, k = 0;
        int l1 = leftArr.length;
        int l2 = rightArr.length;
        while ((i < l1) && (j < l2)){
            if (leftArr[i] < rightArr[j]){
                resultArr[k++] = leftArr[i++];
            }
            else{
                resultArr[k++] = rightArr[j++];
            }
        }
        while ((i < l1)){
                resultArr[k++] = leftArr[i++];
        }
        while (j < l2){
                resultArr[k++] = rightArr[j++];
        }
    }

    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int []leftArr  = {1, 4, 67, 89};
        int []rightArr = {2 ,3, 6, 76, 90};

        int [] resultArr = new int[leftArr.length + rightArr.length];
        merge(leftArr, rightArr, resultArr);
        for (int a = 0; a < resultArr.length; a++){
            System.out.println(resultArr[a]);
        }
    }
}