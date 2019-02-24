package cn.notemi.eureka.register.instance;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title：ProviderController
 * Description：
 *
 * @author Flicker
 * @create 2019/2/22 4:29 PM
 **/
@RestController
@RequestMapping("/provider")
public class ProviderController {

    @RequestMapping("/index")
    public String index() {
        return "this is eureka service provider";
    }
}
