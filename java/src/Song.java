public class Song {
   private String name;
   private Song nextSong;

   public Song(String name) {
      this.name = name;
   }

   public void setNextSong(Song nextSong) {
      this.nextSong = nextSong;
   }

   public boolean isInRepeatingPlaylist() {
      //throw new UnsupportedOperationException("Waiting to be implemented.");

      // Empty and one element lists have no cycles:
      if (this == null || this.nextSong == null) {return false;}
      Song s1 = this; // slow
      Song s2 = this; // fast

      // whether there is a circle
      while (s2 != null && s2.nextSong != null) {
         s1 = s1.nextSong;
         s2 = s2.nextSong.nextSong;
         if (s1 == s2) {return true;}
      }
      return false;
   }

   public static void main(String[] args) {
      Song first = new Song("Hello");
      Song second = new Song("Eye of the tiger");

      first.setNextSong(second);
      second.setNextSong(first);

      System.out.println(first.isInRepeatingPlaylist());
   }
}