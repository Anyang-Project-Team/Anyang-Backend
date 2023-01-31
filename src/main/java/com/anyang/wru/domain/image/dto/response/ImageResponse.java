package com.anyang.wru.domain.image.dto.response;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ImageResponse {
    //응답하다  -> DATa보여달래용 -> 그럼 -> 어떤 데이터요 ? ->2번데이터요 -> 응답해줄때는 항 상 아 이 디 가 있 어 야 해
    private Long id;
    private String originUrl;
    private String resultUrl;
}
