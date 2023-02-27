function setup() {
  let btns = document.querySelectorAll('.remove');
  btns.forEach((ele) => {
    ele.addEventListener('click', function removeParentDiv() {
      this.parentNode.remove();
    });
  });
}

// Example case.
document.body.innerHTML = `
<div class="image">
  <img src="https://bit.ly/3lmYVna" alt="First">
  <button class="remove">X</button>
</div>
<div class="image">
  <img src="https://bit.ly/3flyaMj" alt="Second">
  <button class="remove">X</button>
</div>`;

setup();

document.getElementsByClassName('remove')[0].click();
console.log(document.body.innerHTML);
