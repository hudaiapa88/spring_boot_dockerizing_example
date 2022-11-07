package com.uc.docker.mapper;

import com.uc.docker.model.dto.UserDto;
import com.uc.docker.model.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserDtoMapper extends BaseMapper<User, UserDto>{
}
