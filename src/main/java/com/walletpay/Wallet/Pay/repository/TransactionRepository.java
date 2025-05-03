package com.walletpay.Wallet.Pay.repository;

import com.walletpay.Wallet.Pay.entity.Transaction;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends MongoRepository<Transaction, Long> {

  List<Transaction> findByPayerId(ObjectId payerId);

  List<Transaction> findByPayeeId(ObjectId payeeId);
}
