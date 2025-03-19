    package com.AgroMX.app.repository;

    import org.springframework.data.repository.CrudRepository;
    
    import com.AgroMX.app.model.ProductOrder;
import com.AgroMX.app.model.ProductOrderId;
    

    public interface ProductOrderRepository extends CrudRepository<ProductOrder, ProductOrderId>{} 