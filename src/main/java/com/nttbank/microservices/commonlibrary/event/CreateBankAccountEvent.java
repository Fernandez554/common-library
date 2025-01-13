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
public class CreateBankAccountEvent extends GenericEvent<CreateBankAccountEvent> implements Serializable {

  @Serial
  private static final long serialVersionUID = 129348931L;

  private String username;
  private String email;
  private String imei;
  private String phoneNumber;


}
