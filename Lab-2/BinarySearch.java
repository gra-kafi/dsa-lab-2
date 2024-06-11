public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = new int[]{10,20,30,40,50,60,70,80,90};
        int low = 0;
        int mid;
        int high = arr.length;
        int element = 90;

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
