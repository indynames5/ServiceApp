package com.example.demo;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private List<Review> reviews;
    connectDatabase connect = new connectDatabase();
    //review
    @RequestMapping("/review")
    public List<Review> getRewiew() throws ClassNotFoundException {
        return connect.getReview();
    }
    //app
    @RequestMapping("/app")
    public List<AppData> getApp() throws ClassNotFoundException {
        return connect.getApp();
    }
    //Search category
    @RequestMapping("/app/category/{category}")
    public List<AppData> getAppCategory(@PathVariable String category) throws ClassNotFoundException {
        return connect.getAppGategory(category);
    }
    //Search name
    @RequestMapping("/app/name/{name}")
    public List<AppData> getAppName(@PathVariable String name) throws ClassNotFoundException {
        return connect.getAppName(name);
    }
    //Search type
    @RequestMapping("/app/type/{type}")
    public List<AppData> getAppType(@PathVariable String type) throws ClassNotFoundException {
        return connect.getAppType(type);
    }
    //mostly download
    @RequestMapping("/app/install")
    public List<AppData> getAppInstall() throws ClassNotFoundException {
        return connect.getAppInstall();
    }
}
