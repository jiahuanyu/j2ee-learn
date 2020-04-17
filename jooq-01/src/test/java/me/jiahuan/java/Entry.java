package me.jiahuan.java;

import me.jiahuan.java.enums.Gender;
import me.jiahuan.java.model.Tables;
import me.jiahuan.java.model.tables.pojos.User;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class Entry {
    @Test
    public void testInsert() {
        String userName = "root";
        String password = "root1234";

        String url = "jdbc:mysql://localhost:3306/j2ee-learn?useUnicode=true&characterEncoding=UTF-8&rewriteBatchedStatements=true";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, userName, password);
            DSLContext dsl = DSL.using(connection, SQLDialect.MYSQL);
            dsl.insertInto(Tables.USER, Tables.USER.NAME, Tables.USER.GENDER)
                    .values("Test", Gender.FEMALE)
                    .execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }

    @Test
    public void testQuery() {
        String userName = "root";
        String password = "root1234";

        String url = "jdbc:mysql://localhost:3306/j2ee-learn?useUnicode=true&characterEncoding=UTF-8&rewriteBatchedStatements=true";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, userName, password);
            DSLContext dsl = DSL.using(connection, SQLDialect.MYSQL);
            List<User> result = dsl
                    .select(Tables.USER.UID, Tables.USER.NAME, Tables.USER.GENDER)
                    .from(Tables.USER)
                    .fetchInto(User.class);
            for (User user : result) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}
