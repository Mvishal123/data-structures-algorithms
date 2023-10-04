// const sum = (n1) => (...n2) => {
//     let ans = n1;
//     for(const i of n2){
//      ans+=i;
//     }
//     return ans;
// };

// let a = sum(10);
// let b = a(10, 10, 10, 10);

// console.log(b);
// function calculateTime(n) {
//     let start = new Date().getSeconds();
//     let sum = 0;
//     for(let i = 1; i <= n; i++){
//         sum += i;
//     }
//     let end = new Date().getSeconds();
//     return end - start;
// }

// const obj = {
//     name: "Vishal",
//     age: 18,
//     family: ["Mahesh", "Sathya", "Vaibs"]
// }

// console.log(obj.hasOwnProperty("name"))

let ans = eval(`10 + 2 *    (   6 - (4 + 1) / 2) + 7 + abf`);

console.log(typeof ans);