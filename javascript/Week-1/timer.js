// let counter = 1;
// const timer = () => {
//     console.clear();
//     console.log(counter);
//     counter++;
// }

// setInterval(timer, 1000);


function promiseBody(resolve) {
    setTimeout(resolve, 5000);
}

function getMedicine1() {
    var answer = new Promise(promiseBody);
    return answer;
}

function printThing() {
    console.log("Medicine1 is received");
}

var medicinePromise = getMedicine1();
console.log(getMedicine1());
medicinePromise.then(printThing());