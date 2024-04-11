package com.example.daomapper.mappers;

import com.example.daomapper.dto.AddressDto;
import com.example.daomapper.dto.UserDto;
import com.example.daomapper.models.Address;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AddressMapper {
    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    AddressDto addressToUserDto(Address user);

//    @Mapping(source = "registerCountry", target = "country")
//    @Mapping(source = "registerCity", target = "city")
//    @Mapping(source = "registerStreet", target = "street")
//    @Mapping(source = "registerNumberOfHouse", target = "numberOfHouse")
    Address userDtoToRegistrationAddress(AddressDto userDto);

//    @Mapping(source = "birthCountry", target = "country")
//    @Mapping(source = "birthCity", target = "city")
//    Address userDtoToBirthAddress(AddressDto userDto);
}
