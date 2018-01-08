package com.company.javaPanel.data;

import com.company.javaPanel.entity.Login;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static com.company.javaPanel.data.DBcon.getConn;

/**
 * Created by Administrator on 2018/1/8.
 */
public class LoginData {

	public List<Login> LoginData(String sql) throws SQLException {
		List<Login> loginList = new ArrayList<>();
		Connection conn = getConn("root", "123456", "test3");  //没有密码就什么都不写，空字符串
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);//执行查询
		while (rs.next()) {//遍历查询结果
			Login login = new Login();
			login.setId(rs.getInt(1));
			login.setName(rs.getString(2));
			loginList.add(login);
		}
		stmt.close();//显示关闭Statement对象，释放资源
		conn.close();// 关闭数据库连接，这是个好习惯。尽管在程序运行结束会自动关闭。但web应用是不会结束运行的。
		return loginList;
	}
}
