import java.util.*;

public class RoutePlanner {

   private static int[][] memo;

   public static boolean routeExists(int fromRow, int fromColumn, int toRow, int toColumn,
                                     boolean[][] mapMatrix) {
      memo = new int[mapMatrix.length][mapMatrix[0].length];
      if (mapMatrix.length == 0) {return false;}
      if (!mapMatrix[toRow][toColumn] || !mapMatrix[fromRow][fromColumn]) {return false;}
      dfs(mapMatrix, fromRow, fromColumn, toRow, toColumn);
      return memo[toRow][toColumn] == 1;
   }

   private static void dfs(boolean[][] mapMatrix, int i, int j, int toRow, int toColumn) {
      if (i == toRow && j == toColumn) {
         memo[i][j] = 1;
         return;
      }
      if (memo[i][j] == 1) return;
      memo[i][j] = 1;

      if ((i - 1) >= 0 && mapMatrix[i - 1][j]) {
         dfs(mapMatrix, i - 1, j, toRow, toColumn);
      }
      if ((i + 1) < mapMatrix.length && mapMatrix[i + 1][j]) {
         dfs(mapMatrix, i + 1, j, toRow, toColumn);
      }
      if ((j - 1) >= 0 && mapMatrix[i][j - 1]) {
         dfs(mapMatrix, i, j - 1, toRow, toColumn);
      }
      if ((j + 1) < mapMatrix[0].length && mapMatrix[i][j + 1]) {
         dfs(mapMatrix, i, j + 1, toRow, toColumn);
      }
   }


   public static void main(String[] args) {
      boolean[][] mapMatrix = {
            {true,  false, false},
            {true,  true,  false},
            {false, true,  true}
      };

      System.out.println(routeExists(0, 0, 2, 2, mapMatrix));
   }
}