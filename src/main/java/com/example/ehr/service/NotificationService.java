package com.example.ehr.service;

import com.example.ehr.models.notifications;
import com.example.ehr.repository.NotificationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class NotificationService {
    @Autowired
    private NotificationsRepository notiRepository;

    public notifications save(notifications nt) {
        return notiRepository.save(nt);
    }


    public List<notifications> findBySellerId(int id) {
        return notiRepository.findByUserid(id);
    }


}
