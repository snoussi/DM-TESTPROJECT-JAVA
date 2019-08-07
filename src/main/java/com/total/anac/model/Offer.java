package com.total.anac.model;

import java.util.ArrayList;
import java.util.List;

public class Offer {

    private ProductPackage financialPackage;
    private List<Product> products = new ArrayList<Product>();
    private int discount;
    private String offer="";

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setFinancialPackage(ProductPackage financialPackage) {
        this.financialPackage = financialPackage;
    }

    public ProductPackage getFinancialPackage() {
        return financialPackage;
    }

    public void addSingleProduct(Product prod){
        products.add(prod);
    }

    public List<Product> getProducts() {
        return products;
    }

    public String getOffer() {
		return offer;
	}

	public void setOffer(String offer) {
		this.offer = offer;
	}

	public enum Product {
        LOAN,
        SUPERLOAN,
        INSURANCE
    }

    public enum ProductPackage {
        GETTINGSTARTED_PACKAGE,
        CAREERFOCUSED_PACKAGE,
        ADVICEFAMILY_PACKAGE,
        EMPTYNESTER_PACKAGE,
        GOLDENYEARS_PACKAGE,
        BUSINESS_PACKAGE
    }
}
