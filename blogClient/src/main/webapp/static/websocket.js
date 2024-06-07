var ws;
var profile;
function connect() {
    ws = new WebSocket("ws://localhost:8080/blogClient/chatroom/endpoint");
    
    ws.onmessage = function(event) {
        var newMessage = document.createElement("p");
        profile = document.createElement("a");
        profile.value = '<%= session.getAttribute("username") %>';
        
        //profile.className = something
        var box = document.createElement("span");
        box.className = "border border-secondary";
        
        var containedMessage = document.createTextNode(event.data);
        newMessage.appendChild(containedMessage);
        box.appendChild(profile);
        box.appendChild(newMessage);
        box.style.display = "inline-block";
        const div = document.getElementById("messages");
        div.appendChild(box);
    };
}

function message(username) {
    var textareaValue = document.getElementById("messenger").value;
    var encodedValue = encodeURIComponent(textareaValue);
    
    profile.textContent = username.data;
    var xhr = new XMLHttpRequest();
    xhr.open("POST", "broadcast", true);
    
    // Need to find a different way to send message
    xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    document.getElementById("messenger").value = "";
    
    xhr.onreadystatechange = function() {
        if (xhr.readyState == 4 && xhr.status == 200) {
            console.log(xhr.responseText);
            }
    };
    xhr.send(encodedValue);
}