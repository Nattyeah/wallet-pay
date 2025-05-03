package com.walletpay.Wallet.Pay;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UserType {

  COMMON("COMMON"),
  SELLER("SELLER"),
  UNKNOWN("UNKNOWN");

  private final String type;

}
