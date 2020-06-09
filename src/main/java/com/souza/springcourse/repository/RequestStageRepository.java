package com.souza.springcourse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.souza.springcourse.domain.RequestStage;

@Repository
public interface RequestStageRepository extends JpaRepository<RequestStage, Long>{

}
