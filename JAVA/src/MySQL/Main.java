package MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		Statement statement = null;
		ResultSet resultSet = null;
		Connection connection = null;
		String id = "root";
		String passward = "shdmf1030@";
		String dbQuery = "select * from city";
		
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world?useUnicode=true&characterEncoding=utf8&serverTimezone=Asia/Seoul&useSSL=false", id, passward);
			statement = connection.createStatement();
			
			if(statement.execute(dbQuery)) {
				resultSet = statement.getResultSet();
			}
			
			while(resultSet.next()) {
				String str = resultSet.getString(1);
				System.out.println(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
