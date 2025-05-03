package com.walletpay.Wallet.Pay.entity;

import jakarta.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Getter
@Setter
@Document(collection = "transactions")
public class Transaction {

  @Id
  @MongoId
  private ObjectId id;

  @DBRef
  private User payer;

  @DBRef
  private User payee;

  private BigDecimal value;

  private LocalDateTime timestamp;
}
