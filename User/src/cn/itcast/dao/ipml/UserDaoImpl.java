package cn.itcast.dao.ipml;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import cn.itcast.dao.UserDao;
import cn.itcast.pojo.User;

/**
 * 这是用户操作的具体实现类
 * 
 * @author Administrator
 * @version 2.1
 */
public class UserDaoImpl implements UserDao {
	public static File file = new File("D:\\aaa.txt");
	// 静态代码块的使用
	static {
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean isLogin(String username, String password) {
		boolean flag = false;
		BufferedReader bf = null;
		try {
			bf = new BufferedReader(new FileReader(file));

			String s = null;
			while ((s = bf.readLine()) != null) {

				String[] sr = s.split("=");
				if (sr[0].equals(username) && sr[1].equals(password)) {
					flag = true;
					break;
				}

			}

		} catch (IOException e) {
			System.out.println("youwenti");
		} finally {
			try {
				bf.close();
			} catch (IOException e) {

				System.out.println("shibai");
			}
		}
		return flag;

	}

	@Override
	public void regist(User user) {
		BufferedWriter bfr = null;
		try {
			bfr = new BufferedWriter(new FileWriter(file, true));
			bfr.write(user.getUsername() + "=" + user.getPassword());
			bfr.newLine();
			bfr.flush();

		} catch (IOException e) {
			System.out.println("注册失败");
		} finally {
			try {
				bfr.close();
			} catch (IOException e) {
				System.out.println("资源未释放");
			}
		}

	}

}
