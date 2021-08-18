package ru.lsz.pswgen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.lsz.pswgen.repository.PswRepository;

import java.util.List;

@Service
public class PswService {
    @Autowired
    PswRepository pswRepository;
    public List<String> getPSW() {
        return pswRepository.getPSW();
    }
}
