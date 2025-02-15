package com.nttbank.microservices.commonlibrary.event;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WalletTransferEvent extends GenericEvent<WalletTransferEvent> implements Serializable {

  @Serial
  private static final long serialVersionUID = 129348939L;

  private String transactionId;
  private String senderAccountId;
  private String senderPhoneNumber;
  private String receiverAccountId;
  private String receiverPhoneNumber;
  private BigDecimal amount;


}
