package cn.itcast.game;

import java.util.Scanner;

/**
 * 这是猜数字游戏功能
 * @author Administrator
 * @version 1.1
 */
public class game {
public static void playgame() {
	int i=(int)(Math.random()*100);
	System.out.println("请输入一个0--100(不包括100)之间的数");
	int j;
	while(true) {
	try {
	Scanner s=new Scanner(System.in);
	j=s.nextInt();	
	
		
	
	if(i<j) {
		System.out.println("数字太大了(灬ꈍ ꈍ灬)");
		continue;
	}else if(i>j) {
		System.out.println("数字太小了(灬ꈍ ꈍ灬)");
		continue;
	}else {
		System.out.println("哈哈,猜对了o(*≧▽≦)ツ");
		break;
	}
	}catch(Exception e) {
		System.out.println("输入有误,重新输入");
		continue;
	}
	}
}


}
