package java8.ex01;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.junit.Test;

/**
 * Exercice 01 - Les dates avant Java 8
 */
public class DateAndTime_01_Test {

	// Vous vous souvenez de java.util.Date (Java 1) ?
	@Test
	public void test_date() {

		// TODO modifier les paramètres du constructeur pour que le test soit passant
		Date date = new Date(117, 2, 24, 01, 02, 03);
		
		SimpleDateFormat format = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", new Locale("US","us"));
		
		format.format(date);
		assertThat(date.toString(), is("Fri Mar 24 01:02:03 CET 2017"));

		// TODO modifier le jour de la date avec une méthode set pour que le test soit
		// passant
		
		date.setDate(25);

		assertThat(date.toString(), is("Sat Mar 25 01:02:03 CET 2017"));
	}

	// Vous vous souvenez de java.util.Calendar (Java 1.1) ?

	@Test
	public void test_calendar() throws Exception {
		Calendar calendar = Calendar.getInstance();

		// TODO modifier l'objet calendar pour que le test soit passant
		
		SimpleDateFormat format = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", new Locale("US","us"));

		assertThat(calendar.getTime().toString(), is("Fri Mar 24 01:02:03 CET 2017"));
		
		format.format(calendar);

		// calendar est mutable... :-(
		// TODO modifier l'objet calendar pour que le test soit passant

		assertThat(calendar.getTime().toString(), is("Sat Mar 25 01:02:03 CET 2017"));
	}

}
