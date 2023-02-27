function formatDate(userDate) {
  // format from M/D/YYYY to YYYYMMDD
  const date = userDate.split('/');
  let month = date[0];
  let day = date[1];
  if (month.length === 1) month = '0' + month;
  if (day.length === 1) day = '0' + day;
  return date[2] + month + day;
}

console.log(formatDate('12/31/2014'));
