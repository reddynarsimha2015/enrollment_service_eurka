/**@Copyright 2022 keybank pvt ltd.
 * All rights are reserved,you should 
*disclose the information outside
* otherwise terms and condition will apply
 */
package com.keybank.enrollment.dao;

import org.springframework.stereotype.Component;

import com.keybank.enrollment.exception.BusinessException;
import com.keybank.enrollment.exception.SystemException;
import com.keybank.enrollment.model.EnrollmentDaoRequest;
import com.keybank.enrollment.model.EnrollmentDaoResponse;

/**
 * @author YNBR 14-Mar-2022
 *
 */

public interface EnrollmentDao {
 
	public EnrollmentDaoResponse enrollment(EnrollmentDaoRequest daorequest) throws BusinessException,SystemException;
}
