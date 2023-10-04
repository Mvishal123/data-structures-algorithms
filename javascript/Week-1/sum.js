// 1
// sum = 0;
// for(let i = 1; i <= 100; i++){
//     sum += i;
// }

// console.log(sum);

// 2
// let first = 0;
// let second = 1;
// let num = 10;
// let ls = [first, second];
// while(num - 2 != 0){
//     let current = first + second;
//     ls.push(current);

//     first = second;
//     second = current;
//     num -= 1;
// }
// console.log(...ls);

//3

// let str = "";
// const len = 5;
// for(let i = 0; i < len; i++) {
//     for(let j = 0; j < len; j++){
        
//     }
//     console.log(str)
//     str = ""
// }



// let ls = [];
// let ans = [{name1: "Vishal"}, {name2: "Vaibhav"}, {name1: "Sathya"}, {name4: "Mahesh"}];
// ans.forEach(user => {
//     if(!(Object.keys(user)[0] in ls)){
//         ls.push(Object.keys(user).toString());
//     }
// })
// console.log(ls)

// let nase = "Hello I am Vishal";
// let i = 0;;
// nase = nase.toLowerCase();

// for(let i = 0; i < nase.length; i++){
//     console.log(i + " " + nase[i]);
// }

str = "My name is Vishal";
str = str.toLowerCase();
newStr = "";
for(let i = 0; i < str.length; i++){
  if((str[i].charCodeAt(0) >= 65 && 
  str[i].charCodeAt(0) <= 90 && (str[i].charCodeAt(0)) || 
  (str[i].charCodeAt(0) >= 97 && (str[i].charCodeAt(0) <= 122)))){
    newStr += str[i];
  }
}

console.log(newStr);

