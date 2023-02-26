public class SortedSearch {
   public static int countNumbers(int[] sortedArray, int lessThan) {
      // throw new UnsupportedOperationException("Waiting to be implemented.");
      // Binary Search
      if (sortedArray.length == 0) {return 0;}
      if (sortedArray.length == 1) {return sortedArray[0] < lessThan ? 1 : 0;}
      int left = 0, right = sortedArray.length - 1;

      while (left <= right){
         int mid = left + (right - left) / 2;
         if (sortedArray[mid] < lessThan) {
            left = mid + 1;
         } else  {
            right = mid - 1;
         }
      }

      // must be the bigger one than 'lessThan'
      // only when left = right, and right > 'lessThan' would jump out of the loop
      return left;
   }

   public static void main(String[] args) {
      System.out.println(SortedSearch.countNumbers(new int[] {1, 3}, 5));
   }
}