package com.db.gameofthrones.controllers;

import com.db.gameofthrones.services.Client;
import com.db.gameofthrones.services.IronBankDao;
import com.db.gameofthrones.services.PredictionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Evegeny on 04/09/2017.
 */
@RestController
@RequestMapping("/gof")
public class MainController {
    @Autowired
    private PredictionService predictionService;

    @Autowired
    private IronBankDao dao;

    @GetMapping("/predict/{name}")
    public boolean checkClient(@PathVariable String name) {
        return predictionService.датьДеньги(dao.findByName(name));
    }
}
















