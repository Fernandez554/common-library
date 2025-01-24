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
@EqualsAndHashCode(callSuper = false)
public class DebitCardTransactionEvent extends
    GenericEvent<DebitCardTransactionEvent> implements
    Serializable {
  @Serial
  private static final long serialVersionUID = 3988242549826971270L;

  private String transId;
  private String type;
  private String accountId;
  private String debitCardNumber;
  private BigDecimal amount;
  private BigDecimal balanceUpdated;
  //Update the transaction
  private String status;
  private String description;


}
