package com.walletpay.Wallet.Pay.mapper;

import com.walletpay.Wallet.Pay.entity.Transaction;
import com.walletpay.Wallet.Pay.entity.dto.request.TransactionRequest;
import com.walletpay.Wallet.Pay.entity.dto.response.TransactionResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TransactionMapper {

  @Mapping(target = "id", ignore = true)
  @Mapping(target = "payer.id", source = "payerId")
  @Mapping(target = "payee.id", source = "payeeId")
  Transaction toEntity(TransactionRequest transactionRequest);

  @Mapping(target = "payerId", source = "payer.id")
  @Mapping(target = "payeeId", source = "payee.id")
  TransactionResponse toResponse(Transaction transaction);

}
