package com.roderus.quiz2025;

import android.content.Context;
import android.content.Intent;

public class Helper {

	/**
	 * Wird von den Frage-Activities aufgerufen, um ein Feedback für den User zu erzeugen.
	 * 
	 * @param isAnswerCorrect
	 *            true, wenn die Antwort richtig war, sonst false
	 * @param points
	 *            die erworbene Punktzahl
	 * @param activity
	 *            von welcher (Frage-)Activity kommen wir?
	 */
	public static void feedback(boolean isAnswerCorrect, int points, Context activity) {
		/*
		 * Achtung: Die Methode ist eine reine Hilfsmethode (eine
		 * "Zusammenfassung" von mehrfach gebrauchten Befehlen. Die Klasse
		 * besitzt keine Datenfelder und die Methode kann unabhängig von einer
		 * Instanz dieser Klasse verwendet werden. Daher wurde sie "static" definiert.
		 */
		String feedback, pointstr;
		if (isAnswerCorrect) {
			feedback = activity.getString(R.string.positive_feedback);
			pointstr = activity.getString(R.string.positive_score);
		}
		else {
			feedback = activity.getString(R.string.negative_feedback);
			pointstr = activity.getString(R.string.negative_score);
		}
		/* Der Intent zum Aufruf der FeedbackActivity wird erzeugt */
		Intent intent = new Intent(activity, FeedbackActivity.class);

		/* Als Extra-Information bekommt der Intent noch die Feedback-Texte und die Punkte mit */
		intent.putExtra("fb", feedback);
		intent.putExtra("pstr", pointstr);
		intent.putExtra("pts", points);
		activity.startActivity(intent);
	}
}
