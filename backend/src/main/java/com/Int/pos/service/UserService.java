package com.Int.pos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.Int.pos.dao.CartDao;
//import com.Int.pos.dao.CreditCardDao;
//import com.Int.pos.dao.ProfileDao;
import com.Int.pos.dao.UserDao;
import com.Int.pos.model.CartBean;
import com.Int.pos.model.CreditCardBean;
import com.Int.pos.model.ProfileBean;

//CartBean
	@Service
	public class UserService {
	
		@Autowired
		private UserDao cdao;
		public String addCart(CartBean CartBean) 
		{
			return cdao.addCart(CartBean);
		}
		public List<CartBean> viewCart()
		{
			return cdao.viewAllCart();
		}
		public String updateCart(CartBean CartBean)
		{
			return cdao.updatecart(CartBean);
		}
		public String removeCart(String CartId)
		{
			return cdao.removeCart(CartId);
		}
	
		
//CreditCardBean
//		@Autowired
//		private CreditCardDao ccdao;
		public String addCreditCard(CreditCardBean CreditCardBean) 
		{
			return cdao.addCreditCard(CreditCardBean);
		}
		public List<CreditCardBean> viewCreditCard()
		{
			return cdao.viewAllCreditCard();
		}
		public String updateCreditCard(CreditCardBean CreditCardBean)
		{
			return cdao.updateCreditCard(CreditCardBean);
		}
		public String removeCreditCard(String CreditCardNumber)
		{
			return cdao.removeCreditCard(CreditCardNumber);
		}
	
//ProfileBean
//		@Autowired
//		private ProfileDao pdao;
		public String addProfile(ProfileBean ProfileBean) 
		{
			return cdao.addProfile(ProfileBean);
		}
		public List<ProfileBean> viewProfile()
		{
			return cdao.viewAllProfile();
		}
		public String updateProfile(ProfileBean ProfileBean)
		{
			return cdao.updateProfile(ProfileBean);
		}
		public String removeProfile(int pvID)
		{
			return cdao.removeProfile(pvID);
		}
	
	}
		


