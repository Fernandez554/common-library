package com.nttbank.microservices.commonlibrary.event;

import java.io.Serial;
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
@EqualsAndHashCode(callSuper=false)
public class WalletTransferEvent extends GenericEvent<WalletTransferEvent> implements Serializable {

  @Serial
  private static final long serialVersionUID = 4329348931L;

  private String senderAccountId;
  private String receiverAccountId;
  private BigDecimal amount;
}
