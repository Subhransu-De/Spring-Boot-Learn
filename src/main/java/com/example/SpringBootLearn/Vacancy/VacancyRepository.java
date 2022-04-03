package com.example.SpringBootLearn.Vacancy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VacancyRepository
    extends JpaRepository<Vacancy, String> {
}
