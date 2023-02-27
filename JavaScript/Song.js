class Song {
  name;
  nextSong;

  constructor(name) {
    this.name = name;
  }

  /**
   * @return {boolean} true if the playlist is repeating, false if not.
   */
  /*
  // Exceed Time Limit
  isInRepeatingPlaylist() {
    if (!this || !this.nextSong) {
      return false;
    }
    let slow = this;
    let fast = this;
    while (fast && fast.nextSong) {
      slow = slow.nextSong;
      fast = fast.nextSong.nextSong;
      if (slow === fast) {
        return true;
      }
    }

    return false;
  }
  */

  // use hashset
  isInRepeatingPlaylist() {
    let memo = new Set();
    let song = this;
    while (song) {
      if (memo.has(song)) {
        return true;
      } else {
        memo.add(song);
      }
      song = song.nextSong;
    }
    return false;
  }

  // use Object
  isInRepeatingPlaylist2() {
    let memo = new Object();
    let song = this;
    while (song) {
      if (memo[song.name]) {
        return true;
      } else {
        memo[song.name] = 1;
      }
      song = song.nextSong;
    }
    return false;
  }
}

let first = new Song('Hello');
let second = new Song('Eye of the tiger');

first.nextSong = second;
second.nextSong = first;

console.log(first.isInRepeatingPlaylist());
