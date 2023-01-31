package com.anyang.wru.domain.image.controller;


import com.anyang.wru.domain.image.dto.mapper.ImageMapper;
import com.anyang.wru.domain.image.dto.request.ImageCreateRequest;
import com.anyang.wru.domain.image.dto.response.ImageResponse;
import com.anyang.wru.domain.image.entity.Image;
import com.anyang.wru.domain.image.service.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/Image")
public class ImageController {

    private final ImageService IMAGE_SERVICE;
    private final ImageMapper IMAGE_MAPPER;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ImageResponse createImage(@RequestBody ImageCreateRequest imageCreateRequest) {
        Image insertImageResult = IMAGE_SERVICE.save(imageCreateRequest);
        return IMAGE_MAPPER.getDataFromEntity(insertImageResult);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Image> readAllImage() {
        return IMAGE_SERVICE.findALLImage();

    }


}
