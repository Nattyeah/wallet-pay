package com.walletpay.Wallet.Pay.service;

import com.walletpay.Wallet.Pay.entity.Transaction;
import com.walletpay.Wallet.Pay.entity.User;
import com.walletpay.Wallet.Pay.entity.dto.response.TransactionResponse;
import com.walletpay.Wallet.Pay.repository.TransactionRepository;
import com.walletpay.Wallet.Pay.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

  private final UserRepository userRepository;
  private final TransactionRepository transactionRepository;

  //    TODO CREATE COMMON USER - CAN MAKE TRANSFER TO OTHER USERS
  public User createUser(User userRequest) {
    return userRepository.save(userRequest);
  }

//  TODO FIX TO ACTUALLY UPDATE BALANCE
  public Transaction updateBalance(Transaction transactionRequest) {
    return transactionRepository.save(transactionRequest);
  }

  //    TODO VALIDATE BALANCE BEFORE TRANSFERENCE
//    TODO TRANSACTIONS HISTORY
  public TransactionResponse getHistory(Transaction transactionRequest, User userRequest) {
    transactionRepository.findByPayerId(userRequest.getId());
    transactionRepository.findByPayeeId(transactionRequest.getId());
    return null;
  }


}
