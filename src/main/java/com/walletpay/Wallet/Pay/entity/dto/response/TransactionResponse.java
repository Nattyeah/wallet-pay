package com.walletpay.Wallet.Pay.entity.dto.response;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import org.bson.types.ObjectId;

public record TransactionResponse(
    ObjectId id,
    ObjectId payerId,
    ObjectId payeeId,
    BigDecimal value,
    LocalDateTime timestamp
) {
}
