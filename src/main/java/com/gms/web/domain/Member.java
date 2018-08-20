package com.gms.web.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Member {
	public String memID, teamID, name, ssn, age ,roll, password, subject, gender;


	
}
