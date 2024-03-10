package fanghou.email._05WEIBO.pojo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CommentDTO {
    @ApiModelProperty(value = "评论内容",required = true,example = "good day")
    String content;
    @ApiModelProperty(value = "微博id", required = true)
    Long weiboId;


}
