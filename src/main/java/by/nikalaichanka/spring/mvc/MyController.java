package by.nikalaichanka.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;


@Controller
//@RequestMapping("/employee")
public class MyController {


    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    // 1st: simple without Spring MVC form
//    @RequestMapping("/askDetails")
//    public String askEmployeeDetails(){
//        return "ask-emp-details-view";
//    }

    // 2nd: with Spring MVC form
    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model){

        //Employee emp = new Employee("Ivan", "Ivanov", 500, "HR");

        model.addAttribute("employee", new Employee());
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
//    @RequestMapping("/showDetails")
//    public String showEmployeeDetails(@RequestParam ("empName") String empName, Model model){
//
//        empName = "Mr. " + empName;
//
//        model.addAttribute("nameAttrbt", empName);
//        model.addAttribute("dscrptn", " - Sr. Developer");
//
//        return "show-emp-details-view";
//    }

    // 4th: with Spring MVC form
    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@Valid @ModelAttribute("employee") Employee emp, BindingResult bindingResult){
//        emp.setName("Fedor");
//        emp.setSurname("Svistunov");
//        emp.setSalary(100);
//        emp.setDepartment("123");

        if (bindingResult.hasErrors()){
            return "ask-emp-details-view";
        } else {
            return "show-emp-details-view";
        }
    }

}
