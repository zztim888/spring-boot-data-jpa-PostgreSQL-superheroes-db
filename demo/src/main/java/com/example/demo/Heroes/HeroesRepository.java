package com.example.demo.Heroes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroesRepository extends JpaRepository<Heroes, Long> {
}
