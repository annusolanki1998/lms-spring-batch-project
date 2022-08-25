package com.bridgelabz.lmsspringbatchproject.config;


import com.bridgelabz.lmsspringbatchproject.entity.Candidates;
import org.springframework.batch.item.ItemProcessor;

public class CandidateProcessor implements ItemProcessor<Candidates, Candidates> {

    @Override
    public Candidates process(Candidates candidates) throws Exception {
        if (candidates.getCandidateStatus().equals("Progressed")) {
            return candidates;
        } else {
            return null;
        }
    }
}
