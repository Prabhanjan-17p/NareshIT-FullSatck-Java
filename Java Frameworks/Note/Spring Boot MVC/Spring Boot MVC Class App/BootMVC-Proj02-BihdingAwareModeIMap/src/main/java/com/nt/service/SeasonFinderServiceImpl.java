package com.nt.service;

import java.time.LocalDate;
import org.springframework.stereotype.Component;

@Component
public class SeasonFinderServiceImpl implements ISeasonFinderService {

    @Override
    public String findSeason() {
        int month = LocalDate.now().getMonthValue();
        String season;

        if (month >= 3 && month <= 5) {
            season = "Spring Season";
        } else if (month >= 6 && month <= 8) {
            season = "Summer Season";
        } else if (month >= 9 && month <= 11) {
            season = "Autumn Season";
        } else {
            season = "Winter Season";
        }

        return season;
    }
}
