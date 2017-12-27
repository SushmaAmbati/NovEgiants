package com.egiants.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.egiants.coverter.ItemConverter;
import com.egiants.coverter.ItemDetailsConverter;
import com.egiants.entity.ItemDetails;
import com.egiants.groups.CreateOrUpdateValidation;
import com.egiants.model.ItemDetailModel;
import com.egiants.model.ItemModel;
import com.egiants.service.ItemDetailsService;
import com.egiants.validators.ItemDetailsValidator;
import com.egiants.validators.ItemValidator;

@RestController
@RequestMapping("/itemDetails")
public class ItemDetailsController {
	@Autowired
	ItemDetailsService ids;

	ItemDetailsConverter converter;

	@RequestMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public @ResponseBody ItemDetails getItemDetails(@PathVariable("id") Long id) {
		return ids.getItemDetails(id);
	}

	@RequestMapping(path = "/post", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public @ResponseBody void addItem(
			@Validated({ CreateOrUpdateValidation.class }) @RequestBody ItemDetailModel itemDetail,
			BindingResult bindingResult) {
		ItemDetailsValidator itemDetailValidator = new ItemDetailsValidator();
		itemDetailValidator.validate(itemDetail, bindingResult);
		if (bindingResult.hasErrors()) {
			return;
		} else {
			if (converter.convertModelToEntity(itemDetail) != null) {
				ids.addItemDetails(converter.convertModelToEntity(itemDetail));
			}
		}
	}

}
