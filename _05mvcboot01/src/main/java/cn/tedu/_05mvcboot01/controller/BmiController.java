package cn.tedu._05mvcboot01.controller;

import cn.tedu._05mvcboot01.pojo.dto.BmiDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BmiController {
    @RequestMapping(value = "bmi")
    @ResponseBody
    public String bmi(BmiDTO bmiDTO){
        Double weight = bmiDTO.getWeight();
        Double high = bmiDTO.getHigh();
        double bmi = weight/(high*high);
        if (bmi >=27){
            return "减肥";
        }else if (bmi <27 && bmi >= 24){
            return"胖了点";
        }else if (bmi<24 && bmi >18.5){
            return "正常";
        }else if (bmi<18.5){
            return "瘦了点";
        }
        return ""+ bmi;
    }
}
