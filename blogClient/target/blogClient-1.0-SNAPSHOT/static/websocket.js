var ws;
var profile;
var arr = [];

function connect() {
    console.log("This event has fired causeing the connect function to run");
    ws = new WebSocket("ws://localhost:8080/blogClient/chatroom/endpoint");
    
    ws.onmessage = function(event) {
        console.log("This is the onmessage event.data")
        console.log(event.data);
        var username = event.data.split(" ")[0];
        var containedMessage = document.createTextNode(event.data.substring(username.length));
        
        createMessage(username, containedMessage);

        arr.push(event.data);
        sessionStorage.setItem("autosave", JSON.stringify(arr));
        
    };
}

function message() {   
    // Changes the text need to look into this
    var textareaValue = document.getElementById("messenger").value;
    console.log(textareaValue);
    var encodedValue = encodeURIComponent(textareaValue);
    console.log(encodedValue);
    
    console.log("Seeing what happens when the \n is pressed")
    
    
    var xhr = new XMLHttpRequest();
    xhr.open("POST", "broadcast", true);
    
    xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    document.getElementById("messenger").value = "";
    
    xhr.onreadystatechange = function() {
        if (xhr.readyState == 4 && xhr.status == 200) {
            console.log(xhr.responseText);
            }
    };
    xhr.send("textareaValue="+textareaValue);
}

function sessionMessages() {
    var sessionMessages = JSON.parse(sessionStorage.getItem("autosave"));
    
    if (sessionMessages != null) {
        arr = sessionMessages;
        for (var i = 0; i < sessionMessages.length; i++) {
            var username = sessionMessages[i].split(" ")[0];
            var containedMessage = document.createTextNode(sessionMessages[i].substring(username.length));
            
            createMessage(username, containedMessage);
        }
    }
}

function createMessage(username, containedMessage) {
    var newMessage = document.createElement("p");
    profile = document.createElement("a");
    var box = document.createElement("span");
    const div = document.getElementById("messages");
    
    box.className = "border border-secondary";
    box.style.display = "inline-block";
    profile.innerHTML = username;


    newMessage.appendChild(containedMessage);
    box.appendChild(profile);
    box.appendChild(newMessage);
    div.appendChild(box);
    
    console.log(box.scrollHeight);
    console.log(box)
    //Deciding if I am going to leave it like this or am I going to make it flexible like WhatApp
    box.scrollIntoView();
}