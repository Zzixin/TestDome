
class Node {
   public int value;
   public Node left, right;

   public Node(int value, Node left, Node right) {
      this.value = value;
      this.left = left;
      this.right = right;
   }
}

public class BinarySearchTree {
   public static boolean contains(Node root, int value) {
      //throw new UnsupportedOperationException("Waiting to be implemented.");
      /* iteration
      Node dummyNode = root;
      while (dummyNode != null) {
         int val = dummyNode.value;
         if (val == value) {
            return true;
         } else if (val < value) {
            dummyNode = dummyNode.right;
         } else {
            dummyNode = dummyNode.left;
         }
      }
      return false;
       */
      // recursion
      if (root == null) {return false;}
      if (root.value == value) {return true;}
      else if (root.value < value) {return contains(root.right, value);}
      else {return contains(root.left, value);}
   }

   public static void main(String[] args) {
      Node n1 = new Node(1, null, null);
      Node n3 = new Node(3, null, null);
      Node n2 = new Node(2, n1, n3);

      System.out.println(contains(n2, 3));
   }
}