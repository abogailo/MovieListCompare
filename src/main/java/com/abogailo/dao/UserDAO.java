package com.abogailo.dao;
import org.apache.ibatis.session.SqlSession;
import com.abogailo.entity.*;
import com.abogailo.util.MyBatisUtil;

public class UserDAO {
	public void save(User user){
	  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
	  session.insert("com.abogailo.dao.User.insertUser", user);
	  session.commit();
	  session.close();
	}
	public void update(User user){
	  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
	  session.update("com.abogailo.dao.User.updateUser", user);
	  session.commit();
	  session.close();
	}
	public void delete(Integer id){
	  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
	  session.delete("com.abogailo.dao.User.deleteUser", id);
	  session.commit();
	  session.close();
	}
	public Scraper getData(Integer id) {
	  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
	  Scraper scraper = session.selectOne("com.abogailo.dao.User.selectUser", id);
	  session.close();
	  return scraper;
	}
} 