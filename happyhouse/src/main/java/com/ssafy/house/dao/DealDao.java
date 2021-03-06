package com.ssafy.house.dao;

import java.util.List;

import com.ssafy.house.dto.AmountDto;
import com.ssafy.house.dto.DealDto;

public interface DealDao {

	List<DealDto> officeRentList(DealDto deal) throws Exception;
	
	int getTotCntOfficeRent(DealDto deal) throws Exception;

	List<DealDto> officeDealList(DealDto deal) throws Exception;

	int getTotCntOfficeDeal(DealDto deal) throws Exception;

	List<DealDto> homeRentList(DealDto deal) throws Exception;

	int getTotCntHomeRent(DealDto deal) throws Exception;
	
	List<DealDto> homeDealList(DealDto deal) throws Exception;

	int getTotCntHomeDeal(DealDto deal) throws Exception;
	
	List<DealDto> aptRentList(DealDto deal) throws Exception;

	int getTotCntAptRent(DealDto deal) throws Exception;

	List<DealDto> aptDealList(DealDto deal) throws Exception;

	int getTotCntAptDeal(DealDto deal) throws Exception;

	List<AmountDto> aptDealAmountList(DealDto deal) throws Exception;

	List<DealDto> getaptList(DealDto dealDto) throws Exception;


}
