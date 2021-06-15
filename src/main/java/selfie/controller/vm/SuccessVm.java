package selfie.controller.vm;

import lombok.*;

@Getter
@Setter(AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@AllArgsConstructor
@ToString(exclude = {"data"})
@Builder
public class SuccessVm {
    boolean success;
    Object data;
    String token;
    String msg;
}
