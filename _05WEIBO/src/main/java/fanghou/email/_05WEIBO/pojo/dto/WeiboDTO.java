package fanghou.email._05WEIBO.pojo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

public class WeiboDTO {

    //一般用于对象。防止空指针异常
    //@NotNull(message = "Weibo cannot empty")
    //@NotEmpty
    //NotBlank最全面，一般使用NotBlank
    @NotBlank(message = "Weibo cannot empty")
    @Size(min = 2,max = 100, message = "max 100 word, min 2 word")
    @ApiModelProperty(value = "评论内容",required = true)
    String content;


    @Range(min = 18, max = 5000, message = "18-5000为合法年限")
    @ApiModelProperty(value = "Age", required = true)
    Integer age;
}
