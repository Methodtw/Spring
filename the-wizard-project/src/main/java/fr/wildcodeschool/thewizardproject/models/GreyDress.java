package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component
public class GreyDress implements Outfit {
	@Override
	public String changeDress() {
		return "The wizard dress is grey";
	}

}