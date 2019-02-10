package com.company;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public abstract class Dao_Base {
    protected String driver = "null";
    private  String url = "null";


    protected Properties properties  = null;    //Connection properties of the Connection object

    public Dao_Base (String driver){
        this.driver = driver;
    }

    //JDBC Driver Registration Procedure
    protected void registerDriverManager (){
        try {
            Class.forName(driver).newInstance();
        }
        catch (InstantiationException e ) {
            e.printStackTrace();
        }
        catch (IllegalAccessException e){
            e.printStackTrace();
        }
        catch (ClassNotFoundException e ){
            e.printStackTrace(); }
    }
//    The procedure for determining the connection string URL to the database server
//      * @param host - computer name
//      * @param database - database name (may be an empty string)
//      * @param port - server port
    public abstract void setUrl (String host , String dataBase , int port);

//    The function of getting the connection object
//    @return Connection - connection object

    public abstract Connection getConnection();

//    The procedure for registering the JDBC DBMS server driver and determining properties
//    @param login - login login
//    @param password - connection password

    public void connect (String login , String password){
        registerDriverManager();

    // Define Connection Properties
        properties = new Properties();
        properties.setProperty("password",password);
        properties.setProperty("login", login);
        properties.setProperty("use_Unicode","true");
        properties.setProperty("characterEncoding","utf8");
}
//    The procedure for disconnecting from the database server
//    @param connection connection object

    public void disconect (Connection connection){
        try {
            connection.close();
            connection = null;
        }catch (SQLException e){}
    }
//    Schema creation function
//    @param schema schema name
//    @return transaction result
    public boolean createSchema (final String schema){
        return false;
    }
//    Schema delete function
//    @param schema schema name
//      * @ return transaction result

    public boolean dropSchema (final String schema){
        return false;
    }
//    SQL query function
//    @param sql query text
//    @return query result

    public boolean execSQL (final String sql){
        boolean result = false;
        try {
            if (getConnection() !=null){
                Statement statement = getConnection().createStatement();
                statement.execute(sql);
                statement.close();
                statement = null;
                result = true;
            }
        }catch (SQLException e){
            System.err.println("SqlException : code = "+String.valueOf(e.getErrorCode())+"-"+e.getMessage());
            System.err.println("\tSql:" + sql) ;
        }
        return result;
    }
}
