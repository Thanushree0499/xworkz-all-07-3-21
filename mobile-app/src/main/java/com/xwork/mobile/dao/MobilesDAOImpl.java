package com.xwork.mobile.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xwork.mobile.dto.MobileDTO;

public class MobilesDAOImpl implements MobilesDAO {

	@Override
	public void saveMobile(MobileDTO mobileDTO) {
	
		Configuration configuration =new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(mobileDTO);
		transaction.commit();
		session.close();
		sessionFactory.close();
		
		
		
	}

	@Override
	public void readMobile(int mobileId) {
		
		
	}

	@Override
	public void updateMobile(int mobileId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMobile(int mobileId) {
		// TODO Auto-generated method stub
		
	} 

	

}
