package com.laioffer.onlineorder.controller;

import com.laioffer.onlineorder.entity.MenuItem;
import com.laioffer.onlineorder.entity.Restaurant;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

import java.util.List;

@Controller
public class MenuInfoController {

    /**
     * Use the @ResponseBody annotation on a method to indicate that the return value should be written straight to the
     * HTTP response body, and it will be automatically convert to json format
     * @param restaurantId
     * @return
     */
    @RequestMapping(value = "/restaurant/{restaurantId}/menu", method = RequestMethod.GET)
    @ResponseBody
    public List<MenuItem> getMenus(@PathVariable("restaurantId") int restaurantId) {
        return new ArrayList<>();
    }

    @RequestMapping(value = "/restaurants", method = RequestMethod.GET)
    @ResponseBody
    public List<Restaurant> getRestaurants() {
        return new ArrayList<>();
    }
}

