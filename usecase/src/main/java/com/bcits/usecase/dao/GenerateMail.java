package com.bcits.usecase.dao;

import java.text.SimpleDateFormat;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.bcits.usecase.beans.ConsumerMasterBean;
import com.bcits.usecase.beans.CurrentBillBean;



public class GenerateMail {

	public void sendMail(CurrentBillBean currentBill,ConsumerMasterBean consumerInfo ) {

		System.out.println("Sending Mail...");

		final String username = "prashulshetty307@gmail.com";
		final String password = "shetty1job";

		Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.port", "587");
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.starttls.enable", "true");

		Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		String dueDate = dateFormat.format(currentBill.getDueDate());
		String date = dateFormat.format(currentBill.getDate() );

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(consumerInfo.getEmail()));
			message.setSubject("DESCOM");
			message.setText("Dear Consumer," + "\n\n Electricity bill Details :\n\n" 
			+ "\n\n RR Number :" + consumerInfo.getRrNumber()
			+ "\n\n Previous Reading : " +currentBill.getInitialReading()
			+ "\n\n Current Reading : " +currentBill.getCurrentReading()
			+ "\n\n Units Used : "+currentBill.getUnits()
			+ "\n\n Type of Consumer : "+currentBill.getTypeOfConsumer()
			+ "\n\n Bill Amount: "+currentBill.getBillAmount()
			+ "\n\n Date: "+currentBill.getDate()
			+ "\n\n DueDate: "+currentBill.getDueDate()
			+"\n\n\n Thank you...."
			);
		
			Transport.send(message);

			System.out.println("Done");
		} catch (MessagingException e) {
			e.printStackTrace();
		}

	}
}
