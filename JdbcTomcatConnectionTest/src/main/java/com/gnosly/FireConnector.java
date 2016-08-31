package com.gnosly;


import java.sql.Connection;
import java.sql.Statement;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

@ManagedBean
@ApplicationScoped
public class FireConnector
{

  private DataSource ds;

  public FireConnector() throws Exception
  {
    Context initCtx = new InitialContext();
    Context envCtx = (Context) initCtx.lookup("java:comp/env");
    ds = (DataSource) envCtx.lookup("jdbc/backoffice");

  }

  public void execute() throws Exception
  {
    Connection connection = ds.getConnection();
    Statement statement = connection.createStatement();
    statement.execute("select 1");
  }

}
