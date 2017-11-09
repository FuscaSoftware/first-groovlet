import groovy.servlet.GroovyServlet
import groovy.sql.Sql
import java.sql.DriverManager


DriverManager.registerDriver(new com.mysql.jdbc.Driver())
Class.forName('com.mysql.jdbc.Driver')
def sql = Sql.newInstance("jdbc:mysql://localhost:3306/smr_db", "root","root", "com.mysql.jdbc.Driver");


def row = sql.firstRow('select UUID() as uuid');
println(row.uuid)

//sql.execute('create table users(id INT NOT NULL AUTO_INCREMENT,name VARCHAR(15) NOT NULL,email VARCHAR(15), PRIMARY KEY(id))')
//def row = sql.firstRow('select * from users where name = "John Doe"')
//def fetch = sql.rows("select * from users")
//fetch.each { it ->
//    println it.id + " " + it.name + " " +it.email
//}


// use then close 'sql' instance ...
sql.close();