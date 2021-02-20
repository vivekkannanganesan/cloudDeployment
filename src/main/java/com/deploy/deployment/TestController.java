package com.deploy.deployment;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	

	@RequestMapping("/deploy")
	public DeploymentModel disp(){
		
		DeploymentModel deploymentModel = new  DeploymentModel();
		deploymentModel.setMessage("Automate all the things!");
		deploymentModel.setTimeStamp(new Date());
		return deploymentModel;
	}
	@RequestMapping("/test")
	public String test(){
		return "test";
	}

}
