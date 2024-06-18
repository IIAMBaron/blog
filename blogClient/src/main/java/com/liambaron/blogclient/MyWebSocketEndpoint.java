package com.liambaron.blogclient;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

/**
 *
 * @author Liam Baron
 */
@ServerEndpoint("/chatroom/endpoint")
public class MyWebSocketEndpoint {
    private static Set<Session> sessions = Collections.synchronizedSet(new HashSet<Session>());
    
    @OnMessage
    public void onMessage(String message, Session session) throws IOException {
        broadcastMessage(message);
    }

    public void broadcastMessage(String message) {
        synchronized (sessions) {
            for (Session session : sessions) {
                try {
                    session.getBasicRemote().sendText(message);
                    
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    @OnOpen
    public void onOpen (Session user) {
        sessions.add(user);
    }

    @OnClose
    public void onClose (Session user) {
        sessions.remove(user);
    }
}
