package com.anyang.wru.domain.image.entity;

import com.anyang.wru.global.common.Timestamped;
import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Image")
public class Image extends Timestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //MySQL -> 자동 생성해주는 친구
    @Column(columnDefinition = "INT UNSIGEND")
    private Long id;
    @Column(name = "origin_url")
    private String originUrl;
    @Column(name = "result_url")
    private String resultUrl;

    @Builder
    public Image(String originUrl, String resultUrl) {
        this.originUrl = originUrl;
        this.resultUrl = resultUrl;
    }
}
