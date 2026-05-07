package com.irctc.controller;

import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.irctc.entity.Train;
import com.irctc.service.TrainService;

@RestController
@RequestMapping("/trains")
public class TrainController {

	
	private final TrainService trainService;

    public TrainController(TrainService trainService) {
        this.trainService = trainService;
    }

    @PostMapping("/save")
    public ResponseEntity<Train> saveTrain(@RequestBody Train train) {

        Train savedTrain = trainService.addTrainsData(train);

        return new ResponseEntity<>(savedTrain, HttpStatus.CREATED);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Train>> searchTrain(
            @RequestParam String source,
            @RequestParam String destination) {

        List<Train> trains = trainService.searchTrains(source, destination);

        return new ResponseEntity<>(trains, HttpStatus.OK);
    }
    
    @GetMapping("/trainData")
    public ResponseEntity<List<Train>> trainData(@RequestParam String trainName)
    {
    	List<Train> trains=trainService.traindata(trainName);
    	return new ResponseEntity<>(trains,HttpStatus.OK);
    }
    

    @GetMapping("/trainAllData")
    public ResponseEntity<List<Train>> trainAllData()
    {
    	List<Train> trains=trainService.allData();
    	
    	return new ResponseEntity<>(trains,HttpStatus.OK);
    }
     
    
}
