package com.walletpay.Wallet.Pay.service;

import com.walletpay.Wallet.Pay.UserType;
import com.walletpay.Wallet.Pay.entity.Transaction;
import com.walletpay.Wallet.Pay.entity.User;
import com.walletpay.Wallet.Pay.entity.dto.request.UserRequest;
import com.walletpay.Wallet.Pay.entity.dto.response.TransactionResponse;
import com.walletpay.Wallet.Pay.repository.TransactionRepository;
import com.walletpay.Wallet.Pay.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;
    private TransactionRepository transactionRepository;

    //    TODO CREATE COMMON USER - CAN MAKE TRANSFER TO OTHER USERS
    public User createCommonUser(User userRequest) {
        validateDocument(userRequest);
        return userRepository.save(userRequest);
    }

    //    TODO CREATE SELLER USER - CAN ONLY RECEIVE MONEY
    public User createSellerUser(User userRequest) {
        validateDocument(userRequest);
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
    private static void validateDocument(User userRequest) {
        if (userRequest.getDocument().length() == 14) {
            userRequest.setDocument(userRequest.getDocument().replace(".", "").replace("-", ""));
        } else if (userRequest.getDocument().length() == 11) {
            userRequest.setDocument(userRequest.getDocument().replace(".", ""));
        }
    }
}
