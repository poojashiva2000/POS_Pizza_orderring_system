package com.Int.pos.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Int.pos.model.CartBean;
import com.Int.pos.model.CreditCardBean;
import com.Int.pos.model.ProfileBean;

@Repository
public class UserDao {
	
	//CartDao
	@Autowired
    private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;
	private Query<CartBean> q;

	public String  addCart(CartBean cartbean) {
		{
			if(cartbean!=null)
			{
				session=sessionFactory.openSession();
				transaction=session.beginTransaction();
				session.save(cartbean);
				transaction.commit();
				session.close();
				return "SUCCESS";
			}
			else if(cartbean==null)
			{
				return "ERROR";
			}
			else
			{
				return "FAIL";
			}
		}
	}
	
	public String updatecart(CartBean cartbean)
	{
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		if(cartbean!=null)
		{
		session.update(cartbean);

		transaction.commit();

		session.close();
		return "SUCCESS";
		}
		else if(cartbean==null)
		{
			return "FAIL";
		}
		else
		{
			return "ERROR";
		}
	}
	public String removeCart(String CartId) {
		System.out.println("Under Dao "+CartId);
	    session = sessionFactory.openSession();
	    transaction = session.beginTransaction();
	    try {
	      //  int cid = Integer.parseInt(CartId);
	        Query q1 = session.createQuery("delete from CartBean where cartID=:cid");
	        q1.setParameter("cid", CartId);
	        q1.executeUpdate();
//	        Query q3 = session.createQuery("delete from CartBean where userid=:uid");
//	        q3.setParameter("uid", cid);
//	        q3.executeUpdate();
        transaction.commit();
        session.close();
	        return "True";
	    } catch (NumberFormatException e) {
	        transaction.rollback();
	        return "Invalid user ID";
	    } finally {
	        session.close();
	    }
	}
	public List<CartBean> viewAllCart()
	{
	    Session s=this.sessionFactory.openSession();
	    Query<CartBean> q=s.createQuery("from CartBean");
	    return q.list();
	}
	
	//CreditCardDao
	private Query<CreditCardBean> ccb;

	public String  addCreditCard(CreditCardBean creditcardbean) {
		{
			if(creditcardbean!=null)
			{
				session=sessionFactory.openSession();
				transaction=session.beginTransaction();
				session.save(creditcardbean);
				transaction.commit();
				session.close();
				return "SUCCESS";
			}
			else if(creditcardbean==null)
			{
				return "ERROR";
			}
			else
			{
				return "FAIL";
			}
		}
	}
	
	public String updateCreditCard(CreditCardBean creditcardbean)
	{
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		if(creditcardbean!=null)
		{
		session.update(creditcardbean);

		transaction.commit();

		session.close();
		return "SUCCESS";
		}
		else if(creditcardbean==null)
		{
			return "FAIL";
		}
		else
		{
			return "ERROR";
		}
	}
	public String removeCreditCard(String creditCardNumber) {
	    session = sessionFactory.openSession();
	    transaction = session.beginTransaction();
	    try {
	        Query q1 = session.createQuery("delete from CreditCardBean where creditCardNumber=:uid");
	        q1.setParameter("uid", creditCardNumber);
	        q1.executeUpdate();
	        transaction.commit();
	        return "True";
	    } catch (NumberFormatException e) {
	        transaction.rollback();
	        return "Invalid credit card number";
	    } finally {
	        session.close();
	    }
	}
	public List<CreditCardBean> viewAllCreditCard()
	{
	    Session s=this.sessionFactory.openSession();
	    Query<CreditCardBean> q=s.createQuery("from CreditCardBean");
	    return q.list();
	}

//PrfileDao
	private Query<ProfileBean> pb;

	public String  addProfile(ProfileBean profilebean) {
		{
			if(profilebean!=null)
			{
				session=sessionFactory.openSession();
				transaction=session.beginTransaction();
				session.save(profilebean);
				transaction.commit();
				session.close();
				return "SUCCESS";
			}
			else if(profilebean==null)
			{
				return "ERROR";
			}
			else
			{
				return "FAIL";
			}
		}
	}
	
	public String updateProfile(ProfileBean profileBean)
	{

		System.out.println("Under Dao "+profileBean);
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		if(profileBean!=null)
		{
		session.update(profileBean);

		transaction.commit();

		session.close();
		return "SUCCESS";
		}
		else if(profileBean==null)
		{
			return "FAIL";
		}
		else
		{
			return "ERROR";
		}
	}
//	public String removeprofile(String userId)
//	{
//		session=sessionFactory.openSession();
//		transaction=session.beginTransaction();
//		if(userId>=0)
//		{
//		Query q1=session.createQuery("delete from profileBean where userID=:uid");
//		q1.setParameter("uid", userId);
//		q1.executeUpdate();
//		transaction.commit();
//      	session.close();
//		return "True";
////		}
//		else
//		{
//			return "FAIL";
//		}
//	}
	
	public String removeProfile(int pvID) {
	    session = sessionFactory.openSession();
	    transaction = session.beginTransaction();
	    try {
	        int uid = pvID;
	        Query q1 = session.createQuery("delete from ProfileBean where pvid=:uid");
	        q1.setParameter("uid", uid);
	        q1.executeUpdate();
	        transaction.commit();
	        return "True";
	    } catch (NumberFormatException e) {
	        transaction.rollback();
	        return "Invalid user ID";
	    } finally {
	        session.close();
	    }
	}

	public List<ProfileBean> viewAllProfile()
	{
	    Session s=this.sessionFactory.openSession();
	    Query<ProfileBean> q=s.createQuery("from ProfileBean");
	    return q.list();
	}
	

}
