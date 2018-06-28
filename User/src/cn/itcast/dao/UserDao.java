package cn.itcast.dao;

import cn.itcast.pojo.User;

/**
 * 这是对用户进行操作的接口
 * @author Administrator
 * @version1.1
 */
public interface UserDao {
	/**
	 * 这是用的的登录功能
	 * @param username
	 * @param password
	 * @return 返回登录是否成功
	 */
   public boolean isLogin(String username,String password);
   /**
    * 这是用户注册功能
    * @param user
    */
   public void regist(User user);
}
