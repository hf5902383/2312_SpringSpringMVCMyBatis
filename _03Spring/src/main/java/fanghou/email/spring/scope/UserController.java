package fanghou.email.spring.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * Scope： 作用域注解
 * singlethon 单实例
 * prototype:多实例
 */
@Scope("singleton")
@Controller
public class UserController {


}
