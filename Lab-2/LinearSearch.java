public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = new int[]{4,6,3,9};
        int key = 3;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] == key){
                System.out.println("Your key at index : "+arr[i]);
                break;
            }   
        }
    }
}