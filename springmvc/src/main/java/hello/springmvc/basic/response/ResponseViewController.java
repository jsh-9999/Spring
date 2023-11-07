package hello.springmvc.basic.response;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResponseViewController {
    @RequestMapping("/response-view-v1")
    public ModelAndView responseViewV1(){
        ModelAndView mav = new ModelAndView("response/hello")
                .addObject("data", "hello!");
        return mav;
    }
    @RequestMapping("/response-view-v2")
    public String responseViewV2(Model model){
        model.addAttribute("data", "hello!");
        return "response/hello"; // @Controller 면서 반환값이 String이면 "response/hello"가 view의 논리적인 이름이 된다.
    }


    @RequestMapping("/response/hello")   // /response/hello가 논리적인 view의 이름이 된다.
    public void responseViewV3(Model model){
        model.addAttribute("data", "hello!");

    }
}
