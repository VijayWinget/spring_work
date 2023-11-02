package vroughwork.main;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;

public class StringFunc {

	public static void main(String[] args) {
		
		
//		String data="qwertyuiop,";
//		data=data.endsWith(",")?data.substring(0, data.length()-1):data;
//		System.out.println("final    "+data);

		String input = "MALA851CMHM660671";   //input string
		String lastFourDigits = "";
//		
//		if (input.length() > 4) 
//		{
//		    lastFourDigits = input.substring(input.length() - 4);
//		} 
//		
//		lastFourDigits=	StringUtils.right("absddwdcdef", 5);
	
		
//		
//		String lastFourDigits1 = input.substring(Math.max(0, input.length() - 5));
//		
//		System.out.println(lastFourDigits1);
//		
//		
//		System.out.println(StringUtils.join(
//			     StringUtils.splitByCharacterTypeCamelCase("exampleTest"),
//			     ' '));
		
		
		
		
//		double vv = Math.random();
//		System.out.println("vj" + vv);
//		Random r = new Random();
//		String randomNumber = String.format("%04d", r.nextInt());
//		System.out.println(randomNumber);
		
//		
//		String regexPattern = "^[1-9][0-9]*$";
//		
//		String s="2";
//
//		
//		;
//		System.out.println("RESULT :  "+Pattern.compile(regexPattern).matcher(s).find() );
//		
//		
		
		
//		    String scientificNotation = "5.16003E7";
//		    BigDecimal amountNumber = new BigDecimal(scientificNotation.replace(",", ""));
//			DecimalFormat deciFormat = new DecimalFormat();
//			deciFormat.setGroupingUsed(false);
//	        System.out.println("Number: " + Long.parseLong(deciFormat.format(amountNumber).toString()) );
		
		String value = "500000000000000";
		long convertedValue = Long.parseLong(value);
		System.out.println(convertedValue);
		
		
		
		
		
//		String ids = "2,3,4,5,6,7,8,9,0";
		String ids = "7,0,47,67,77,07";

		Boolean result = Arrays.asList(ids.split(",")).contains("7");

		System.out.println(result);
		
		String categoryId ="77,7,67";
		
		String result1 = ids.replaceAll("\\b" + categoryId + "\\b,?", "");

		System.out.println(result1);
		
		
        /*		
		List<String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		System.out.println("   Print    " + StringUtils.join(list, ','));
		 */
		
		
		
		//reference
//		    String[] strings1={"1","2","3","4","52",},strings2={"1","2","3","4","52","d"};
//	        Set<String> set=new LinkedHashSet<String>(Arrays.asList(strings1));
//	        set.retainAll(Arrays.asList(strings2));
//	        System.out.println( set);
	        
	        
/*
 	        String[] strings1={"1","2","3","4","52","89","95"},strings2={""};
	        Set<String> set1 = new HashSet<>(Arrays.asList(strings1));
	        Set<String> set2 = new HashSet<>(Arrays.asList(strings2));
	        set2.retainAll(set1);
	        System.out.println("Finale -  "+String.join(",", set2));
	        if(String.join(",", set2)=="") {
	        	System.out.println("empty");
	        }
	        
	        */
		
//	        
//String str = "1213213,5454543,w34343";
//
//String a1[] = str.split(",")[0]
//
//System.out.println(a1.toString());
		
		
		
		
	//	
//		 String codes=  String.join(",", brokerList
//		            .stream()
//		            .map(name -> ("'" + name + "'"))
//		            .collect(Collectors.toList()));
		
		
//		String codes = String.join(",",
//				activeBrokerList.stream().map(name -> ("'" + name + "'")).collect(Collectors.toList()));
	//
//		List<Company> filteredBrokerList = brokerList.stream().filter(p -> codes.contains(p.getBrokerCode()))
//				.collect(Collectors.toList());	
		
		
		
		
	}

}
