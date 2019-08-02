package com.abogailo.dao;
import org.apache.ibatis.session.SqlSession;
import com.abogailo.entity.*;
import com.abogailo.util.MyBatisUtil;

public class UserListDAO {
	public void save(UserList userlist){
	  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
	  session.insert("com.abogailo.dao.UserList.insertUserList", userlist);
	  session.commit();
	  session.close();
	}
	public void update(UserList userlist){
	  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
	  session.update("com.abogailo.dao.UserList.updateUserList", userlist);
	  session.commit();
	  session.close();
	}
	public void delete(Integer id){
	  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
	  session.delete("com.abogailo.dao.UserList.deleteUserList", id);
	  session.commit();
	  session.close();
	}
	public Scraper getData(Integer id) {
	  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
	  Scraper scraper = session.selectOne("com.abogailo.dao.UserList.selectUserList", id);
	  session.close();
	  return scraper;
	}
} 