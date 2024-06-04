var ws;

function connect() {
    ws = new WebSocket("ws://localhost:8080/blogClient/chatroom/endpoint");
    
    ws.onmessage = function(event) {
        document.getElementById("text").innerText = event.data;
    };
}

function message() {
    var xhr = new XMLHttpRequest();
    xhr.open("POST", "broadcast", true);
    xhr.setRequestHeader("message", document.getElementById("messenger").value);
    document.getElementById("messenger").value = "";
    xhr.onreadystatechange = function() {
        if (xhr.readyState == 4 && xhr.status == 200) {
            console.log(xhr.responseText);
            }
    };
    xhr.send();
}