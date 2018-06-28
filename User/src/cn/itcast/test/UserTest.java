package cn.itcast.test;

import java.util.Scanner;

import cn.itcast.dao.UserDao;
import cn.itcast.dao.ipml.UserDaoImpl;
import cn.itcast.game.game;
import cn.itcast.pojo.User;


/**
 * 这是用户登录测试类
 * @author Administrator
 * @version 1.1
 
 */
public class UserTest {
public static void main(String[] args) {
	while(true) {
	System.out.println("-----------欢迎光临-------");
	System.out.print("1登录"+"  "+"2注册"+"  "+"3退出");
	System.out.println("请输入你的选择");
	Scanner sc=new Scanner(System.in);
	String choiceString=sc.nextLine();
	UserDao ud=new UserDaoImpl();//remote
	
	switch (choiceString) {
	case "1":
		System.out.println("-----登录页面-----");
		System.out.println("-----输入用户名-----");
		String username=sc.nextLine();
		System.out.println("-----输入密码-----");
		String password=sc.nextLine();
		boolean flag=ud.isLogin(username, password);
		if(flag) {
			System.out.println("登录成功,开始游戏");
            game g=new game();
            g.playgame();
            while(true) {
            System.out.println("你还要玩吗Y/N");
            String st=sc.nextLine();
            if(st.equalsIgnoreCase("y")) {
            	g.playgame();
            	continue;
            }else {
            	System.exit(0);
            }
			
		}
            }else {
			System.out.println("输入有误,登录失败");
		}
		
		
		break;

case  "2":
	System.out.println("-----注册页面-----");
	System.out.println("-----输入用户名-----");
	String newUername=sc.nextLine();
	System.out.println("-----输入密码-----");
	String newPassword=sc.nextLine();
	User user=new User();
	user.setUsername(newUername);
	user.setPassword(newPassword);
	
	ud.regist(user);
	System.out.println("注册成功");
		break;
case  "3":
	
	System.exit(0);

	default:
		System.out.println("输入有误");
		break;
		
	}
	
	}
}
}
