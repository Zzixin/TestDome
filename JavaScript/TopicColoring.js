function newMessage(topicName) {
  let p = document.querySelectorAll('p');
  p.forEach((element) => {
    if (element.dataset.topicName === topicName) {
      element.style.backgroundColor = 'red';
    }
  });
}

// Example case
document.body.innerHTML = `<div>
  <p data-topic-name="discussion">General discussion</p>
  <p data-topic-name="bugs">Bugs</p>
  <p data-topic-name="animals">Animals</p>
</div>`;
newMessage('discussion');
console.log(document.body.innerHTML);
