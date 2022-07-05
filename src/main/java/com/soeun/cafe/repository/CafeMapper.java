package com.soeun.cafe.repository;

import com.soeun.cafe.model.CafeDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CafeMapper {
    List<CafeDto> findCafeById(CafeDto cafeDto);
    List<CafeDto> findNotCafeById(CafeDto cafeDto);
}
