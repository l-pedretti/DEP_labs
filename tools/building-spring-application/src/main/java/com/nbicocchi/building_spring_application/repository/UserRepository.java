package com.nbicocchi.building_spring_application.repository;

import com.nbicocchi.building_spring_application.model.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Long> {

}
