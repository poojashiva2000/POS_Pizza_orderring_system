package com.Int.pos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Int.pos.model.CartBean;
import com.Int.pos.model.CredentialBean;
import com.Int.pos.model.FoodBean;
import com.Int.pos.model.OrderBean;
import com.Int.pos.model.StoreBean;
import com.Int.pos.service.AdminstratorService;
//import com.Int.pos.service.CartService;
//import com.Int.pos.service.CredentialService;
//import com.Int.pos.service.FoodService;
//import com.Int.pos.service.OrderService;

@RestController
@CrossOrigin(origins ="*")
	
	@RequestMapping("/admin")
	public class AdminstratorController {

	//Store Controller
	
		@Autowired
			private AdminstratorService adserv;
		
		@GetMapping("/selectUser/{userID}/{password}")
		@ResponseBody
		public boolean auth(@PathVariable String userID,@PathVariable String password)
	{
			System.out.println("Under Controller "+userID+" "+password);
			CredentialBean cb=new CredentialBean();
			cb.setUserID(userID);
			cb.setPassword(password);
			System.out.println(adserv.authenticate(cb));;
			return adserv.authenticate(cb);
		}
		@PostMapping("/registerUser")
		public String reg(@RequestBody CredentialBean cb)
		{
			adserv.registerUser(cb);
			return "<h1>User Added Successfully</h1>";
		}
		
		@PostMapping("/addStore")
		public String addstore(@RequestBody StoreBean storeBean)
		{
			adserv.addStore(storeBean);
			return "<h1>Store Added Successfully</h1>";
		}
		@GetMapping("/selectAllStore")
		public List<StoreBean> selectstore()
		{
			
			return adserv.viewStore();
		}
		@PutMapping("/updateStore")
		public String updatestore(@RequestBody StoreBean storeBean)
		{
			System.out.println("Under Controller "+storeBean);
//			HttpHeaders httpHeaders= new HttpHeaders();
//		    httpHeaders.setContentType(MediaType.APPLICATION_JSON);
			adserv.updateStore(storeBean);
			return "<h1> Store  Updated successfully</h1>";
		}
		@GetMapping("/stored/{id}")
		public StoreBean meth4(@PathVariable(value = "id") String storeID)
		{
			return adserv.viewStoreById(storeID);
			
		}
		@DeleteMapping("/deleteStore/{id}")
		public String deletestore(@PathVariable(value="id") String storeId)
		{
			return "<h1>"+adserv.removeStore(storeId)+" record deleted successfully</h1>";
		}
		
		// Credential Controller
//		@Autowired
//		private CredentialService creserv;
	@PostMapping("/addCredential")
	public String addCredential(@RequestBody CredentialBean credentialbean)
	{
		adserv.addCredential(credentialbean);
		return "<h1>credentials Added Successfully</h1>";
	}
	@GetMapping("/selectAllCredentials")
	public List<CredentialBean> selectcredentials()
	{
		
		return adserv.viewCredential();
	}
	@GetMapping("/credentialid/{id}")
	public CredentialBean viewCredentialByID(@PathVariable(value = "id") String userID)
	{
		return adserv.ViewCredentialById(userID);
		
	}
	@PutMapping("/updateCredential")
	public String updatecredential(@RequestBody CredentialBean credentialbean)
	{
		adserv.updateCredential(credentialbean);
		return "<h1> Credential  Updated successfully</h1>";
	}

	@DeleteMapping("/deleteCredential/{id}")
	public String deletecredential(@PathVariable(value="id") String userId)
	{
		return "<h1>"+adserv.removeCredential(userId)+" record deleted successfully</h1>";
	}
	
	//FoodController
//	@Autowired
//	private FoodService fserv;
@PostMapping("/addFood")
public String addfood(@RequestBody FoodBean fb)
{
	adserv.addFood(fb);
	return "<h1>food Added Successfully</h1>";
}
@GetMapping("/selectAllFood")
public List<FoodBean> selectfood()
{
	
	return adserv.viewFood();
}
@GetMapping("/foodid/{id}")
public StoreBean viewByID(@PathVariable(value = "id") String foodID)
{
	return adserv.viewStoreById(foodID);
	
}
@PutMapping("/updateFood")
public String updatefood(@RequestBody FoodBean fb)
{
	adserv.updateFood(fb);
	return "<h1> Food  Updated successfully</h1>";
}

@DeleteMapping("/deleteFood/{id}")
public String deletefood(@PathVariable(value="id") String  FoodId)
{
	return "<h1>"+adserv.removeFood(FoodId)+" record deleted successfully</h1>";
}


//OrderController

//@Autowired
//private OrderService oserv;
@PostMapping("/addOrder")
public String addorder(@RequestBody OrderBean ob)
{
adserv.addOrder(ob);
return "<h1>order Added Successfully</h1>";
}
@GetMapping("/selectAllOrder")
public List<OrderBean> selectorder()
{

return adserv.viewOrder();
}
@GetMapping("/orderid/{id}")
public StoreBean ViewOrderById(@PathVariable(value = "id") String orderID)
{
	return adserv.viewStoreById(orderID);
	
}
@PutMapping("/updateOrder")
public String updateorder(@RequestBody OrderBean ob)
{
adserv.updateOrder(ob);
return "<h1> Order  Updated successfully</h1>";
}

@DeleteMapping("/deleteOrder/{id}")
public String deleteorder(@PathVariable(value="id") String orderId)
{
return "<h1>"+adserv.removeOrder(orderId)+" record deleted successfully</h1>";
}
				
}