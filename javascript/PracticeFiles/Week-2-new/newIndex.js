const express = require("express");
const bodyParser = require("body-parser");
const app = express();
const port = 3000;

// const middleware1 = (req, res, next) => {
//   console.log("From inside middleware");
//   next();
// }
// app.use(middleware1);
app.use(bodyParser.json());

const findSum = (range) => {
  if (range < 1000000) {
    let ans = 0;
    for (let i = 0; i <= range; i++) {
      ans += i;
    }
    return ans;
  } else {
    return "You have entered a very large number";
  }
};

const findMul = (range) => {
  if (range < 1000000) {
    let ans = 1;
    for (let i = 1; i <= range; i++) {
      ans *= i;
    }

    return ans;
  } else {
    return "You have entered a very large number";
  }
};

const postData = (req, res) => {
  const count = req.query.range;
  let sum = findSum(count);
  let mul = findMul(count);
  let ansObj = {
    sum: sum,
    mul: mul,
  };
  res.json(ansObj);
};

app.get("/postData", postData);

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`);
});
