package com.bsuir.data.repository;

import com.bsuir.data.domain.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("stateRepository")
public interface StateRepository extends JpaRepository<State, Long> {
}
