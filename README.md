# JdbcTomcatConnectionTest (WIP)
The goal of this web app is to show how analyze the tomcat connection pool in case of abandoned connections.

## How it works
This web app let you create as many abandoned connections as you want just clicking on the button in the welcome page. In fact, each time the button is pressed a new connection is opened and never closed. This scenario let us investigate how set up the tomcat datasource configuration in order to show the peace of code that abandoned the connection.

## Analyzing

### Tomcat tool
logAbandoned,jmxEnabled


