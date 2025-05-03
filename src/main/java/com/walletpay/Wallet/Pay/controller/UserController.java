package com.walletpay.Wallet.Pay.controller;

import com.walletpay.Wallet.Pay.entity.dto.request.UserRequest;
import com.walletpay.Wallet.Pay.entity.dto.response.UserResponse;
import com.walletpay.Wallet.Pay.mapper.UserMapper;
import com.walletpay.Wallet.Pay.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

  private final UserService userService;
  private final UserMapper userMapper;

  @PostMapping
  public UserResponse createUser(@RequestBody @Valid UserRequest userRequest) {
    var user = userService.createCommonUser(userMapper.toEntity(userRequest));
    return userMapper.toResponse(user);
  }
}
