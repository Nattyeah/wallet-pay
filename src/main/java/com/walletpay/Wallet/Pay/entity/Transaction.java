package com.walletpay.Wallet.Pay.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Transaction {

    @MongoId
    private Long id;

    @ManyToOne
    private User payer;

    @ManyToOne
    private User payee;

    private BigDecimal value;

    private LocalDateTime timestamp;
}
