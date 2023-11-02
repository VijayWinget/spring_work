package vroughwork.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;


public class DATE_FORMAT {

	
	public static void main(String[] args) throws ParseException {
	
		
		
        String inputDate = "25-10-2023";
        SimpleDateFormat inputFormat = new SimpleDateFormat("dd-MM-yyyy");
//        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        try {
            Date date = inputFormat.parse(inputDate);
//            String formattedDate = outputFormat.format(date);
            System.out.println(date);
//            inputDate =formattedDate;
        } catch (ParseException e) {
            e.printStackTrace();
        }
		
		
		
//		String date = "25-10-2023";	
		String date = inputDate;	
		

		    DateTimeFormatter dtf = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm");
	        DateTime jodatime = dtf.parseDateTime(date);

	        DateTimeFormatter dtfOut = DateTimeFormat.forPattern("dd-MM-yyyy HH:mm");
	        String formattedDate = dtfOut.print(jodatime);
	        
	        System.out.println("Date : "+formattedDate);

	        
    	
	        
	        
	        
	        DateTimeFormatter dtf1 = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");

    		DateTime jodatime1 = dtf1.parseDateTime(date+":00");

    		DateTimeFormatter dtfOut1 = DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss");

	        
    		 String formattedDate1 = dtfOut1.print(jodatime1);
    		
    		
    		 System.out.println("Date : "+formattedDate1);
    		
    		
		
	        //get Start date and end 
//		String date ="2023-06-26 03:26";
//		
//		 DateTimeFormatter dtf = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm");
//		
//		DateTime previousEndDate = dtf.parseDateTime(date);
//
//		DateTime  startDate =previousEndDate.plusDays(1);
//		
//		DateTime endDate = startDate.plusMonths(3);
//		
//		System.out.println("STARTDATE : "+startDate.toString("dd-MM-yyyy HH:mm"));
//
//		System.out.println("ENDDATE : "+endDate.toString("dd-MM-yyyy HH:mm"));
		
//
//        org.joda.time.format.DateTimeFormatter dtf = DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss");
//		
//		DateTime startDate = dtf.parseDateTime(today.toString("dd-MM-yyyy HH:mm:ss"));
//		
//		DateTime endDate = startDate.plusMonths(4);
//		
//		fleetQuoteDTO.setStartDate(startDate.toString("dd-MM-yyyy HH:mm:ss"));
//		
//		fleetQuoteDTO.setEndDate(endDate.toString("dd-MM-yyyy HH:mm:ss"));
//		
		
		
//		String date="25-04-2022 09:43:19";
//		String date="25-04-2022";
//		
//		DateTimeFormatter dtf = DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss");
//
//		DateTime startDate = dtf.parseDateTime(date +" 00:00:00");
//		
//		System.out.println("EXCEPTION--"+startDate); 
		
		/*
		String date = new SimpleDateFormat("dd-MM-yyyy").format(Calendar.getInstance().getTime());
		
		System.out.println("date ---"+date);
		*/
		
		
		
		
//		String strDatewithTime = "2019-08-04T10:11:30";
//		LocalDateTime AA = LocalDateTime.parse(strDatewithTime);
//		System.out.println("a: " + AA);
//		
//		
//		String b = "2022-08-04T10:11:30";
//		LocalDateTime BB = LocalDateTime.parse(b);
//		System.out.println("b: " + BB);
		
//		if(AA.isBefore(BB)) {
//			System.out.println("TRUE");
//		}else {
//			System.out.println("FALSE");
//		}3.0935115487044626E8
		
//		LocalDate localDate = BB.toLocalDate();
//		
//		System.out.println("loca  "+localDate);
//		
		
		
		
//		System.out.println("v ----"+stringDate); 
//				String stringDate = new SimpleDateFormat("yyyy-mm-dd").format("29/09/2022");
	/*	
		Double value=3.0935115487044626E8;
		
		DecimalFormat format = new DecimalFormat("##.00");
		format.setMaximumFractionDigits(2);
		
		String d =String.valueOf(format.format(value));
		
		System.out.println("v ----"+d); */
		
		
		
		
		
		/* extract date and time from datetime */
		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
//		
//		
//		Date date = sdf.parse("2022-05-14 23:50:24");
//
//		SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
//		sdf2.setTimeZone(TimeZone.getTimeZone("IST"));
//		
//		String dateStr = sdf2.format(date); 
//		
//		System.out.println(""+dateStr);
//
//		

//		LocalDate now = LocalDate.now();
//		LocalDate thirty = now.plusDays(30);
//		System.out.println(thirty.toString() );
//		
//		LocalDateTime datime = thirty.atStartOfDay();
		
		
		/*
		SimpleDateFormat sdfParse = new SimpleDateFormat("dd/MM/yyyy");
		try{
		    Date from = sdfParse.parse("01/01/2022");
		    Date to = sdfParse.parse("31/01/2022");
		    
		       long difference_In_Time
               = to.getTime() - from.getTime();
		    
		       long difference_In_Days
               = (difference_In_Time
                  / (1000 * 60 * 60 * 24))
                 % 365;
		    
		    System.out.println(difference_In_Days); // Prints 09/24/1989
		}
		catch (ParseException e){
		    System.out.println("Invalid date");
		}*/
		
		
		
		
//		String date = "27/01/3000";
//		System.out.println("LENGTH : "+date.length());
//		String pattern = "^(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d$";
//		Pattern p = Pattern.compile(pattern);
//		Matcher m = p.matcher(date);
//
//		System.out.println("LENGTH : "+m.find());
//		if (m.find()) {
//			System.out.println("Date is valid");
//		} else {
//			System.out.println("Date is not valid");
//		}
		
		
//		  SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy").format(new Date()) ;  
//	      Date date = new Date();  
//	      String strDate =new SimpleDateFormat("dd/MM/yyyy").format(new Date()) ;
//		
//	      System.out.println("strDate : "+strDate);
		
		
//		String dateString = "24-08-2023";
//        try {
//            // Create a SimpleDateFormat object with the pattern matching your date string
//            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
//            
//            Date parsedDate = dateFormat.parse(dateString);
//            
//            // Convert the Date object to a SQL Timestamp
//            Timestamp timestamp = new Timestamp(parsedDate.getTime());
//            
//            // Print the SQL Timestamp
//            System.out.println("SQL Timestamp: " + timestamp);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//		
		
//		DateTime today = new DateTime(
//				DateTimeZone.forID(String.valueOf("Etc/GMT")));
//		
//		String quotationgetCreatedDate ="24-10-2023 15:55:17";
//		
//		String startDateString ="24-10-2024 00:00:00";
//		
//		DateTimeFormatter dtf = DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss");
//		DateTime startDate = new DateTime();
//
//		try {
//			startDate = dtf.parseDateTime(quotationgetCreatedDate);
//			if (true) {
//				DateTime quotationStartDate = dtf.parseDateTime(startDateString);
//				if (quotationStartDate.isAfter(today)) {
//					startDate = quotationStartDate;
//				}
//			}
//
//		} catch (Exception e) {
//			System.out.println("Renewel quotation Execption ---" + e);
//		}
//		
		
		
		
		
		
		
		
		
		
	}
	
}
