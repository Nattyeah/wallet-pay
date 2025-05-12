package com.walletpay.Wallet.Pay.mapper;

import com.walletpay.Wallet.Pay.UserType;
import com.walletpay.Wallet.Pay.entity.User;
import com.walletpay.Wallet.Pay.entity.dto.request.UserRequest;
import com.walletpay.Wallet.Pay.entity.dto.response.UserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

  @Mapping(target = "id", ignore = true)
  @Mapping(target = "sentTransactions", ignore = true)
  @Mapping(target = "receivedTransactions", ignore = true)
  @Mapping(target = "userType", expression = "java(determineUserType(userRequest.document()))")
  User toEntity(UserRequest userRequest);

  @Mapping(target = "userId", source = "id")
  UserResponse toResponse(User user);

  default UserType determineUserType(String document) {
    if (document.length() == 14) {
      return UserType.SELLER;
    } else if (document.length() == 11) {
      return UserType.COMMON;
    }
    return UserType.UNKNOWN;
  }
}
