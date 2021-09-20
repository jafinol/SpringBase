package com.finolweb.core.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class DevEnviroment  implements EnviromentService{

	@Override
	public String getEnviroment() {
		// TODO Auto-generated method stub
		return "Dev";
	}

}
