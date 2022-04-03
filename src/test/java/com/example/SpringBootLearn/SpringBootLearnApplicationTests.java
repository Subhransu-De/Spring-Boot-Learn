package com.example.SpringBootLearn;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.SpringBootLearn.Vacancy.VacancyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootLearnApplicationTests {

	@Autowired
	private VacancyController vacancyController;

	@Test
	void contextLoads() {
		assertThat(vacancyController).isNotNull();
	}

}
