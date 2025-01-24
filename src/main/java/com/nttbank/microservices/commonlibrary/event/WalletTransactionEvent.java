package com.nttbank.microservices.commonlibrary.event;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class WalletTransactionEvent extends GenericEvent<WalletTransferEvent> implements
    Serializable {

  private String transactionId;
  private String senderAccountId;
  private String senderPhoneNumber;
  private String receiverAccountId;
  private String receiverPhoneNumber;
  private BigDecimal amount;
  private BigDecimal senderBalanceUpdated;
  private String status;
  private String description;
}
