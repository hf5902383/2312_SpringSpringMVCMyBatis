package fanghou.email._05WEIBO.pojo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserRegDTO {
    @ApiModelProperty(value = "用户名",required = true, example = "cannot empty")
     String username;
    @ApiModelProperty(value = "密码",required = true, example = "必须带有大写以及符号")
     String password;
    @ApiModelProperty(value = "昵称",required = false, example = "Suggestion")
     String nickname;


}
