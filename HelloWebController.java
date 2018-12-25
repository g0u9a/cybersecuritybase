package sec.helloweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HelloWebController {
    
    @RequestMapping("*")
    @ResponseBody
    public String home(){
        return "hello web world";
    }
    
    @RequestMapping("/path")
    @ResponseBody
    public String route(){
        return "Route";
    }
    @RequestMapping("/trail")
    @ResponseBody
    public String hacktheworld(){
            return "ok try to hack the world bro";}
    
    @RequestMapping("/greet")
    @ResponseBody
    public String greet(@RequestParam String user){
        return "HI "+user+" how are you ?";
    }
    
}

