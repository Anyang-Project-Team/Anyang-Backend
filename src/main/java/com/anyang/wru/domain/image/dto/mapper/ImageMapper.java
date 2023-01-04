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
                .originUrl(imageCreateRequest.getOriginUrl())
                .resultUrl(imageCreateRequest.getResultUrl())
                .build();
    }

    public ImageResponse getDataFromEntity(Image image) {
        return ImageResponse.builder()
                .id(image.getId())
                .originUrl(image.getOriginUrl())
                .resultUrl(image.getResultUrl())
                .build();
    }

}
