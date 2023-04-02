class Main {
    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 1, 2};
        int n = arr.length - 2;
        // bubble Sort
        for (int i = 0; i < arr.length - 2; i--) { //outer loop
            for (int j = 0; j <= n; j++) {         //inner loop 
                if (arr[j] > arr[j + 1]) {
                                                   //Swapping of two element
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            n--;
        } 
        //loop for print  array
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
