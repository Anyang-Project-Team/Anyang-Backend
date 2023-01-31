package com.anyang.wru.domain.image.dto.mapper;

import com.anyang.wru.domain.image.dto.request.ImageCreateRequest;
import com.anyang.wru.domain.image.dto.response.ImageResponse;
import com.anyang.wru.domain.image.entity.Image;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ImageMapper {

    public Image saveDataToEntity(ImageCreateRequest imageCreateRequest) {
        return Image.builder()
                // 어쩌피 자동 생성이야
                .originUrl(imageCreateRequest.getOriginUrl())
                .resultUrl(imageCreateRequest.getResultUrl())
                .build();
    }

    public ImageResponse getDataFromEntity(Image image) {
        return ImageResponse.builder()
                //-> 내가 데이터를 받아와야하는데 -> 아이디를 알아야 정보를 가져오겠지 -> 데이터를 받아올때 아이디를 알아야해
                .id(image.getId())
                .originUrl(image.getOriginUrl())
                .resultUrl(image.getResultUrl())
                .build();
    }

}
