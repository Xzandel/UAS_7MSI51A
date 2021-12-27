package com.BackEnd.UAS.BackendUasApplication;

import com.BackEnd.UAS.BackendUasApplication.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<User,String> {
}
