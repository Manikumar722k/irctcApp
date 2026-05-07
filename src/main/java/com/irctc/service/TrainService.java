package com.irctc.service;

import java.util.List;

import com.irctc.entity.Train;

public interface TrainService {
	Train addTrainsData(Train train);

    List<Train> searchTrains(String source, String destination);
    
    List<Train> traindata(String trainName);
    
    List<Train> allData();
}
