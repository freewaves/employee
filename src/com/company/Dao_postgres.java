package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

import org.postgresql.PGConnection;

public class Dao_postgres extends Dao_Base {
private PGConnection connection = null;

private final String SCHEMA_CREATE = "CREATE SCHEMA \"%s\" ";
private final String DROP_SCHEMA = "DROP SCHEMA \"%s\" ";

    public Dao_postgres() {
        super("org.postgresql.Driver");
    }

    @Override
    public void setUrl(String host, String dataBase, int port) {
if (dataBase.length()>0)
    this.url = "jdbc:postgresql://" + host + ":" + port + "/" + dataBase;
    else
        this.url="jdbc:postgresql://" + host + ":" + port;
    }

    @Override
    public Connection getConnection() {
        return (java.sql.Connection)connection;
    }

    @Override
    public void connect (String login , String password){
        super.connect(login , password);
        try {
            connection = (PGConnection) DriverManager.getConnection(url , properties);
        }
        catch (SQLException e){
            connection = null;
        }
    }

    @Override
    public boolean createSchema(final String schema){
        return execSQL(String.format(SCHEMA_CREATE , schema));
    }

    @Override
    public boolean dropSchema(final String schema){
        return execSQL(String.format(DROP_SCHEMA , schema));
    }
}
