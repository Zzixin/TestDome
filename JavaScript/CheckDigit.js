function createCheckDigit(membershipId) {
  // Write the code that goes here.
  let sum = 10;
  while (sum >= 10) {
    let digitArray = membershipId.split('');
    sum = digitArray.reduce((acc, ele) => {
      return acc + Number(ele);
    }, 0);
    if (sum >= 10) {
      membershipId = String(sum);
    }
  }

  return Number(sum);
}

console.log(createCheckDigit('55555'));
