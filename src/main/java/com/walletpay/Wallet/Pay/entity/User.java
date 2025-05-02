package com.walletpay.Wallet.Pay.entity;

import com.walletpay.Wallet.Pay.UserType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class User {

    @MongoId
    private Long id;
    private String name;
    private String document;
    private String email;
    private String pass;
    private BigDecimal balance;
    @Enumerated(EnumType.STRING)
    private UserType userType;

    @OneToMany(mappedBy = "payer")
    private List<Transaction> sentTransactions = new ArrayList<>();

    @OneToMany(mappedBy = "payee")
    private List<Transaction> receivedTransactions = new ArrayList<>();
}
