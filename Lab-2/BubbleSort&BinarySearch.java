class Test{
    public static void main(String[] args) {
        int arr[] = new int[] {30,40,20,10,50};
        int temp;
        
        for(int i=0 ; i<arr.length-1 ; i++){
            for(int j=0 ; j<arr.length-1-i ; j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        

        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();

        int low = 0;
        int mid;
        int high = arr.length;
        int element = 50;

        while(low<=high){
            mid = low + (high-low)/2;
            if(arr[mid] == element){
                System.out.println(mid);
                break;
            }
            if(arr[mid]>element){
                high = mid - 1;
            }
            if(arr[mid]<element){
                low = mid + 1;
            }
        }
    }
}