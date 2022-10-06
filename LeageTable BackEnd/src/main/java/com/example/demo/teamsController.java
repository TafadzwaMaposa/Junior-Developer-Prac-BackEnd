package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class teamsController {
    @Autowired
    private teamservices service;
    //to call the teams table web page
    @GetMapping("/")
    public String viewHomePage (Model model) {
        List<teams> teamslist = service.listAll();
        model.addAttribute("teamslist", teamslist);
        return "index";
    }

    //edit team results returning the view controller
    @RequestMapping("/edit/{id}")
    public ModelAndView showedit(@PathVariable(name= "id")int id) {
        ModelAndView mav =new ModelAndView("edit");
        teams team = service.get(id);
        mav.addObject("teams",team);

        return mav;
    }

    // adding new team results to the log
    @GetMapping("/new")
    public String addTeam(Model model) {
        model.addAttribute("team", new teams());
        return "addTeams";
    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveTeam(@ModelAttribute("team") teams std) {
        service.saveTeam(std);
        System.out.print("Get / "+std);
        return "redirect:/";
    }

    @RequestMapping("/delete/{id}")
    public String deleteTeam(@PathVariable(name = "id") int id) {
        service.delete(id);
        return "redirect:/";

    }
//END POINT UNIT TESTING
    @GetMapping("/test")
    public ResponseEntity<String> testGetEndpoints() {
        return ResponseEntity.ok("all GET Endpoints working");

    }



    @Service
    class teamservices{
        @Autowired
        private teamsRepo repo;
        public List<teams>listAll(){
            return repo.findAll();

        }
        public void saveTeam(teams std) {
            if(!repo.findAll().equals(std)){
                System.out.println("Team exists not");
                repo.save(std);
            }else {
                System.out.println("exists ");
            }

        }
        public teams get(long id) {

            return repo.findById(id).get();
        }
        public void checkTeam(long id,teams std) {
            if(!repo.findAll().equals(std)){
                {
                }

            }
            //return repo.findById(id).get();
        }



        public void delete(long id) {
            repo.deleteById(id);
        }

    }
}
