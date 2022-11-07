package com.uc.docker.mapper;

import com.uc.docker.model.dto.PurchasedDto;
import com.uc.docker.model.entity.Purchased;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PurchasedDtoMapper extends BaseMapper<Purchased, PurchasedDto>{
}
