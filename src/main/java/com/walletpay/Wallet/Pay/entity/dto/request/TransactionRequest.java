package com.walletpay.Wallet.Pay.entity.dto.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import org.bson.types.ObjectId;

@Builder
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public record TransactionRequest(
    ObjectId payerId,
    ObjectId payeeId,
    BigDecimal value,
    LocalDateTime timestamp
) {
}
