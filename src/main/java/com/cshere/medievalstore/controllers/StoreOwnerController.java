package com.cshere.medievalstore.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cshere.medievalstore.model.Item;
import com.cshere.medievalstore.model.SimpleItem;

@Controller
@RequestMapping(value="/owner")
public class StoreOwnerController {

	@PostMapping(value = "/additem", produces = MediaType.APPLICATION_JSON_VALUE) 
	@ResponseBody
	public Item addItem(Item item) {
		SimpleItem simpleItem = new SimpleItem();
		simpleItem.setName("Sword");
		simpleItem.setPrice(50);
		simpleItem.setDescription("A fine steel blade, aye!");
		return simpleItem;
	}
}
