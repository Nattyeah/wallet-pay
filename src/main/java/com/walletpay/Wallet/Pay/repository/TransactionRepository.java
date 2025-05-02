package com.walletpay.Wallet.Pay.repository;

import com.walletpay.Wallet.Pay.entity.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends MongoRepository<Transaction, Long> {

    List<Transaction> findByPayerId(Long payerId);
    List<Transaction> findByPayeeId(Long payeeId);
}
