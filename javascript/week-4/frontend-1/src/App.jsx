import React, { useEffect } from "react";
/// hook

function App() {
  const [todoForToday , setTodoForToday] = React.useState({
    title: "Go to gym",
    description: "Hit gym from 7-9",
    id: 1
  });
  console.log("render");
  React.useEffect(() => {
    console.log("hi from useEffect");
  }, []);

  return (
    <div>
      {todoForToday.title}
      <br/>
      {todoForToday.description}
    </div>
  )
}

export default App;