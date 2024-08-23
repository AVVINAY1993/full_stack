package com.user.userformdetails.repository;

import com.user.userformdetails.entity.UserPojo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserPojo,Long> {

}
