package ru.lsz.pswgen.repository;

import org.springframework.stereotype.Repository;
import ru.lsz.pswgen.model.PswGenerator;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PswRepository {
    public List<String> getPSW() {
        List<String> result = new ArrayList<>();
        PswGenerator passwordGenerator = new PswGenerator.PswGeneratorBuilder()
                .useDigits(true)
                .useLower(true)
                .useUpper(true)
                .usePunctuation(true)
                .build();

        for (int i = 0; i < 10; i++) {
            result.add(passwordGenerator.generate(8));
        }

        return result;

    }
}
