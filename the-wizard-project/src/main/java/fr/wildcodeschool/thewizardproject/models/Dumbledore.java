package fr.wildcodeschool.thewizardproject.models;

public class Dumbledore implements WizardInterface {
    private Outfit wizardDress;

    public Dumbledore(Outfit theDress) {
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