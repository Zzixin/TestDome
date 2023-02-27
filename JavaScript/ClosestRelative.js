/**
 * @param {HTMLElement} parent The HTML element of the parent
 * @param {string} relativeName The name of relative to be searched
 * @return {HTMLElement} The HTML element of the closest relative
 */

// several generations and childeren with th same name
// the example should be the second Sarah
function closestRelative(parent, relativeName) {
  let queue = [...parent.children];
  const target = relativeName.toUpperCase();

  while (queue.length > 0) {
    let cur = queue.shift(); // delete the first element and return
    if (cur.tagName === target) {
      return cur;
    }
    [...cur.children].forEach((ele) => {
      queue.push(ele);
    });
  }
  return null;
}

// Example case
document.body.innerHTML =
  '<James>' +
  '<Dave></Dave>' +
  '<Mike><Dave><Sarah></Sarah></Dave></Mike>' +
  '<Sarah></Sarah>' +
  '</James>';

let parent = document.getElementsByTagName('James')[0];
let relative = closestRelative(parent, 'Sarah');
console.log(relative && relative.tagName); // prints MIKE
