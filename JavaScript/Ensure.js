function ensure(value) {
  if (value !== undefined) {
    return value;
  }
  throw 'Err';
}

try {
  console.log(ensure());
} catch (err) {
  console.log(err);
}
