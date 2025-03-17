package com.AgroMX.app.service;

import com.AgroMX.app.model.ProductOrder;

public interface ProductOrderService {

    
	ProductOrder createProductOrder(ProductOrder productOrder);
	ProductOrder getProductOrderById(Long id);
	ProductOrder updateProductOrder(ProductOrder productOrder);
	void deleteProductOrder(Long id);

}
