import java.util.HashMap;
import java.util.Map;

public class TwoSum {
   public static int[] findTwoSum(int[] list, int sum) {
      // throw new UnsupportedOperationException("Waiting to be implemented.");
      Map<Integer, Integer> map = new HashMap<>();

      for (int i = 0; i < list.length; i++) {
         if (map.containsKey(list[i])) {
            return new int[]{map.get(list[i]), i};
         } else {
            map.put(sum - list[i], i);
         }
      }

      return null;
   }

   public static void main(String[] args) {
      int[] indices = findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10);
      if(indices != null) {
         System.out.println(indices[0] + " " + indices[1]);
      }
   }
}