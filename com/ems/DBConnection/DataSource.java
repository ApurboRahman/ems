package com.ems.DBConnection;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbcp2.DriverManagerConnectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Apurbo on 8/20/2016.
 */
public class DataSource extends BasicDataSource {

    public DataSource() {
        super();
    }

    @Override
    public synchronized void setPassword(String passwords) {
        String password = "sa1234";
        super.setPassword(password);
    }

    @Override
    public Connection getConnection() throws SQLException {

        /*Connection connection = null;

        connection = DriverManager.getConnection(url, username, password);

        return connection;*/
        return super.getConnection();
    }


}
