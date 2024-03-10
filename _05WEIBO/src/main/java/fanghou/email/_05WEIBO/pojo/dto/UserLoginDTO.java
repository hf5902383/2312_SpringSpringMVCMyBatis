package fanghou.email._05WEIBO.pojo.dto;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserLoginDTO {
    @ApiModelProperty(value = "用户名",required = true,example = "不可以有特殊符号")
     String username;
    @ApiModelProperty(value = "密码",required = true,example = "cannot empty")
     String password;


}
