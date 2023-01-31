package com.anyang.wru.domain.image.repository;


import com.anyang.wru.domain.image.dto.mapper.UserDTO;
import com.anyang.wru.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Long, User> {
    //이게 끝이야 -> Spring Boot 자체에 지원해주는 기능이야
    // -> Long User -> Long 그 값이 -> 데이터 타입
    // -> User -> Id 값을 받아온다 ->
    //3번값을 JpaRepository -> name Email 자동으로 저장을 해줘 -> Repositroy 이거만 써도됨ㅋㅋㅋㅋ
}

