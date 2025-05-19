function changeTextButton() {
  var changeBtn = document.getElementById("changeButton");
  if (changeBtn.value == "Click Me!") {
    changeBtn.value = "I have been clicked..";
    changeBtn.classList.add("red");
    changeBtn.classList.add("green");
  } else {
    changeBtn.value = "Click Me!";
    changeBtn.classList.add("green");
    changeBtn.classList.add("red");
  }
}
