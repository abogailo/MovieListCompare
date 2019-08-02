package com.abogailo.dao;
import org.apache.ibatis.session.SqlSession;
import com.abogailo.entity.*;
import com.abogailo.util.MyBatisUtil;

public class LoginDAO {
	public void save(Login login){
	  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
	  session.insert("com.abogailo.dao.Login.insertLogin", login);
	  session.commit();
	  session.close();
	}
	public void update(Login login){
	  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
	  session.update("com.abogailo.dao.Login.updateLogin", login);
	  session.commit();
	  session.close();
	}
	public void delete(Integer id){
	  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
	  session.delete("com.abogailo.dao.Login.deleteLogin", id);
	  session.commit();
	  session.close();
	}
	public Scraper getData(Integer id) {
	  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
	  Scraper scraper = session.selectOne("com.abogailo.dao.Login.selectLogin", id);
	  session.close();
	  return scraper;
	}
} 