package umesh.searching;

public class BinarySearching {

        public static int binarySearch(int[] array, int target) {
            // Write your code here.
            return	helper(array,target, 0,array.length-1);

        }
        public static int helper(int[] array, int target, int startIndex, int endIndex){
            int mid =  (startIndex + endIndex)/2;
            if(mid==endIndex && array[mid]!=target  ) return -1 ;
            if(array[mid]==target)
                return mid;
            else if(array[mid]>target)
                return helper(array, target, startIndex,mid-1);
            else if(array[mid]<target)
                return helper(array, target, mid+1, endIndex);
            return -1;
        }

    public static void main(String[] args) {
        int array [] =  new int [] {1, 5, 23, 111};
        System.out.println(binarySearch(array,111));
    }

}
