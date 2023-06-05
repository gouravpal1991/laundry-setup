package com.laundry.laundrySetup.dao;

import com.laundry.laundrySetup.entity.UserCategory;

import java.util.List;

public interface UserCategoryDAO {
    UserCategory save(UserCategory category);

    List<UserCategory> fetchAll();
}
