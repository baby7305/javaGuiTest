package com.company.javaPanel.control;

import com.company.javaPanel.data.LoginData;
import com.company.javaPanel.entity.Login;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Administrator on 2018/1/8.
 */
public class LoginControl {
	public boolean login(List<Login> loginList) {
		int count = loginList.size();
		if (count > 0) {
			return true;
		} else {
			return false;
		}
	}

//	public boolean login(String sql){
//		int count = loginList.size();
//		if (count>0){
//			return true;
//		}else {
//			return false;
//		}
//	}

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
}
