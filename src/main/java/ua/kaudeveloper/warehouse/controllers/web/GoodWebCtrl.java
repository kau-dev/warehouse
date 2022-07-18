package ua.kaudeveloper.warehouse.controllers.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.kaudeveloper.warehouse.models.good.Good;
import ua.kaudeveloper.warehouse.models.good.GoodDao;

import java.util.Optional;

@Controller
public class GoodWebCtrl {
    @Autowired
    private GoodDao goodDao;

    //TODO!!!!!!!
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

    @RequestMapping(value = {"/welcome", "/t_goods","/t_gooddata"}, method = RequestMethod.GET)
    public String listGood(Model model) {
    //    model.addAttribute("good", this.goodDao.findById(123l).get());

        int pageNo=0;
        int pageSize =1000;
        String sortBy="id";
        model.addAttribute("listGoods", this.goodDao.getAllGoods(pageNo,pageSize,sortBy));
        return "/t_goods.jsp";
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

    @RequestMapping("/t_gooddata/{id}")
    public String goodData(@PathVariable("id") Long id, Model model) {
        Optional<Good> getGood = this.goodDao.findById(id);
        if (getGood.isPresent()) {
            model.addAttribute("good", getGood.get());


            return "t_gooddata";
        }
        return "redirect:/gooddata";
    }


}
