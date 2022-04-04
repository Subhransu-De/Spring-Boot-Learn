package com.example.SpringBootLearn.Vacancy;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/vacancies")
public class VacancyController {

  private final VacancyService vacancyService;

  @Autowired
  public VacancyController(VacancyService vacancyService) {
    this.vacancyService = vacancyService;
  }

  @GetMapping()
  public List<Vacancy> getVacancies(){
    return vacancyService.getVacancies();
  }

  @GetMapping(value="/{id}")
  public ResponseEntity<Vacancy> getVacancy(@PathVariable("id") String id) {
    Optional<Vacancy> vacancy = vacancyService.getVacancy(id);
    if (vacancy.isPresent()) {
      return new ResponseEntity<>(vacancy.get(), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

}
