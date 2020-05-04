package com.uca.TareaLabo4Capas.domain;

import javax.validation.constraints.AssertTrue;

public class Robot {
	
	@AssertTrue(message="Ups no puedes agregar tu producto porque eres un robot, por favor haga click en regresar")
	private Boolean soyRobot;

	public Boolean getSoyRobot() {
		return soyRobot;
	}

	public void setSoyRobot(Boolean soyRobot) {
		this.soyRobot = soyRobot;
	}

}
