package com.Int.pos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Int.pos.dao.AdminstratorDao;
//import com.Int.pos.dao.CredentialDao;
//import com.Int.pos.dao.FoodDao;
//import com.Int.pos.dao.OrderDao;
//import com.Int.pos.dao.AdminstratorDao;
//import com.Int.pos.dao.StoreDao;
import com.Int.pos.model.CredentialBean;
import com.Int.pos.model.FoodBean;
import com.Int.pos.model.OrderBean;
//import com.Int.pos.model.FoodBean;
import com.Int.pos.model.StoreBean;

@Service
public class AdminstratorService {
	//StoreBean
	@Autowired
	private AdminstratorDao adao;
	@Autowired
	private AdminstratorDao addao;
	public boolean authenticate(CredentialBean user) {
		 return addao.authenticate(user);
	}
	public String registerUser(CredentialBean user) {
		return addao.registerUser(user);
	}
	public String addStore(StoreBean StoreBean) 
	{
		return adao.addStore(StoreBean);
	}
	public StoreBean viewStoreById(String storeID) {
		return adao.viewStoreById(storeID);
	}
	public List<StoreBean> viewStore()
	{
		return addao.viewStore();
	}
	public String updateStore(StoreBean StoreBean)
	{
		return addao.updateStore(StoreBean);
	}
	public String removeStore(String storeId)
	{
		return addao.removeStore(storeId);
	}

	public String addFood(FoodBean foodBean) 
	{
		return adao.addFood(foodBean);
	}
	public List<FoodBean> viewFood()
	{
		return adao.viewAllFood();
	}
	public FoodBean viewFoodById(String foodID) {
		return adao.viewFoodById(foodID);
	}
	public String updateFood(FoodBean FoodBean)
	{
		return adao.updateFood(FoodBean);
	}
	public String removeFood(String foodID)
	{
		return adao.removeFood(foodID);
	}

	
	//OrderBean
//	@Autowired
//	private AdminstratorDao odao;
	public String addOrder(OrderBean OrderBean) 
	{
		return adao.addOrder(OrderBean);
	}
	public List<OrderBean> viewOrder()
	{
		return adao.viewAllOrder();
	}
	public OrderBean viewOrderById(String orderID) {
		return adao.viewOrderById(orderID);
	}
	public String updateOrder(OrderBean OrderBean)
	{
		return adao.updateOrders(OrderBean);
	}
	public String removeOrder(String orderID)
	{
		return adao.removeOrder(orderID);
	}
	
	//CredentialBean
	@Autowired
	private AdminstratorDao credao;
	public String addCredential(CredentialBean CredentialBean) 
	{
		return credao.addCredential(CredentialBean);
	}
	public List<CredentialBean> viewCredential()
	{
		return credao.viewAllCredential();
	}
	public CredentialBean ViewCredentialById(String userID) {
		return credao.viewCredentialsById(userID);
	}
	public String updateCredential(CredentialBean CredentialBean)
	{
		return credao.updateCredential(CredentialBean);
	}
	public String removeCredential(String userId)
	{
		return credao.removeCredential(userId);
	}
}



   


