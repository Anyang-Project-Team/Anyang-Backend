package com.anyang.wru.domain.image.entity;

import ch.qos.logback.core.joran.action.TimestampAction;
import com.anyang.wru.global.common.Timestamped;
import lombok.*;

import javax.persistence.*;

@Builder
@Getter //받아오는 친구인데 Parameter이친구를 설정하면서 받아온다  // -> Email -> 받아와야하지 -> Table
@Setter // 설정한다                  -> 그 받온값을 -> Email 친구 -> 보내주는거지
@Entity // 엔티티라고 명시한다.        -> Entity ->
@NoArgsConstructor //생성자를 자동으로 만들어주는 친구이고 //->
@AllArgsConstructor // 생성자에게 Parameter값을 주어지는 친구
@Table(name = "users")
public class Users extends Timestamped {

    @Id // -> PK Primary Key -> 기본키 -> ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //-> 간단하게 -> 아이디 값을 자동으로 생성해준다.
    private Long id; // -> 위에 GeneratedValue라는 친구가 자동으로 아이디를 만들어줘
    @Column(name = "email") // 이 친구는 User한테 받아와야하는 값이야
    private String email;

// -> speed2394@gmail.com -> 1아디를 자동으로 만들어서 ->
    //Id -> 1
    // email: speed2394@gmail.com

    //2번째 유저가 또 이메일을 입력해
    //<입력을 이렇게 > -> rhaehfdl2394@gmail.com -> 이 사이트에 보내
    // -> Entity- > email값 들어왔다. 아까전에 1번 Id 만들었잖아 -> 그럼 이번에는 2번으로 만들자
    // -> id -> 2
    // email -> rhaehfdl2394@gmail.com
}
