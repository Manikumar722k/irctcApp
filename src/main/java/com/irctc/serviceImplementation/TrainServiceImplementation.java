package com.irctc.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irctc.entity.Train;
import com.irctc.repository.TrainRepository;
import com.irctc.service.TrainService;

@Service
public class TrainServiceImplementation implements TrainService{
	
    private final TrainRepository trainRepository;

    public TrainServiceImplementation(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    @Override
    public Train addTrainsData(Train train) {
        return trainRepository.save(train);
    }

    @Override
    public List<Train> searchTrains(String source, String destination) {
        return trainRepository.findBySourceAndDestination(source, destination);
    }

	@Override
	public List<Train> traindata(String trainName) {
		
		return trainRepository.findByTrainName(trainName);
	}

	@Override
	public List<Train> allData() {
		
		return trainRepository.findAll();
	}

}
