package com.example.daomapper.controllers;

import com.example.daomapper.dto.UserDto;
import com.example.daomapper.mappers.AddressMapper;
import com.example.daomapper.mappers.PassportMapper;
import com.example.daomapper.mappers.UserMapper;
import com.example.daomapper.models.Address;
import com.example.daomapper.models.Passport;
import com.example.daomapper.models.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public User createUser(@RequestBody UserDto userDto) {

//        Passport passport = PassportMapper.INSTANCE.userDtoToPassport(userDto);
//
//        User user = UserMapper.INSTANCE.userDtoToUser(userDto);
//
//        Address birthAddress = AddressMapper.INSTANCE.userDtoToBirthAddress(userDto);
//        Address registerAddress = AddressMapper.INSTANCE.userDtoToRegistrationAddress(userDto);

//        passport.setBirthAddress(birthAddress);
//        passport.setRegisterAddress(registerAddress);
//
//        user.setPassport(passport);

        Address address = AddressMapper.INSTANCE.userDtoToRegistrationAddress(userDto.getPassport().getRegisterAddress());
        Passport passport = PassportMapper.INSTANCE.userDtoToPassport(userDto.getPassport());
        User user = UserMapper.INSTANCE.userDtoToUser(userDto);

        return user;
    }

    @PostMapping("/passports")
    @ResponseStatus(HttpStatus.CREATED)
    public Passport createPassport(@RequestBody UserDto userDto) {

//        Passport passport = Passport.builder()
//                .id(userDto.getPassportId())
//                .firstName(userDto.getFirstName())
//                .lastName(userDto.getLastName())
//                .build();

        return null;
    }
}
