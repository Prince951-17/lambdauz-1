// @ts-ignore
const app = document.getElementById("app");

// 2. Create a new <p></p> element programmatically
const p = document.createElement("p");

// 3. Add the text content
p.textContent = "Hello, World! This is Type Script";

// 4. Append the p element to the div element
app?.appendChild(p);