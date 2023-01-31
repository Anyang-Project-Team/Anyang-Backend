package com.anyang.wru.domain.image.dto.response;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ImageResponse {

    private Long id;
    private String originUrl;
    private String resultUrl;
}
