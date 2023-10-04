const express = require('express')
const app = express()
const port = 3000

function sum(n){
    let ans = 0;
    for(let i = 0; i <= n; i++){
        ans += i
    }
    return ans;
}

app.get('/', (req, res) => {
    res.send(`The answer is ${sum(10)}`);
})

app.get('/15', (req, res) => {
    res.send(`The answer is ${sum(15)}`);
})


app.listen(port, () => {
  console.log(`index.js listening on port ${port}`)
})


