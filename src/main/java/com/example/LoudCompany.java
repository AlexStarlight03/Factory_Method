package com.example;

public class LoudCompany extends CompanyFactory {
    
    @Override
    public Product createProduct() {
        return new Speakers();
    }

}