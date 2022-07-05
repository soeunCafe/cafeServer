package com.soeun.cafe.service;

import com.soeun.cafe.model.CafeDto;
import com.soeun.cafe.repository.CafeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CafeServiceImpl {
    @Autowired
    CafeMapper cafeMapper;

    public List<CafeDto> findCafeById(CafeDto cafeDto){return cafeMapper.findCafeById(cafeDto);}

    public List<CafeDto> findNotCafeById(CafeDto cafeDto){return cafeMapper.findNotCafeById(cafeDto);}
}
