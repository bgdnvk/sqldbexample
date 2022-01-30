package com.example.sqldbexample.repository;

import com.example.sqldbexample.entity.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//repository to interact with the entity
//we use the JpaRepository because of all its methods
@Repository
public interface UserDataRepository extends JpaRepository<UserData, Long> {
}
