package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("gandalf")
public class Gandalf implements WizardInterface {
	private Outfit wizardDress;
	
	@Autowired
    public Gandalf(@Qualifier("whiteDress")Outfit theDress) {
        wizardDress = theDress;
    }
    @Override
    public String displayDress() {
        return this.wizardDress.changeDress();
    }
    @Override
	public String giveAdvice() {	
		return "You Shall Not Pass";
	}
}