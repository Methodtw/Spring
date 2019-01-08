package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component
public class WhiteDress implements Outfit {
	@Override
	public String changeDress() {
		return "The wizard dress is White";
	}

}