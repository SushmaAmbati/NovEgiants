package com.egiants.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.egiants.model.ItemDetailModel;
import com.egiants.model.ItemModel;

public class ItemDetailsValidator implements Validator {
	@Override
	public boolean supports(Class<?> arg0) {
		return ItemDetailModel.class.equals(arg0);
	}

	@Override
	public void validate(Object arg0, Errors arg1) {
		// TODO Auto-generated method stub

	}
}
