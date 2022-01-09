package com.bosscoder.lld.amazon;

import java.util.List;

public interface SearchProduct {

    List<Product> searchByProductName(String name);

    List<Product> searchByProductCategory(String category);
}
