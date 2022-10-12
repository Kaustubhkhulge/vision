package com.salesxl.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaveCurrencyDataToDb  extends CrudRepository<Snoc, String> {

}
