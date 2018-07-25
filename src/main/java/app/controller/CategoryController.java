package app.controller;

import app.model.Category;
import app.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping(path = "addCategory", method = RequestMethod.GET)
    public ModelAndView addCategoryGet() {
        ModelAndView vm = new ModelAndView();
        vm.addObject("category", new Category());
        vm.setViewName("addCategory");
        return vm;
    }

    @RequestMapping(path = "/addCategory", method = RequestMethod.POST)
    public ModelAndView addCategoryPost(@ModelAttribute("category") Category category) {
        ModelAndView vm = new ModelAndView();
        categoryService.addCategory(category);
        return vm;
    }

    @RequestMapping(path = "/allCategories", method = RequestMethod.GET)
    public ModelAndView allCategories() {
        ModelAndView vm = new ModelAndView();
        vm.setViewName("allCategories");
        vm.addObject("categoriesList", categoryService.getAllCategories());
        return vm;
    }

    @RequestMapping(path="/category", method = RequestMethod.GET)
    public ModelAndView categoryPage(@RequestParam(name = "c_id")Long id) {
        ModelAndView vm = new ModelAndView();
        vm.setViewName("category");
        vm.addObject("productList", categoryService.getCategoryById(id).getProductList());
        return vm;
    }
}
