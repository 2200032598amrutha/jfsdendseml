package controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {

    // Display Product Form
    @RequestMapping("/productform")
    public String productForm() {
        return "productform";
    }

    // Reverse Two Strings
    @RequestMapping("/reverse")
    public String reverseStrings(@RequestParam("str1") String str1,
                                  @RequestParam("str2") String str2,
                                  Model model) {
        String reversed1 = new StringBuilder(str1).reverse().toString();
        String reversed2 = new StringBuilder(str2).reverse().toString();
        model.addAttribute("reversed1", reversed1);
        model.addAttribute("reversed2", reversed2);
        return "reverse";
    }

    // Add Two Numbers
    @RequestMapping("/add")
    public String addNumbers(@RequestParam("num1") int num1,
                              @RequestParam("num2") int num2,
                              Model model) {
        int sum = num1 + num2;
        model.addAttribute("sum", sum);
        return "addition";
    }
}
