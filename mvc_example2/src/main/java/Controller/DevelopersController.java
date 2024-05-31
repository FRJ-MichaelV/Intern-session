package Controller;

import Entity.Developer;
import Repository.DeveloperRepository;
import Repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class DevelopersController {
    @Autowired
    DeveloperRepository repository;

    @Autowired
    SkillRepository skillRepository;

    @RequestMapping("/developer/{id}")
    public String developer(Long id, Model model){
        model.addAttribute("developer", repository.findById(id));
        model.addAttribute("skills", skillRepository.findAll());
        return "developer";
    }

    @RequestMapping(value = "/developers", method = RequestMethod.GET)
    public String developerList(Model model){
        model.addAttribute("developers", repository.findAll());
        return "developers";
    }

    @RequestMapping(value = "/developers", method = RequestMethod.POST)
    public String developersAdd(@RequestParam String email, @RequestParam String firstName, @RequestParam String lastName, Model model){
        Developer newDeveloper = new Developer();
        newDeveloper.setEmail(email);
        newDeveloper.setFirstName(firstName);
        newDeveloper.setLastName(lastName);
        repository.save(newDeveloper);

        model.addAttribute("developer", newDeveloper);
        model.addAttribute("skill", skillRepository.findAll());
        return "redirect:/developer/" + newDeveloper.getId();
    }
}
