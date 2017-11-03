package ca.ualberta.cs.lonelytweet;

import java.util.Date;

// class made private.
class ImportantLonelyTweet extends LonelyTweet {

	public ImportantLonelyTweet() {
	}

	public ImportantLonelyTweet(String text, Date date) {
		this.tweetDate = date;
		this.tweetBody = text;
	}

	@Override
	public boolean isValid() {
		// if statement simplified because it was redundant.
		return !(tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 20);

	}

	@Override
	public String getTweetBody() {
        return tweetBody.toUpperCase();
    }
}