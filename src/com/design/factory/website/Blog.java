package com.design.factory.website;

import com.design.factory.*;
import com.design.factory.page.*;

public class Blog extends Website {
    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new AboutPage());
        pages.add(new ContactPage());
        pages.add(new CommentPage());
    }
}
