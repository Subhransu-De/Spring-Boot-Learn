package com.example.SpringBootLearn.Vacancy;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VacancyService {

  private final VacancyRepository vacancyRepository;

  @Autowired
  public VacancyService(VacancyRepository vacancyRepository) {
    this.vacancyRepository = vacancyRepository;
  }

  public List<Vacancy> getVacancies(){
    return vacancyRepository.findAll();
  }

  public Optional<Vacancy> getVacancy(String id) {
    return vacancyRepository.findById(id);
  }

}
