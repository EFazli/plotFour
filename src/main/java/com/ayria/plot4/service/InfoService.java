package com.ayria.plot4.service;

import com.ayria.plot4.model.InfoDao;
import com.ayria.plot4.repository.InfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class InfoService {
    @Autowired
    private InfoRepo infoRepo;

    public List<InfoDao> findAll() {
        List<InfoDao> infos = (List<InfoDao>) infoRepo.findAll();
        return infos;
    }

    public void removeAll() {
        infoRepo.deleteAll();
        return;
    }
}
