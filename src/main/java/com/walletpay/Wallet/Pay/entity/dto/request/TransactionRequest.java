package com.walletpay.Wallet.Pay.entity.dto.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public record TransactionRequest(
        Long payerId,
        Long payeeId,
        BigDecimal value,
        LocalDateTime timestamp
) {
}
