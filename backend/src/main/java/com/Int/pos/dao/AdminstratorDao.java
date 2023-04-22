package com.Int.pos.dao;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Int.pos.model.CartBean;
import com.Int.pos.model.CredentialBean;
import com.Int.pos.model.FoodBean;
import com.Int.pos.model.OrderBean;
import com.Int.pos.model.StoreBean;
//StoreBean
@Repository
	public class AdminstratorDao {
	    @Autowired
	    private SessionFactory sessionFactory;
		private Session session;
		private Transaction transaction;
		private Query<StoreBean> q;
		private Query<FoodBean> q1;
		public boolean authenticate(CredentialBean user) 
		{
			System.out.println("Under Dao "+user.getUserID()+" "+user.getPassword());
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			Query q3=session.createQuery("from CredentialBean where userID=:uid and password=:pss");
			q3.setParameter("uid", user.getUserID());
			q3.setParameter("pss", user.getPassword());
			ArrayList<CredentialBean> al=(ArrayList<CredentialBean>) q3.getResultList();
			int count=0;
			for(CredentialBean cb:al)
			{
				if((cb.getUserID().equals(user.getUserID()))&&(cb.getPassword().equals(user.getPassword())))
				{
					System.out.println("Record is  present"+cb.getUserID()+" "+cb.getPassword());
					count++;
					if(count>0)
					{
			return true;
					}
					else
					{
						return false;
					}
				}
			}
			return false;
					
		}
		public  String registerUser(CredentialBean user)
		{
			System.out.println("Under Dao "+user.getUserID()+" "+user.getPassword());
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			session.save(user);
			transaction.commit();
			session.close();
			return "success";
			
		}

		public String  addStore(StoreBean storebean) {
			{
				if(storebean!=null)
				{
					session=sessionFactory.openSession();
					transaction=session.beginTransaction();
					session.save(storebean);
					transaction.commit();
					session.close();
					return "SUCCESS";
				}
				else if(storebean==null)
				{
					return "ERROR";
				}
				else
				{
					return "FAIL";
				}
			}
		}
		
		public String updateStore(StoreBean storeBean)
		{
			System.out.println("Under Dao "+storeBean);
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			if(storeBean!=null)
			{
			session.update(storeBean);

			transaction.commit();

			session.close();
			return "SUCCESS";
			}
			else if(storeBean==null)
			{
				return "FAIL";
			}
			else
			{
				return "ERROR";
			}
		}
		public String removeStore(String storeID)
		{
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			if(storeID != null)
			{
//		 Query q1 = session.createQuery("delete from OrderBean Where storeID=:uid");
//		        q1.setParameter("uid", storeID);
//		        q1.executeUpdate();
			 Query q2 = session.createQuery("delete from StoreBean where storeID=:eid");
			 q2.setParameter("eid", storeID);
		        q2.executeUpdate();
		       
			
	transaction.commit();
	session.close();
			return "SUCCESS";
			}
			else
			{
				return "FAIL";
			}
		}

 		

		public ArrayList<StoreBean> viewStore() {
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			Query q=session.createQuery("from StoreBean");
			return (ArrayList<StoreBean>)q.list();
		}
		

		public StoreBean viewStoreById(String storeID)
		{
			StoreBean elBean=new StoreBean();
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
		Query<StoreBean> q2=session.createQuery("from StoreBean where storeID=:eid");
		q2.setParameter("eid", storeID);
		ArrayList<StoreBean> all=(ArrayList<StoreBean>) q2.getResultList();
		for(StoreBean e1:all)
		{
			elBean=e1;
		}
		return elBean;
		
		}
		
		//FoodDao
		
	
		private Query<FoodBean> fb;
		public String  addFood(FoodBean foodbean) {
			{
				System.out.println(foodbean);
				if(foodbean!=null)
				{
					session=sessionFactory.openSession();
					transaction=session.beginTransaction();
					session.save(foodbean);
					transaction.commit();
					session.close();
					return "SUCCESS";
				}
				else if(foodbean==null)
				{
					return "ERROR";
				}
				else
				{
					return "FAIL";
				}
			}
		}
		public String updateFood(FoodBean foodbean)
		{
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			if(foodbean!=null)
			{
			session.update(foodbean);

			transaction.commit();

			session.close();
			return "SUCCESS";
			}
			else if(foodbean==null)
			{
				return "FAIL";
			}
			else
			{
				return "ERROR";
			}
		}
		public String removeCartByFood(String foodid)
		{
			System.out.println("Under Dao");
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
		
//			Query<CartBean> q5=session.createQuery("delete from CartBean where foodBean=:fid");
//			q5.setParameter("fid",foodid);
//			q5.executeUpdate();
	transaction.commit();
	session.close();
			return "SUCCESS";
			
		}
		public String removeFood(String foodID)
		{
			//FoodBean fb=viewFood(foodID);
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			Query q8=session.createQuery("delete from CartBean where fkid=:fid0");
			q8.setParameter("fid0", foodID);
			q8.executeUpdate();
			transaction.commit();
			session.close();
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			
			Query q9=session.createQuery("delete from FoodBean where foodid=:fid");
			q9.setParameter("fid", foodID);
			
			q9.executeUpdate();
			

	transaction.commit();
	session.close();
			return "Success";
		}

		public FoodBean viewFood(String foodId) {
			FoodBean fb=new FoodBean();
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			Query q2=session.createQuery("from FoodBean where foodID=:fid");
			q2.setParameter("fid", foodId);
			fb=(FoodBean) q2.getResultList();
			transaction.commit();
			session.close();
			return fb;
			
		}
		public ArrayList<FoodBean>viewAllFood(){
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			q1=session.createQuery("from FoodBean");
			return (ArrayList<FoodBean>)q1.list();
		
			
		}
		public FoodBean viewFoodById(String foodID)
		{
		FoodBean elBean=new FoodBean();
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
		Query<FoodBean> q2=session.createQuery("from FoodBean where foodID=:eid");
		q2.setParameter("eid", foodID);
		ArrayList<FoodBean> all=(ArrayList<FoodBean>) q2.getResultList();
		for(FoodBean e1:all)
		{
			elBean=e1;
		}
		return elBean;
		
		}
//
//		public String changeOrderStatus(String orderId) {
//			// TODO Auto-generated method stub
//			return null;
//		}

		
		//CredentialDao
	
		private Query<CredentialBean> qb;

		public String  addCredential(CredentialBean credentialbean) {
			{
				if(credentialbean!=null)
				{
					session=sessionFactory.openSession();
					transaction=session.beginTransaction();
					session.save(credentialbean);
					transaction.commit();
					session.close();
					return "SUCCESS";
				}
				else if(credentialbean==null)
				{
					return "ERROR";
				}
				else
				{
					return "FAIL";
				}
			}
		}
		
		public String updateCredential(CredentialBean credentialbean)
		{
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			if(credentialbean!=null)
			{
			session.update(credentialbean);

			transaction.commit();

			session.close();
			return "SUCCESS";
			}
			else if(credentialbean==null)
			{                                           
				return "FAIL";
			}
			else
			{
				return "ERROR";
			}
		}
		public String removeCredential(String userId) {
		    session = sessionFactory.openSession();
		    transaction = session.beginTransaction();
		    try {
		        int uid = Integer.parseInt(userId);
		        Query q1 = session.createQuery("delete from ProfileBean where user_id=:uid");
		        q1.setParameter("uid", uid);
		        q1.executeUpdate();
		        Query q2 = session.createQuery("delete from CredentialBean where userid=:uid");
		        q2.setParameter("uid", uid);
		        q2.executeUpdate();
		       
		        
		        transaction.commit();
		        
		        return "True";
		    } catch (NumberFormatException e) {
		        transaction.rollback();
		        return "Invalid user ID";
		    } finally {
		        session.close();
		    }
		}
		public List<CredentialBean> viewAllCredential()
		{
		    Session s=this.sessionFactory.openSession();
		    Query<CredentialBean> q=s.createQuery("from CredentialBean");
		    return q.list();
		}
		public CredentialBean viewCredentialsById(String userID)
		{
			CredentialBean elBean=new CredentialBean();
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
		Query<CredentialBean> q2=session.createQuery("from CredentialBean where userID=:eid");
		q2.setParameter("eid", userID);
		ArrayList<CredentialBean> all=(ArrayList<CredentialBean>) q2.getResultList();
		for(CredentialBean e1:all)
		{
			elBean=e1;
		}
		return elBean;
		
		}
		
		//OrderDao

		private Query<OrderBean> qa;

		public String  addOrder(OrderBean orderbean) {
			{
				if(orderbean!=null)
				{
					session=sessionFactory.openSession();
					transaction=session.beginTransaction();
					session.save(orderbean);
					transaction.commit();
					session.close();
					return "SUCCESS";
				}
				else if(orderbean==null)
				{
					return "ERROR";
				}
				else
				{
					return "FAIL";
				}
			}
		}
		
		public String updateOrders(OrderBean orderbean)
		{
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			if(orderbean!=null)
			{
			session.update(orderbean);

			transaction.commit();

			session.close();
			return "SUCCESS";
			}
			else if(orderbean==null)
			{
				return "FAIL";
			}
			else
			{
				return "ERROR";
			}
		}

		
		public String removeOrder(String orderID) {
		    session = sessionFactory.openSession();
		    transaction = session.beginTransaction();
		    try {
		        int uid = Integer.parseInt(orderID);
		        Query q1 = session.createQuery("delete from OrderBean where orderid=:uid");
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
		public List<OrderBean> viewAllOrder()
		{
		    Session s=this.sessionFactory.openSession();
		    Query<OrderBean> q=s.createQuery("from OrderBean");
		    return q.list();
		}
		
		public OrderBean viewOrderById(String orderID)
		{
			OrderBean elBean=new OrderBean();
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
		Query<OrderBean> q2=session.createQuery("from OrderBean where orderID=:eid");
		q2.setParameter("eid", orderID);
		ArrayList<OrderBean> all=(ArrayList<OrderBean>) q2.getResultList();
		for(OrderBean e1:all)
		{
			elBean=e1;
		}
		return elBean;
		
		}
		
		

		



		
		
		
		
	}

