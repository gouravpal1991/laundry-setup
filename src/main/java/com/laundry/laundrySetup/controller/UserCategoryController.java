package com.laundry.laundrySetup.controller;

import com.laundry.laundrySetup.dao.UserCategoryDAO;
import com.laundry.laundrySetup.entity.CustomErrorResponse;
import com.laundry.laundrySetup.entity.UserCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class UserCategoryController {

    @Autowired
    UserCategoryDAO userCategoryDAO;

    @PostMapping("/addCategory")
    public UserCategory addUserCategory(@RequestBody UserCategory userCategory) {
        return userCategoryDAO.save(userCategory);
    }

    @GetMapping("/userCategories")
    public List<UserCategory> getUserCategories() throws CustomException {
        return userCategoryDAO.fetchAll();
    }

    //Add exception handler
    @ExceptionHandler
    public ResponseEntity<CustomErrorResponse> handleException(CustomException exc) {
        CustomErrorResponse errorResponse = new CustomErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), System.currentTimeMillis(), exc.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
