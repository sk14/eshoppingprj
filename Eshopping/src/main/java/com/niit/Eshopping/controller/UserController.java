package com.niit.Eshopping.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.EshoppingBackend1.dao.CartDAO;
import com.niit.EshoppingBackend1.dao.CartItemDAO;
import com.niit.EshoppingBackend1.dao.ProductDAO;
import com.niit.EshoppingBackend1.dao.UserDAO;
import com.niit.EshoppingBackend1.dto.Cart;
import com.niit.EshoppingBackend1.dto.CartItem;
import com.niit.EshoppingBackend1.dto.Product;
import com.niit.EshoppingBackend1.dto.User;

@Controller
@RequestMapping("/customer")
public class UserController {

	@Autowired
	UserDAO userDAO;
	@Autowired
	ProductDAO productDAO;
//	@Autowired
	//CartDAO cartDAO;
	//@Autowired
	//CartItemDAO cartItemDAO;

	//@RequestMapping("/add/{id}/addcart")

	/*public String addToCart(Principal principal, @PathVariable Integer id, ModelMap model) {
		if (principal != null) {
			User user = userDAO.getUserByUsername(principal.getName());
			Cart cart = user.getCart();

			Product product = productDAO.getById(id);
			CartItem cartItem = cartItemDAO.getExistingCartItemCount(id, cart.getId());
			if (cartItem != null) {
				cartItem.setQuantity(cartItem.getQuantity() + 1);
				cartItem.setGrandTotal(cartItem.getGrandTotal() + product.getPrice());
				cartItemDAO.updateCartItem(cartItem);
				cart.setQuantity(cart.getQuantity() + 1);
				cart.setGrandTotal(cart.getGrandTotal() + product.getPrice());
				cartDAO.update(cart);
			} else {
				cartItem = new CartItem();
				cartItem.setQuantity(1);
				cartItem.setGrandTotal(product.getPrice());
				cartItem.setCart(cart);
				cartItem.setProduct(product);
				cartItemDAO.addCartItem(cartItem);
				cart.setQuantity(cart.getQuantity() + 1);
				cart.setGrandTotal(cart.getGrandTotal() + product.getPrice());
				cartDAO.update(cart);
			}

		}
		return "redirect:/products";
	}*/
}
