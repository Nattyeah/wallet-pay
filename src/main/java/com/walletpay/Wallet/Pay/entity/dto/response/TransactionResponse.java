package com.walletpay.Wallet.Pay.entity.dto.response;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record TransactionResponse(
        Long id,
        Long payerId,
        Long payeeId,
        BigDecimal value,
        LocalDateTime timestamp
) {
}
