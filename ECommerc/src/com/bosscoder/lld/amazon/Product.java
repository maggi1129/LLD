package com.bosscoder.lld.amazon;

public class Product {

    String name;
    String description;
    private Double price;
    int availableQuantity;

    String id;
    ProductCategory category;

    // In case of seller, link it to the product
    private Account seller;

    public int getAvailableQuantity(){
        return availableQuantity;
    }

    public boolean setPrice(Double price){
        this.price = price;
        return true;
    }

}

//enum ProductCategory{
//    FOOD_BEVERAGES,
//
//
//}

class ProductCategory{
    String categoryName;
    String categoryDescription;
}