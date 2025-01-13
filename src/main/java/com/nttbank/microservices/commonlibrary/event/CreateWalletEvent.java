package com.nttbank.microservices.commonlibrary.event;

import java.io.Serial;
import java.io.Serializable;
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
public class CreateWalletEvent extends GenericEvent<CreateWalletEvent> implements Serializable {

  @Serial
  private static final long serialVersionUID = 1456907208735171420L;

  private String accountId;
  private String documentId;
  private String email;
  private String imei;
  private String phoneNumber;
  private String status;

}
