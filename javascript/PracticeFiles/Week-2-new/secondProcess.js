const logFetch = (jsonBody) => console.log(jsonBody);


const  sendObj = {
    method: "GET"
} 
fetch("http://localhost:3000/postData?range=10", sendObj).then(result => console.log(result));