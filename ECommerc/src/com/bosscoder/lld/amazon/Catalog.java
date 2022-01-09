package com.bosscoder.lld.amazon;

import java.util.List;
import java.util.Map;

public class Catalog implements SearchProduct{

    Map<String, List<Product>> productsByNameMap;
    Map<String, List<Product>> productsByCategoryMap;

    @Override
    public List<Product> searchByProductName(String name) {
        return null;
    }

    @Override
    public List<Product> searchByProductCategory(String category) {
        return null;
    }
}
