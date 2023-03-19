class Program{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
        System.out.println(binarySearch(arr, 5));
        System.out.println(binarySearchUsingFunctionRecursion(arr, 11 , 0 ,arr.length-1 ));
    }

    //binary serach
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    //Binary serach using function recursive search
    static int binarySearchUsingFunctionRecursion(int array[], int element, int low, int high) {

    if (high >= low) {
      int mid = low + (high - low) / 2;

      if (array[mid] == element)
        return mid;

      if (array[mid] > element)
        return binarySearchUsingFunctionRecursion(array, element, low, mid - 1);

      return binarySearchUsingFunctionRecursion(array, element, mid + 1, high);
    }

    return -1;
  }
}