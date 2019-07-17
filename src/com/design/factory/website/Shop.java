package com.design.factory.website;

import com.design.factory.*;
import com.design.factory.page.*;

public class Shop extends Website {
    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
