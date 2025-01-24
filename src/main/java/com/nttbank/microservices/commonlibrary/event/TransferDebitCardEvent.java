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
public class TransferDebitCardEvent extends
    GenericEvent<TransferDebitCardEvent> implements
    Serializable {

  @Serial
  private static final long serialVersionUID = -6682285991122501142L;

  private String transactionId;
  private String type;
  private String accountId;
  private String debitCardNumber;
  private BigDecimal amount;


}
