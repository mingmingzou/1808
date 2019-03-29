package com.qianfeng.fxmall.commons.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionU {
    public   static SqlSessionFactory sessionFactory;
    private  static ThreadLocal<SqlSession> threadLocal =new ThreadLocal<>();

    public static void  initSqlSessionFactory(){
        try {
            InputStream stream = Resources.getResourceAsStream("mybatis.xml");
             sessionFactory = new SqlSessionFactoryBuilder().build(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static {
        initSqlSessionFactory();
    }
    public static SqlSessionFactory getSessionFactory(){
        if(sessionFactory==null){
            initSqlSessionFactory();
        }
        return sessionFactory;
    }
    public static SqlSession  getSession(){
     SqlSession session=threadLocal.get();
     if(session==null){
            session=sessionFactory.openSession();
            threadLocal.set(session);
        }
     return session;
    }
}
