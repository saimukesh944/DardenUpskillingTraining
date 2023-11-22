package com.example.SpringAss03.service;

import com.example.SpringAss03.entity.DetailsInfo;
import com.example.SpringAss03.repo.DetailsInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailsservicesImpl implements DetailsService {

    @Autowired
    DetailsInfoRepo detailsInfoRepo;


    @Override
    public String add(DetailsInfo detailsInfo) {
        detailsInfoRepo.save(detailsInfo);
        return "Added Sucessfully";
    }
}
