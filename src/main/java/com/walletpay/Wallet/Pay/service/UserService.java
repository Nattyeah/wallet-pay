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

  //    TODO VALIDATE BALANCE BEFORE TRANSFERENCE
//    TODO TRANSACTIONS HISTORY
  public TransactionResponse getHistory(Transaction transactionRequest, User userRequest) {
    transactionRepository.findByPayerId(userRequest.getId());
    transactionRepository.findByPayeeId(transactionRequest.getId());
    return null;
  }

  //Como entender melhor de quem é a obrigação de mandar as informacoes entre o front e back
}
