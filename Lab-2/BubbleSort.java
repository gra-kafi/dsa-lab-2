public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = new int[] {4,10,6,9};
        int temp;
        System.out.print("Before sort: ");
        for(int x : arr){
            System.out.print(x+" ");
        }
        for(int i=0 ; i<arr.length-1 ; i++){
            for(int j=0 ; j<arr.length-1-i ; j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println();
        System.out.print("After sort: ");
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
    
}
