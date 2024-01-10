package com.acceval.integration.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class IoclUtil {
	public XMLGregorianCalendar changeDateFormat(String dateTime, String pattern) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		GregorianCalendar gCalendar = new GregorianCalendar();
		XMLGregorianCalendar xmldate = null;
		try {

			Date parsedate = dateFormat.parse(dateTime);
			gCalendar.setTime(parsedate);

			xmldate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCalendar);

		} catch (Exception e) {
			// TODO: handle exception
		}
		return xmldate;
	}

	public String createFolderIfNotExists(String targetPath) {

		Path root = Paths.get("");
		String projectRoot = root.toAbsolutePath().toString();
		System.out.println("Project Root: " + projectRoot);
		String folderPath = projectRoot + targetPath; // Replace this with the desired folder path

		Path path = Paths.get(folderPath);
		// File file = new File(folderPath, fileName);

		if (!Files.exists(path)) {
			try {
				Files.createDirectories(path);
				System.out.println("Folder created successfully!");
				return folderPath;
			} catch (IOException e) {
				System.err.println("Failed to create the folder: " + e.getMessage());
				return null;
			}
		} else {
			System.out.println("Folder already exists!");
			return folderPath;
		}

	}

}
