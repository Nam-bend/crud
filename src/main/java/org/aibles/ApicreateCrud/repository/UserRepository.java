package org.aibles.ApicreateCrud.repository;

import org.aibles.ApicreateCrud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<User ,String>{

}
