package com.walletpay.Wallet.Pay.entity;

import com.walletpay.Wallet.Pay.UserType;
import jakarta.persistence.Id;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Getter
@Setter
@Document(collection = "users")
public class User {

  @Id
  @MongoId
  private ObjectId id;

  private String name;
  private String document;
  private String email;
  private String pass;
  private BigDecimal balance;
  private UserType userType;

  @DBRef
  private List<Transaction> sentTransactions = new ArrayList<>();

  @DBRef
  private List<Transaction> receivedTransactions = new ArrayList<>();
}
