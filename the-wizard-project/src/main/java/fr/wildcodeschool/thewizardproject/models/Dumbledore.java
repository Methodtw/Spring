package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("doubleDoorxD")
public class Dumbledore implements WizardInterface {
	private Outfit wizardDress;
	
	@Autowired
    public Dumbledore(@Qualifier("GreyDress")Outfit theDress) {
        wizardDress = theDress;
    }
    @Override
    public String displayDress() {
        return this.wizardDress.changeDress();
    }
	public String giveAdvice() {
		return "8073203872 Points for Gryffindor !";
	}
}