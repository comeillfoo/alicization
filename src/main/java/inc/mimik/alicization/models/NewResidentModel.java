package inc.mimik.alicization.models;

import lombok.Getter;
import lombok.Setter;

public class NewResidentModel {
  @Getter
  @Setter
  private String name;

  @Getter
  @Setter
  private String fkSuitName;

  @Getter
  @Setter
  private String fkSexName;

  @Getter
  @Setter
  private String fkRoleName;
}
