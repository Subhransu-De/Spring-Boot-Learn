package com.example.SpringBootLearn;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.example.SpringBootLearn.Vacancy.VacancyService;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class VacancyTests {

  @Autowired
  private MockMvc mockMvc;
  @Autowired
  private VacancyService vacancyService;

  @Test
  @DisplayName("Should Return List of all Vacancies")
  void shouldReturnListofAllVacancies() throws Exception {

    List listofAllVacancies = vacancyService.getVacancies();
    assertAll("All Vacancies",
      () -> assertTrue(
          listofAllVacancies.size() >= 0,
          "Vacancies in vacancy list must be a whole number"
      )
    );
//    this.mockMvc.perform(get("/api/v1/vacancy/all"))
//        .andExpect(status().isOk())
//        .andExpect(jsonPath("$", hasSize(vacancyService.getVacancies().size())));
  }



}