package com.anyang.wru.domain.user.repository;

import com.anyang.wru.domain.user.entity.User;
import org.hibernate.cfg.JPAIndexHolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    //JpaRepository는 저장하는 방식으로 Spring Boot FrameWork에서 지원해주는 방식이다.

}
