function showCustomers(customers, targetList) {
  customers.forEach((ele) => {
    let li = document.createElement('li');
    const name = document.createElement('p');
    name.textContent = ele.name;
    name.style.cursor = 'pointer';

    name.addEventListener('click', (event) => {
      const parent = event.target.parentNode;
      if (parent.children.length === 1) {
        const email = document.createElement('p');
        email.textContent = ele.email;
        parent.appendChild(email);
      } else {
        parent.lastChild.remove();
      }
    });
    li.appendChild(name);
    targetList.appendChild(li);
  });
}

document.body.innerHTML = `
<div>
  <ul id="customers">
  </ul>
</div>
`;
let customers = [
  { name: 'John', email: 'john@example.com' },
  { name: 'Mary', email: 'mary@example.com' },
];
showCustomers(customers, document.getElementById('customers'));

let customerParagraph = document.querySelectorAll('li > p')[0];
if (customerParagraph) {
  customerParagraph.click();
}
console.log(document.body.innerHTML);
