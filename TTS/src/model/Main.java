package model;

//import marytts.client.MaryClient.Voice;
import marytts.modules.synthesis.Voice;

public class Main {

	public static void main(String[] args)
	{
		TextToSpeech tts = new TextToSpeech();
		
		// that will print all the available voices
		// that we have added on the class path
		Voice.getAvailableVoices().stream().forEach(System.out::println);
		
		// setting the voice
		tts.setVoice("dfki-poppy-hsmm");
		
		//tts say something actually are typing into the first variable
		tts.speak("hello world", 2.0f, false, true);
		
		//change the voice
		tts.setVoice("cmu-slt-hsmm");
		
		//tts say saomething
		tts.speak("the text type here will be made sound output", 1.5f, false, false);
	}
}
