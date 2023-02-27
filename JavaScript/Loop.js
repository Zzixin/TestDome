function appendChildren(decorateDiv) {
  var allDivs = document.getElementsByTagName('div');
  const len = allDivs.length;
  for (var i = 0; i < len; i++) {
    var newDiv = document.createElement('div');
    decorateDiv(newDiv);
    allDivs[i].appendChild(newDiv);
  }
}

// Example case.
document.body.innerHTML = `
<div id="a">
  <div id="b">
  </div>
</div>`;

//appendChildren(function(div) {});
console.log(document.body.innerHTML);
