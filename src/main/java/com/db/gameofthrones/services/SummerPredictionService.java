package com.db.gameofthrones.services;

import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Evegeny on 04/09/2017.
 */
@Service
@Profile("DEV")
@Conditional(OnSummerCondition.class)
public class SummerPredictionService implements PredictionService {
    @Override
    public boolean датьДеньги(Client client) {
        return true;
    }
}
