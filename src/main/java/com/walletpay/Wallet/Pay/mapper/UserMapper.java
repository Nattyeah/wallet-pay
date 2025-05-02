package com.walletpay.Wallet.Pay.mapper;

import com.walletpay.Wallet.Pay.entity.User;
import com.walletpay.Wallet.Pay.entity.dto.request.UserRequest;
import com.walletpay.Wallet.Pay.entity.dto.response.UserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {

//    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
//    TODO entender pq a classe impl nao ta sendo gerada

    User toEntity(UserRequest user);
    UserResponse toResponse(User user);
}
