import java.lang.String;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MergeNames {

   public static String[] uniqueNames(String[] names1, String[] names2) {
      // throw new UnsupportedOperationException("Waiting to be implemented.");
      Set<String> set = new HashSet<>(Arrays.asList(names1));
      set.addAll(Arrays.asList(names2));
      return set.toArray(new String[set.size()]);
   }

   public static void main(String[] args) {
      String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
      String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
      System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
   }
}