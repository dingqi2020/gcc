package com.gcc.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.gcc.dao.G40004Dao;
import com.gcc.entity.UserBaseInfo;
import com.gcc.entity.UserCompanyInfo;
import com.gcc.entity.UserPsersonalInfo;

@Service
@Repository
public class G40004ServiceImpl {

	@Autowired
	private G40004Dao g40004Dao;

	public UserBaseInfo getBaseInfo(String userid) {
		UserBaseInfo baseInfo = g40004Dao.getUserBaseInfoByUserID(userid);
		if (baseInfo != null) {
			return baseInfo;
		}
		return null;
	}
	
	public UserCompanyInfo getCompanyInfo(String userid) {
		UserCompanyInfo companyInfo = g40004Dao.getUserCompanyInfoByUserID(userid);
		if (companyInfo != null) {
			return companyInfo;
		}
		return null;
	}

	public UserPsersonalInfo getPersonalInfo(String userid) {
		UserPsersonalInfo psersonalInfo = g40004Dao.getUserPersonalInfoByUserID(userid);
		if (psersonalInfo != null) {
			return psersonalInfo;
		}
		return null;
	}
}
