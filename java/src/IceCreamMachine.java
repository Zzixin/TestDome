import java.util.ArrayList;
import java.util.List;

public class IceCreamMachine {
   public String[] ingredients;
   public String[] toppings;

   public static class IceCream {
      public String ingredient;
      public String topping;

      public IceCream(String ingredient, String topping) {
         this.ingredient = ingredient;
         this.topping = topping;
      }
   }

   public IceCreamMachine(String[] ingredeints, String[] toppings) {
      this.ingredients = ingredeints;
      this.toppings = toppings;
   }

   public List<IceCream> scoops() {
      //throw new UnsupportedOperationException("Waiting to be implemented");
      List<IceCream> combos = new ArrayList<>();
      if (ingredients.length == 0 || toppings.length == 0) {
         return combos;
      }

      for (String ingredient : ingredients) {
         for (String topping: toppings) {
            combos.add(new IceCream(ingredient, topping));
         }
      }
      return combos;
   }

   public static void main(String[] args) {
      IceCreamMachine machine = new IceCreamMachine(new String[]{
            "vanilla", "chocolate"
      }, new String[]{
            "chocolate sauce"
      });
      List<IceCream> scoops = machine.scoops();

      /*
       * Should print:
       * vanilla, chocolate sauce
       * chocolate, chocolate sauce
       */
      for (IceCream iceCream : scoops) {
         System.out.println(iceCream.ingredient + ", " + iceCream.topping);
      }
   }
}