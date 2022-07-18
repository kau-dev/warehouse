package ua.kaudeveloper.warehouse.controllers.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.kaudeveloper.warehouse.models.counterparty.CounterpartyDao;

@Controller
public class CounterpartyWebCtrl {
    @Autowired
    private CounterpartyDao counterpartyDao;
    @Autowired(required = true)
    @Qualifier(value = "counterpartyDao")
    public void setcounterpartyDao(CounterpartyDao counterpartyDao) {
        this.counterpartyDao = counterpartyDao;
    }
    @RequestMapping(value = {"/counterparty.jsp/{id}"}, method = RequestMethod.GET)
    public String getConterpartyById(@PathVariable("id") Long id,Model model) {
        model.addAttribute("counterparty", counterpartyDao.findById(id).get());
//        model.addAttribute("listGoods", this.goodDao.getAllGoods());
        return "counterparty";
    }
}
