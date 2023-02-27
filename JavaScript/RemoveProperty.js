function removeProperty(obj, prop) {
  // if (prop in obj) {
  if (obj.hasOwnProperty(prop)) {
    delete obj[prop];
    return true;
  } else {
    return false;
  }
}
