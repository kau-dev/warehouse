package ua.kaudeveloper.warehouse.controllers.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.kaudeveloper.warehouse.models.good.Good;
import ua.kaudeveloper.warehouse.models.good.GoodDao;

import java.util.Optional;

@Controller
public class GoodWebCtrl {
    @Autowired
    private GoodDao goodDao;

    @Autowired(required = true)
    @Qualifier(value = "goodDao")
    public void setgoodDao(GoodDao goodDao) {
        this.goodDao = goodDao;
    }

//    @RequestMapping(value = "/goods/add", method = RequestMethod.POST)
//    public String addGood(@ModelAttribute("good") Good good){
//        this.goodDao.save(good);
//
//        return "redirect:/books";
//    }

    // @RequestMapping(value = "/welcome", method = RequestMethod.GET)

    @RequestMapping(value = {"/welcome", "/goods"}, method = RequestMethod.GET)
    public String listGood(Model model) {
        model.addAttribute("good", new Good());
        model.addAttribute("listGoods", this.goodDao.getAllGoods());
        return "goods";
    }

    //    @GetMapping({"/", "/welcome"})
//    public String welcome(Model model) {
//        model.addAttribute("listGoods");
//        return "welcome";
//    }
    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String rootpage() {
        return "redirect:/index.jsp";
    }

    @RequestMapping("/gooddata/{id}")
    public String goodData(@PathVariable("id") Integer id, Model model) {
        Optional<Good> getGood = this.goodDao.findById(id);
        if (getGood.isPresent()) {
            model.addAttribute("good", getGood.get());


            return "gooddata";
        }
        return "redirect:/goods";
    }
}
