package com.egiants.dao;

import org.springframework.data.repository.CrudRepository;

import com.egiants.entity.Item;
import com.egiants.entity.ItemDetails;

public interface ItemDetailsRepository extends CrudRepository<ItemDetails, Long>{

}
