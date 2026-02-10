package com.example;

public class NeigeCompany extends CompanyFactory {
    
    @Override
    public Product createProduct() {
        return new Snowmobile();
    }
    
}