package app.controller;

import app.model.User;
import app.service.UserServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    private UserServise userServise;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public ModelAndView homePage() {
        ModelAndView vm = new ModelAndView();
        vm.setViewName("home");
        return vm;
    }

    @RequestMapping(path = "/addUser", method = RequestMethod.GET)
    public ModelAndView addPageGet() {
        ModelAndView vm = new ModelAndView();
        vm.setViewName("addUser");
        vm.addObject("user", new User());
        return vm;
    }

    @RequestMapping(path = "/addUser", method = RequestMethod.POST)
    public ModelAndView addPagePost(@ModelAttribute("user")User user) {
        ModelAndView vm = new ModelAndView();
        System.out.println(user + "next");
        User user1 = userServise.addUser(user);
        System.out.println(user1);
        vm.addObject("user1", userServise.getByName(user1));
        vm.setViewName("welcome");
        return vm;
    }

    @RequestMapping(path = "/welcome", method = RequestMethod.GET)
    public ModelAndView welcomePage() {
        ModelAndView vm = new ModelAndView();
        vm.setViewName("welcome");
        return vm;
    }

    @RequestMapping(path = "/allUsers", method = RequestMethod.GET)
    public ModelAndView allUsersPage() {
        ModelAndView vm = new ModelAndView();
        vm.addObject("list", userServise.getAllUsers());
        vm.setViewName("allUsers");
        return vm;
    }

    @RequestMapping(path = "/userUsers", method = RequestMethod.GET)
    public ModelAndView userPage(@RequestParam(name = "c_name")String name) {
        ModelAndView vm = new ModelAndView();
        vm.addObject("user", userServise.getByName(name));
        vm.setViewName("user");
        return vm;
    }


}
