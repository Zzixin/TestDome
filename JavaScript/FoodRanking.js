function setup() {
  let btns = document.querySelectorAll('button');
  btns.forEach((ele) => {
    ele.addEventListener('click', handleClick);
  });
}

const handleClick = (event) => {
  let parent = event.target.parentElement; // li
  let isFirst = !parent.previousElementSibling;
  let isLast = !parent.nextElementSibling;
  let isUp = event.target.textContent === 'Up!';
  let isDown = !isUp;

  if (isUp && !isFirst) {
    parent.parentNode.insertBefore(parent, parent.previousElementSibling);
  } else if (isDown && !isLast) {
    parent.parentNode.insertBefore(
      parent,
      parent.nextElementSibling.nextElementSibling
    );
  }
};

// Example case
document.body.innerHTML = `<ol>
  <li><button>Up!</button>Taco<button>Down!</button></li>
  <li><button>Up!</button>Pizza<button>Down!</button></li>
  <li><button>Up!</button>Eggs<button>Down!</button></li>
</ol>`;

setup();
document.getElementsByTagName('button')[2].click();

console.log(document.body.innerHTML);
