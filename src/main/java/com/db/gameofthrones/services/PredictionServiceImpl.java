package com.db.gameofthrones.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Evegeny on 04/09/2017.
 */
@Service
@Profile("PROD")
public class PredictionServiceImpl implements PredictionService {
    @Override
    public boolean датьДеньги(Client client) {
        if (client.getName().toLowerCase().contains("stark")) {
            return false;
        } else {
            return false;
        }
    }
}
