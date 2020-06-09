package com.souza.springcourse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.souza.springcourse.domain.Request;

@Repository
public interface RequestRepository extends JpaRepository<Request, Long>{

}
