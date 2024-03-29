package com.example.ehr.repository;

import com.example.ehr.models.negotiations;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//Negotiations repository
public interface NegotiationsRepository extends JpaRepository<negotiations, Integer>{

    public List<negotiations> findBySellerid(int seller_id);

    public List<negotiations> findByReceiverid(int seller_id);

}
