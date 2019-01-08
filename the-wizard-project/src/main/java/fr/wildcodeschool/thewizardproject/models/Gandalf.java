package fr.wildcodeschool.thewizardproject.models;

public class Gandalf implements WizardInterface {
    private Outfit wizardDress;

    public Gandalf(Outfit theDress) {
        wizardDress = theDress;
    }

    @Override
    public String displayDress() {
        return this.wizardDress.changeDress();
    }
	public String giveAdvice() {	
		return "You shall not pass";
	}
}