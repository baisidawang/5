package org.example.springvue1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.example.springvue1.entity.Com;


public interface ComRepository extends JpaRepository<Com,Integer> {

}