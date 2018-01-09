package com.company.javaPanel.control;

import com.company.javaPanel.data.LoginData;
import com.company.javaPanel.entity.Login;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Administrator on 2018/1/8.
 */
public class LoginControl {
	public boolean loginTest() {
		String sql = "select * from student";
		LoginData loginData = new LoginData();
		List<Login> loginList = null;
		try {
			loginList = loginData.LoginData(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		int count = loginList.size();
		if (count > 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean loginTest1(int id, String name) {
		String sql = "select * from student where " + "id= " + id + " and " + " sname=" + "\'"+name+"\'";
		LoginData loginData = new LoginData();
		List<Login> loginList = null;
		try {
			loginList = loginData.LoginData(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		int count = loginList.size();
		if (count > 0) {
			return true;
		} else {
			return false;
		}
	}
}
