package com.example.daomapper.mappers;

import com.example.daomapper.dto.PassportDto;
import com.example.daomapper.models.Passport;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses = AddressMapper.class)
public interface PassportMapper {
    PassportMapper INSTANCE = Mappers.getMapper(PassportMapper.class);

    PassportDto passportToUserDto(Passport user);

//    @Mapping(source = "passport.id", target = "id")
    Passport userDtoToPassport(PassportDto userDto);
}
