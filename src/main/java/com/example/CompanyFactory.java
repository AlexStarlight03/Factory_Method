package com.example;

// Factory abstraite qui définit le contrat
public abstract class CompanyFactory {
    
    public abstract Product createProduct();
    
    public void produceProduct() {
        Product product = createProduct();
        product.createObject();
        product.draw();
    }
}