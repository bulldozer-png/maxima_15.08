package ru.maxima.controllers;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ru.maxima.dao.PersonDao;
import ru.maxima.model.Person;

import java.util.List;

@Controller
@RequestMapping("/people")
public class PeopleController {

    private final PersonDao personDao;

    public PeopleController(PersonDao personDao) {
        this.personDao = personDao;
    }

    @GetMapping()
    public String getAllPeople(Model model){

        List<Person> allPeople = personDao.getAllPeople();
        model.addAttribute("keyAllPeople", allPeople);

        return "people";
    }

    @GetMapping("/{id}")
    public String getPersonById(@PathVariable("id") Long id, Model model){

        Person personById = personDao.getPersonById(id);
        model.addAttribute("keyPersonById", personById);

        return "people-by-id";
    }

    @GetMapping("/create")
    public String givePageToCreatePerson(Model model){

        model.addAttribute("keyNewPerson", new Person());
        return "create-person";
    }

    @PostMapping()
    public String createPerson(@ModelAttribute("keyNewPerson") @Valid Person person, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "create-person";
        }

        personDao.save(person);

        return "redirect:/people";
    }

    @GetMapping("/edit/{id}")
    public String giveToUserPageToEditPerson(@PathVariable("id") Long id, Model model){
        Person personToBeEdited = personDao.getPersonById(id);
        model.addAttribute("keyPersonToBeEdited", personToBeEdited);

        return "view-to-edit-person";
    }

    @PostMapping ("/edit/{id}")
    public String editPerson(@PathVariable("id") Long id,
                             @ModelAttribute("keyNewPerson") @Valid Person personFromForm,
                             BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "view-to-edit-person";
        }

        personDao.update(personFromForm, id);
        return "redirect:/people";
    }

    @PostMapping("/delete/{id}")
    public String deletePerson(@PathVariable("id") Long id){
        personDao.delete(id);
        return "redirect:/people";
    }

}

