package com.walletpay.Wallet.Pay.controller;

import com.walletpay.Wallet.Pay.entity.dto.request.TransactionRequest;
import com.walletpay.Wallet.Pay.entity.dto.request.UserRequest;
import com.walletpay.Wallet.Pay.entity.dto.response.TransactionResponse;
import com.walletpay.Wallet.Pay.entity.dto.response.UserResponse;
import com.walletpay.Wallet.Pay.mapper.TransactionMapper;
import com.walletpay.Wallet.Pay.mapper.UserMapper;
import com.walletpay.Wallet.Pay.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

  private final UserService userService;
  private final UserMapper userMapper;
  private final TransactionMapper transactionMapper;

  @PostMapping
  public UserResponse createUser(@RequestBody @Valid UserRequest userRequest) {
    log.info("[USER-CONTROLLER] Create user");
    var user = userService.createUser(userMapper.toEntity(userRequest));
    return userMapper.toResponse(user);
  }

  @PatchMapping
  public TransactionResponse updateBalance(@RequestBody @Valid TransactionRequest userRequest) {
    log.info("[USER-CONTROLLER] Update balance");
    var transaction = userService.updateBalance(transactionMapper.toEntity(userRequest));
    return transactionMapper.toResponse(transaction);
  }
}
