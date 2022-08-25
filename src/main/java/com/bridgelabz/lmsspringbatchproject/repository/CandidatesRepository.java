package com.bridgelabz.lmsspringbatchproject.repository;

import com.bridgelabz.lmsspringbatchproject.entity.Candidates;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatesRepository extends JpaRepository<Candidates, Long> {
}
