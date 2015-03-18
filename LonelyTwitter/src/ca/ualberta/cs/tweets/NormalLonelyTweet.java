package ca.ualberta.cs.tweets;

import java.io.Serializable;
import java.util.Date;

import android.util.Log;

public class NormalLonelyTweet extends 
LonelyTweet implements Serializable {

	public NormalLonelyTweet() {
	}

	public NormalLonelyTweet(String text) {
		this(text, null);
	}

	public NormalLonelyTweet(String text, Date date) {
		this.tweetDate = new Date();
		this.tweetBody = text;
	}

	@Override
	public String toString() {
		String stringForm = getTweetDate() + " | " + getTweetBody();
		Log.i("tweet", stringForm);
		return stringForm;
	}

	public String getTweetBody()
	{
		return tweetBody;
	}
}
