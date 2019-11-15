package org.springframework.test.aop;
/**
 * @Description:
 * @author chenchen
 * @date 2019/11/6 14:59
 */
public class UserDaoImpl implements UserDao{

	@Override
	public void addUser() {
		System.out.println("add user ");
	}

	@Override
	public void deleteUser() {
		System.out.println("delete user ");
	}

}
