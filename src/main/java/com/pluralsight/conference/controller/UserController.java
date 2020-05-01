package com.pluralsight.conference.controller;

import com.pluralsight.conference.model.Registration;
import com.pluralsight.conference.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser(
            @RequestParam(value = "firstname", defaultValue = "Bryan") String firstname,
            @RequestParam(value = "lastname", defaultValue = "Popov") String lastname
    ) {
        User user = new User();

        user.setFirstname(firstname);
        user.setLastname(lastname);
        user.setAge(23);

        return user;
    }

    @PostMapping("/user")
    public User postUser(
            @Valid User user,
            BindingResult result
    ) throws BindException {
        System.out.println("user: " + user.getFirstname());
        if(result.hasErrors()) {
            for (ObjectError error: result.getAllErrors()) {
                System.out.println(error.getDefaultMessage());
            }
//            throw new HttpClientErrorException.BadRequest("adf", );
            System.out.println("Errors!!!!!!!!!");
//            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "bad request");
            throw new BindException(result);
        }


        return user;
    }
}
