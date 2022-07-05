package com.soeun.cafe.service;

import com.soeun.cafe.model.CafeDto;

import java.util.List;

public interface CafeService {
    List<CafeDto> findCafeById(CafeDto cafeDto);
    List<CafeDto> findNotCafeById(CafeDto cafeDto);

}
