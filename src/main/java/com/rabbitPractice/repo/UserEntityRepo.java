package com.rabbitPractice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rabbitPractice.entity.UserEntity;

@Repository
public interface UserEntityRepo extends JpaRepository<UserEntity, Long>{

}
