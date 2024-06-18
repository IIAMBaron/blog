# blog-application
I designed a web maven blog application that can do that allows users to have a conversation with one another using JSP.

What I used to create and run this project:
- Netbeans 12.6
- Glassfish 4.0
- Java 8
- Java EE 7
- JDBC Driver for SQL Server (mssql-jdbc012.6.1.jre8.jar)
- Microsoft SQL Server Management Studio 18

This application can do things that sites do on the regular that includes:
- Registering users
- Verifying users during the login process

The application uses Websockets for the chatroom. This is needed because messages need be sent dynamically. A person can not have sent a message then all the other clients need to refresh the page thats where websockets come into play.
