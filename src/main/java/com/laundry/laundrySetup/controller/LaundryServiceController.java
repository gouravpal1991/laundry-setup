package com.laundry.laundrySetup.controller;

import com.laundry.laundrySetup.dao.LaundryServiceDAO;
import com.laundry.laundrySetup.entity.LaundryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/service")
public class LaundryServiceController {

    private LaundryServiceDAO laundryServiceDAO;

    public LaundryServiceController(LaundryServiceDAO laundryServiceDAO) {
        this.laundryServiceDAO = laundryServiceDAO;
    }

    @PostMapping("/addService")
    public LaundryService addLaundryService(@RequestBody LaundryService service) {
       return laundryServiceDAO.save(service);
    }

    @GetMapping("/services")
    public List<LaundryService> getLaundryServices(){
        return laundryServiceDAO.fetchAll();
    }
}
