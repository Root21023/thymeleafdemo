package com.qf.service.impl;

import com.qf.dao.FruitInfoMapper;
import com.qf.dto.FruitInfoDTO;
import com.qf.service.FruitInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitInfoServiceImpl implements FruitInfoService {
    @Autowired
    FruitInfoMapper fruitInfoMapper;
    public List<FruitInfoDTO> listAllFruit() {
        return fruitInfoMapper.listAllFruit();
    }
}
