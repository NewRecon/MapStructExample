package com.example.daomapper.mappers;

import com.example.daomapper.dto.UserDto;
import com.example.daomapper.models.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses = PassportMapper.class)
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper( UserMapper.class );
    UserDto userToUserDto(User user);
    User userDtoToUser(UserDto userDto);
}
