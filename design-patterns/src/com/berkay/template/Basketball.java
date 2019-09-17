package com.berkay.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Basketball extends Game {

	@Override
	void initialize() {
		// TODO Auto-generated method stub
		System.out.println("Basketball game is initializing...");
		
	}

	@Override
	void startPlay() {
		// TODO Auto-generated method stub
		System.out.println("Basketball game is starting...");

		
	}

	@Override
	void endPlay() {
		// TODO Auto-generated method stub
		System.out.println("Basketball game is ended...");
		
	}

	@Override
	protected void addNewCharacterToTheGame() {
		playerWantsNewCharacter();
		
	}
	
	public boolean playerWantsNewCharacter() {
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
    		System.out.println("Adding new character to the game...");
        	return true;
        }else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;

        System.out.println("Would you like to add a new character to the game? (y/n)? ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();

        }catch (IOException ioe) {
            System.out.println("IO Error");
        }
        if (answer == null || answer.toLowerCase().startsWith("n")) {
            return "no";
        }

        return answer;
    }

}
