package com.anyang.wru.domain.image.service;

import com.anyang.wru.domain.image.dto.mapper.ImageMapper;
import com.anyang.wru.domain.image.dto.request.ImageCreateRequest;
import com.anyang.wru.domain.image.entity.Image;
import com.anyang.wru.domain.image.repository.ImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ImageService {
    private final ImageRepository REPOSITORY;
    private final ImageMapper MAPPER;

    @Transactional
    public Image save(ImageCreateRequest imageCreateRequest) {
        return REPOSITORY.save(MAPPER.saveDataToEntity(imageCreateRequest));
    }

    @Transactional
    public List<Image> findALLImage() {
        return REPOSITORY.findAll();
    }
}
