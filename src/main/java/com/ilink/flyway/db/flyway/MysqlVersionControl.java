package com.ilink.flyway.db.flyway;

import org.flywaydb.core.Flyway;

public class MysqlVersionControl {

    public static void main(String[] args) {
        String url="jdbc:mysql://192.168.10.29:3306/a";
        String user="root";
        String password="123456";
        Flyway flyway = Flyway.configure().dataSource(url, user, password).table("schema_version_test").load();
        flyway.baseline();
        flyway.migrate();
    }
}
