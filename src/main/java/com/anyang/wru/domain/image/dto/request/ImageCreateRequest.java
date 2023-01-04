package com.anyang.wru.domain.image.dto.request;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ImageCreateRequest {

    private String originUrl;
    private String resultUrl;

}
