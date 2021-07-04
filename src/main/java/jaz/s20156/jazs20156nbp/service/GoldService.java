package jaz.s20156.jazs20156nbp.service;

import jaz.s20156.jazs20156nbp.model.Gold;
import jaz.s20156.jazs20156nbp.repository.GoldRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoldService {
    private final GoldRepository goldRepository;

    public GoldService(GoldRepository goldRepository) {
        this.goldRepository = goldRepository;
    }

    public List<Gold> getAll() {
        return goldRepository.findAll();
    }
}
