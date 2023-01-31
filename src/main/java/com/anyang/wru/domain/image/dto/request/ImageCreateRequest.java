package com.anyang.wru.domain.image.dto.request;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ImageCreateRequest {
    //내가 만든거를 요청을하는데 ->  URL 만들었어 -> ID는 자동생성 -> ID -> OrginURL ResultURL ->
    private String originUrl;
    private String resultUrl;

}
