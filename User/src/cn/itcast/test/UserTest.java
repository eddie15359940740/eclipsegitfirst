package cn.itcast.test;

import java.util.Scanner;

import cn.itcast.dao.UserDao;
import cn.itcast.dao.ipml.UserDaoImpl;
import cn.itcast.game.game;
import cn.itcast.pojo.User;


/**
 * �����û���¼������
 * @author Administrator
 * @version 1.1
 
 */
public class UserTest {
public static void main(String[] args) {
	while(true) {
	System.out.println("-----------��ӭ����-------");
	System.out.print("1��¼"+"  "+"2ע��"+"  "+"3�˳�");
	System.out.println("���������ѡ��");
	Scanner sc=new Scanner(System.in);
	String choiceString=sc.nextLine();
	UserDao ud=new UserDaoImpl();//remote
	
	switch (choiceString) {
	case "1":
		System.out.println("-----��¼ҳ��-----");
		System.out.println("-----�����û���-----");
		String username=sc.nextLine();
		System.out.println("-----��������-----");
		String password=sc.nextLine();
		boolean flag=ud.isLogin(username, password);
		if(flag) {
			System.out.println("��¼�ɹ�,��ʼ��Ϸ");
            game g=new game();
            g.playgame();
            while(true) {
            System.out.println("�㻹Ҫ����Y/N");
            String st=sc.nextLine();
            if(st.equalsIgnoreCase("y")) {
            	g.playgame();
            	continue;
            }else {
            	System.exit(0);
            }
			
		}
            }else {
			System.out.println("��������,��¼ʧ��");
		}
		
		
		break;

case  "2":
	System.out.println("-----ע��ҳ��-----");
	System.out.println("-----�����û���-----");
	String newUername=sc.nextLine();
	System.out.println("-----��������-----");
	String newPassword=sc.nextLine();
	User user=new User();
	user.setUsername(newUername);
	user.setPassword(newPassword);
	
	ud.regist(user);
	System.out.println("ע��ɹ�");
		break;
case  "3":
	
	System.exit(0);

	default:
		System.out.println("��������");
		break;
		
	}
	
	}
}
}
