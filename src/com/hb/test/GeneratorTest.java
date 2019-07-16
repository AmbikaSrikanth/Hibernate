package com.hb.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hb.entity.InsurancePolicy;

import com.hb.utility.HibernateUtil;

public class GeneratorTest {
	public static void main(String[] args) {
		Session ses=null;
		InsurancePolicy policy=null;
		Transaction tx=null;
		boolean flag=false;
		int idval=0;
		ses=HibernateUtil.getSession();
		policy=new InsurancePolicy();
		policy.setPolicyId(100);
		policy.setPolicyName("manadi");
		policy.setClosingTime(23);
		policy.setTenture(24);
		try{
			tx=ses.beginTransaction();
			idval=(int) ses.save(policy);
			//ses.flush();
			flag=true;
		}catch(Exception e){
			e.printStackTrace();
			flag=false;
		}
		finally{
			
			if(flag){
				tx.commit();
			System.out.println("objects are saved"+idval);
		}else{
			tx.rollback();
			System.out.println("objects are not saved");
		}
		HibernateUtil.closeSession(ses);
		HibernateUtil.closeSessionFactory();
	}
	}
}
