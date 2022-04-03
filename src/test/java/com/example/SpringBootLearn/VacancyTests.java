package com.example.SpringBootLearn;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.example.SpringBootLearn.Vacancy.VacancyService;
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
  void shouldReturnListonAllVacancies() throws Exception {

    this.mockMvc.perform(get("/api/v1/vacancy"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$", hasSize(vacancyService.getVacancy().size())))
    ;
  }

}