import java.sql.Connection
import java.sql.DriverManager
import java.sql.PreparedStatement

fun main() {
    var connection: Connection? = null
    var preparedStatement: PreparedStatement? = null

    try {// 获取mysql中j2ee-learn数据库的链接
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/j2ee-learn", "root", "root1234")

        // 创建表
        val createTableSql = """
            CREATE TABLE IF NOT EXISTS `user` (
                `uid` int(11) NOT NULL AUTO_INCREMENT,
                `name` varchar(10) DEFAULT NULL,
                PRIMARY KEY (`uid`)
            ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
        """.trimIndent()
        preparedStatement = connection.prepareStatement(createTableSql)
        preparedStatement.execute()
        preparedStatement.close()

        // 插入数据
        val insertSql = """
            INSERT INTO `user` (`name`) values (?)
        """.trimIndent()
        preparedStatement = connection.prepareStatement(insertSql)
        preparedStatement.setString(1, "wdnmd")
        val rowAffect = preparedStatement.executeUpdate()
        println("rowAffect = $rowAffect")
    } catch (e: Exception) {
        print(e.message)
    } finally {
        preparedStatement?.close()
        connection?.close()
    }
}