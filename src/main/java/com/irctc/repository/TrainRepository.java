package com.irctc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.irctc.entity.Train;

public interface TrainRepository extends JpaRepository<Train, Long>{
	List<Train> findBySourceAndDestination(String source,String destination);
	List<Train> findByTrainName(String trainName);
}
