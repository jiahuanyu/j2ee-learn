import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCMain {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/j2ee-learn?useUnicode=true&characterEncoding=UTF-8", "root", "root1234");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }

//        try {
// 获取mysql中j2ee-learn数据库的链接
//            // 创建表
//            val createTableSql = """
//                        CREATE TABLE IF NOT EXISTS `user` (
//                            `uid` int(11) NOT NULL AUTO_INCREMENT,
//                            `name` varchar(10) NOT NULL,
//                            PRIMARY KEY (`uid`)
//                        ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
//                    """.trimIndent()
//            preparedStatement = connection.prepareStatement(createTableSql)
//            preparedStatement.execute()
//            preparedStatement.close()
//
//            // 插入数据
//            val insertSql = """
//                        INSERT INTO `user` (`name`) values (?)
//                    """.trimIndent()
//            preparedStatement = connection.prepareStatement(insertSql)
//            preparedStatement.setString(1, "wdnmd")
//            val rowAffect = preparedStatement.executeUpdate()
//            println("rowAffect = $rowAffect")
//        } catch (Exception exception){
//            exception.printStackTrace();
//        } finally{
//            preparedStatement ?.close()
//            connection ?.close()
//        }
    }
}
