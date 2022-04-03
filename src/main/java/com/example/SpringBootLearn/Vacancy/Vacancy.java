package com.example.SpringBootLearn.Vacancy;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vacancy {

  @Id
  private String vacancy_id;
  private String vacancy_title;
  private String vacancy_description;
  private String vacancy_type;

  public Vacancy() {
  }

  public Vacancy(String vacancy_id,
      String vacancy_title,
      String vacancy_description,
      String vacancy_type) {
    this.vacancy_id = vacancy_id;
    this.vacancy_title = vacancy_title;
    this.vacancy_description = vacancy_description;
    this.vacancy_type = vacancy_type;
  }

  public String getVacancy_id() {
    return vacancy_id;
  }

  public void setVacancy_id(String vacancy_id) {
    this.vacancy_id = vacancy_id;
  }

  public String getVacancy_title() {
    return vacancy_title;
  }

  public void setVacancy_title(String vacancy_title) {
    this.vacancy_title = vacancy_title;
  }

  public String getVacancy_description() {
    return vacancy_description;
  }

  public void setVacancy_description(String vacancy_description) {
    this.vacancy_description = vacancy_description;
  }

  public String getVacancy_type() {
    return vacancy_type;
  }

  public void setVacancy_type(String vacancy_type) {
    this.vacancy_type = vacancy_type;
  }

  @Override
  public String toString() {
    return "Vacancy{" +
        "vacancy_id='" + vacancy_id + '\'' +
        ", vacancy_title='" + vacancy_title + '\'' +
        ", vacancy_description='" + vacancy_description + '\'' +
        ", vacancy_type='" + vacancy_type + '\'' +
        '}';
  }
}
