package com.acceval.integration.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.stereotype.Component;

@Component
public class IoclDateUtil {
	public Date convertedDate(String startDate, String format) {
		Date convDate = null;
		try {
			if (startDate != null && format != null) {
				// Parse the formatted string back to Date in the desired format
				SimpleDateFormat dateFormat = new SimpleDateFormat(format);
				convDate = dateFormat.parse(startDate);
				System.out.println(convDate);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return convDate;

	}

	public XMLGregorianCalendar DateToXMLGregorianCalendar(Date date) {

		// Format the Date object to a string with milliseconds
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS");
		String dateString = dateFormat.format(date);
		XMLGregorianCalendar xmlGregorianCalendar = null;
		try {
			// Parse the formatted string back to Date with milliseconds
			Date parsedDate = dateFormat.parse(dateString);

			// Convert Date to GregorianCalendar
			GregorianCalendar calendar = new GregorianCalendar();
			calendar.setTime(parsedDate);

			// Convert GregorianCalendar to XMLGregorianCalendar
			xmlGregorianCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);

			System.out.println(xmlGregorianCalendar); // Output: XMLGregorianCalendar object in the specified format
		} catch (ParseException | DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		return xmlGregorianCalendar;

	}

	public String convertTimeToString(LocalDateTime time, String format) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);

		String formattedDateTime = time.format(formatter);

		return formattedDateTime;
	}
}
