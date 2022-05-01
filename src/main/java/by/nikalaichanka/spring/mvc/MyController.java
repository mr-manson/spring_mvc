package by.nikalaichanka.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
//@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(){
        return "ask-emp-details-view";
    }

    // 1st: simple
//    @RequestMapping("/showDetails")
//    public String showEmployeeDetails(){
//        return "show-emp-details-view";
//    }

    // 2nd: with Request & Model
//    @RequestMapping("/showDetails")
//    public String showEmployeeDetails(HttpServletRequest request, Model model){
//
//        String empName = request.getParameter("empName");
//        empName = "Mr. " + empName;
//
//        model.addAttribute("nameAttrbt", empName);
//        model.addAttribute("dscrptn", " - Sr. Developer");
//
//        return "show-emp-details-view";
//    }

    // 3rd: with Annotation & Model
    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@RequestParam ("empName") String empName, Model model){

        empName = "Mr. " + empName;

        model.addAttribute("nameAttrbt", empName);
        model.addAttribute("dscrptn", " - Sr. Developer");

        return "show-emp-details-view";
    }
}
