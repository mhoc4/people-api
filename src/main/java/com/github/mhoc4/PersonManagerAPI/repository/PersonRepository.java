package com.github.mhoc4.PersonManagerAPI.repository;

import com.github.mhoc4.PersonManagerAPI.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
