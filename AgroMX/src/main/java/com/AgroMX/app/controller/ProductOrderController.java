package com.AgroMX.app.controller;

    import org.springframework.http.ResponseEntity;
    
    import com.AgroMX.app.model.ProductOrder;
    
    public interface ProductOrderController {
        
        ResponseEntity<ProductOrder> getProductOrderById(Long id);
            
        ResponseEntity< ProductOrder > createProductOrder(ProductOrder newProductOrder);
        
        ResponseEntity< ProductOrder > updateProductOrder(ProductOrder productOrder, Long id);
    
        ResponseEntity< Void > deleteProductOrder(Long id);
     
    }
