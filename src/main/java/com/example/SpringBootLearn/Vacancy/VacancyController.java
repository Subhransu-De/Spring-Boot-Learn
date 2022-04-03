package com.example.SpringBootLearn.Vacancy;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/vacancy")
public class VacancyController {

  private final VacancyService vacancyService;

  @Autowired
  public VacancyController(VacancyService vacancyService) {
    this.vacancyService = vacancyService;
  }

  @GetMapping
  public List<Vacancy> getVacancy(){
    return vacancyService.getVacancy();
  }

}
