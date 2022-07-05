package com.soeun.cafe.controller;

import com.soeun.cafe.config.SecurityService;
import com.soeun.cafe.model.CafeDto;
import com.soeun.cafe.service.CafeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("cafe")
public class CafeController {
    @Autowired
    CafeServiceImpl cafeService;

    @Autowired
    SecurityService securityService;

    
    // 가입한 카페, 아닌거 두 개 Map으로 묶어서 호출하기
//    @GetMapping("/my")
//    public List<CafeDto> findCafeById(@PathVariable CafeDto cafeDto){
//        return CafeService.findCafeById();
//    }

    @GetMapping("/my")
    public Map<String, Object> CafeById(){

        CafeDto cafeDto = new CafeDto();
        cafeDto.setId(Integer.valueOf(securityService.getIdAtToken()));

        Map<String, Object> map = new HashMap<>();
        map.put("registeredCafe", cafeService.findCafeById(cafeDto));
        map.put("unregisteredCafe", cafeService.findNotCafeById(cafeDto));
        return map;
    }

}
