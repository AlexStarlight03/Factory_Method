package com.example;

public class ClassiqueCompany extends CompanyFactory {
    
    @Override
    public Product createProduct() {
        return new Piano();
    }

}