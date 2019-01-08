package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("theWizard")
public class Gandalf implements WizardInterface {
	private Outfit wizardDress;
	
	@Autowired
    public Gandalf(@Qualifier("WhiteDress")Outfit theDress) {
        wizardDress = theDress;
    }
    @Override
    public String displayDress() {
        return this.wizardDress.changeDress();
    }
	public String giveAdvice() {	
		return "You Shall Not Pass";
	}
}