package cn.itcast.dao;

import cn.itcast.pojo.User;

/**
 * ���Ƕ��û����в����Ľӿ�
 * @author Administrator
 * @version1.1
 */
public interface UserDao {
	/**
	 * �����õĵĵ�¼����
	 * @param username
	 * @param password
	 * @return ���ص�¼�Ƿ�ɹ�
	 */
   public boolean isLogin(String username,String password);
   /**
    * �����û�ע�Ṧ��
    * @param user
    */
   public void regist(User user);
}
