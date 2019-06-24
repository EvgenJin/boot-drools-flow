package com.javainuse.controller;

import com.javainuse.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.model.Product;
import com.javainuse.service.JewelleryShopService;

@RestController
public class JewelleryShopController {

	private final JewelleryShopService jewelleryShopService;

	@Autowired
	public JewelleryShopController(JewelleryShopService jewelleryShopService) {
		this.jewelleryShopService = jewelleryShopService;
	}

	@RequestMapping(value = "/getDiscount", method = RequestMethod.GET, produces = "application/json")
	public Message getQuestions(@RequestParam(required = true) String msg, @RequestParam(required = true) Integer cat_id) {

                Message message = new Message();
                message.setMessage(msg);
				message.setCat_id(cat_id);
                message.setStatus(Message.HELLO);
                jewelleryShopService.getProductDiscount(message);

		return message;
	}

}
