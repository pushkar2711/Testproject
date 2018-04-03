package com.scp.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class sessionFactoryUtil {
	
	static SessionFactory sessionFactory;
	public static SessionFactory getSessionfactory()
	{
		if(sessionFactory==null){
			sessionFactory=new Configuration().configure().buildSessionFactory();
		}
		return sessionFactory;
		
	}

}
