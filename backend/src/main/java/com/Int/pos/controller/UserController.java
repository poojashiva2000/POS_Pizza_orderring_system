package com.Int.pos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Int.pos.model.CartBean;
import com.Int.pos.model.CreditCardBean;
import com.Int.pos.model.ProfileBean;
//import com.Int.pos.service.CartService;
//import com.Int.pos.service.CreditCardService;
//import com.Int.pos.service.ProfileService;
import com.Int.pos.service.UserService;

@RestController
@CrossOrigin(origins = "*")
	
	@RequestMapping("/user")
public class UserController {
	
	//Cart controller
	
			@Autowired
			private UserService cserv;
		@PostMapping("/addCart")
		public String meth1(@RequestBody CartBean cartbean)
		{
			cserv.addCart(cartbean);
			return "<h1>cart Added Successfully</h1>";
		}
		@GetMapping("/selectAllCart")
		public List<CartBean> selectcart()
		{
			
			return cserv.viewCart();
		}
		@PutMapping("/updateCart")
		public String updqatecart(@RequestBody CartBean cb)
		{
			cserv.updateCart(cb);
			return "<h1> Cart  Updated successfully</h1>";
		}

		@DeleteMapping("/deleteCart/{id}")
		public String deletecart(@PathVariable(value="id") String FoodId)
		{
			System.out.println("Under Controller "+FoodId);
			return "<h1>"+cserv.removeCart(FoodId)+" record deleted successfully</h1>";
		}
		
		//CreditCard Controller
		
//		@Autowired
//		private CreditCardService ccserv;
	@PostMapping("/addCreditCard")
	public String meth1(@RequestBody CreditCardBean ccb)
	{
		cserv.addCreditCard(ccb);
		return "<h1>creditcard Added Successfully</h1>";
	}
	@GetMapping("/selectAllCreditCard")
	public List<CreditCardBean> meth2()
	{
		
		return cserv.viewCreditCard();
	}
	@PutMapping("/updateCreditCard")
	public String meth3(@RequestBody CreditCardBean ccb)
	{
		cserv.updateCreditCard(ccb);
		return "<h1> CreditCard  Updated successfully</h1>";
	}

	@DeleteMapping("/deleteCreditCard/{id}")
	public String meth5(@PathVariable(value="id") String CreditCardNumber)
	{
		return "<h1>"+cserv.removeCreditCard(CreditCardNumber)+" record deleted successfully</h1>";
	}
	
	//ProfileController
//	@Autowired
//	private ProfileService pserv;
@PostMapping("/addProfile")
public String addprofile(@RequestBody ProfileBean pb)
{
	cserv.addProfile(pb);
	return "<h1>profile Added Successfully</h1>";
}
@GetMapping("/selectAllProfile")
public List<ProfileBean> selectprofile()
{
	
	return cserv.viewProfile();
}
@PutMapping("/updateProfile")
public String updateprofile(@RequestBody ProfileBean pb)
{
	System.out.println("Under controller "+pb);
	cserv.updateProfile(pb);
	return "<h1> Profile  Updated successfully</h1>";
}

@DeleteMapping("/deleteProfile/{id}")
public String deleteprofile(@PathVariable(value="id") int pvID)
{
	return "<h1>"+cserv.removeProfile(pvID)+" record deleted successfully</h1>";
}


}
