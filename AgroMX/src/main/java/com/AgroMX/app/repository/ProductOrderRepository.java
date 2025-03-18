    package com.AgroMX.app.repository;

    import org.springframework.data.repository.CrudRepository;
    
    import com.AgroMX.app.model.ProductOrder;
    
    public interface ProductOrderRepository extends CrudRepository<ProductOrder, Long> {
        
    
    } 
