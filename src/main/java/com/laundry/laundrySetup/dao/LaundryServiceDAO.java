package com.laundry.laundrySetup.dao;

import com.laundry.laundrySetup.entity.LaundryService;

import java.util.List;

public interface LaundryServiceDAO {
    LaundryService save(LaundryService service);

    List<LaundryService> fetchAll();
}
