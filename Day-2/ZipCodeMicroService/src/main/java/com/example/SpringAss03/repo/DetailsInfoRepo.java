package com.example.SpringAss03.repo;

import com.example.SpringAss03.entity.DetailsInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailsInfoRepo  extends JpaRepository<DetailsInfo,Integer> {
    DetailsInfo findByZipcode(int zipcode);
}
