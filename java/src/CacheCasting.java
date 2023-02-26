
public class CacheCasting
{

   public static class Cache {}

   public static class DiskCache extends Cache {}

   public static class MemoryCache extends Cache {}

   public static class OptimizedDiskCache extends DiskCache {}

   public static void main(String[] args)
   {
      // 1
      try {
         OptimizedDiskCache optimizedDiskCache = new OptimizedDiskCache();
         Cache cache = (Cache) optimizedDiskCache;
      }
      catch(Exception ClassCastException) {
         System.out.println(1);
      }

      // 2
      try {
         MemoryCache memoryCache = new MemoryCache();
         Cache cache = (Cache) memoryCache;
         DiskCache diskCache = (DiskCache) cache;
      }
      catch(Exception RuntimeException) {
         System.out.println(2);
      }

      // 3
      try {
         DiskCache diskCache = new DiskCache();
         OptimizedDiskCache optimizedDiskCache = (OptimizedDiskCache) diskCache;
      }
      catch(Exception ClassCastException) {
         System.out.println(3);
      }

      // 4
      try {
         OptimizedDiskCache optimizedDiskCache = new OptimizedDiskCache();
         DiskCache diskCache = (DiskCache) optimizedDiskCache;
      }
      catch(Exception ClassCastException) {
         System.out.println(4);
      }

      // 5
      try {
         Cache cache = new Cache();
         MemoryCache memoryCache = (MemoryCache) cache;
      }
      catch(Exception ClassCastException) {
         System.out.println(5);
      }
   }


}