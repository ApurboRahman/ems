package com.ems.DBConnection;

import org.hibernate.dialect.Dialect;

/**
 * Created by Apurbo on 8/24/2016.
 */
public class SQLServer2012CustomDialect extends Dialect {

    public SQLServer2012CustomDialect() {
        super();

        registerHibernateType(-9, "string");
    }
}
