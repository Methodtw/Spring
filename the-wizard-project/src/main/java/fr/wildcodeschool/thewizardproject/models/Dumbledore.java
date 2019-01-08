package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("dumbledore")
public class Dumbledore implements WizardInterface {
	private Outfit wizardDress;
	
	@Autowired
    public Dumbledore(@Qualifier("greyDress")Outfit theDress) {
        wizardDress = theDress;
    }
    @Override
    public String displayDress() {
        return this.wizardDress.changeDress();
    }
    @Override
	public String giveAdvice() {
		return "8073203872 Points for Gryffindor !";
	}
}