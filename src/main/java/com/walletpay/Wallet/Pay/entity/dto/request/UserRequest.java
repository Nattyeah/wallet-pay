package com.walletpay.Wallet.Pay.entity.dto.request;

import lombok.Builder;

import java.math.BigDecimal;

@Builder
public record UserRequest(
    String name,
    String document,
    String email,
    String pass,
    BigDecimal balance
) {
}
