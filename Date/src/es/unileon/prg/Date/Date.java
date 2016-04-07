package es.unileon.prg.Date;


import java.util.*;

/**
 * @author Paula
 *
 */
public class Date {
	
	
	private int day;
	private int month;
	private int year;
	boolean same;
	
	
	public Date(int _day, int _month, int _year){
		day = _day;
		month=_month;
		year =  _year;
	}
	
	public int getYear() {
		return this.year;
	}

	public	int getDay(){
		return this.day;
	}

	public	int getMonth(){
		return this.month; 
	}
	
	
	public	boolean isSameYear(Date anotherYear){	
		if (this.year == anotherYear.getYear()){
			return true;
		}
		return false;
	}
	
	
	public	boolean isSameMonth(Date anotherMonth){
		if (this.month == anotherMonth.getMonth()){
			return true;
		}
		return false;
	}

	
	public	boolean isSameDay(Date anotherDay){
		if (this.day == anotherDay.getDay()){
			return true;
		}
		return false;
	}
	
	
	
	public	boolean isSame (Date other){
		if (isSameDay(other)&& isSameMonth(other) && isSameYear(other)){
			return true;
		}
		return false;
	}
	
	
	public	boolean isSameDaySimplif (Date anotherDay){
		same = (this.day == anotherDay.getDay());
		return same;
	}
	
	
	public	boolean isSameMonthSimplif (Date anotherMonth){
		same = (this.month == anotherMonth.getMonth());
		return same;
	}
	
	
	public	boolean isSameYearSimplif (Date anotherYear){
		same = (this.year == anotherYear.getYear());
		return same;
	}
	
	
	public	boolean isSameSimplif (Date other){
		boolean same;
		same = isSameDay(other)&& isSameMonth(other) && isSameYear(other);
		return same;
	}
	
	
	public  String nameMonth(int month){
		String name;
		switch(this.month){
			case 1:
				name = "Enero";
				break;
			case 2:  
				name = "Febrero";
				break;
			case 3: 
				name = "Marzo";
			    break;
			case 4:  
				name = "Abril";
			    break;
			case 5:  
				name = "Mayo";
			    break;
			case 6:  
				name = "Junio";
			    break;
			case 7:  
				name = "Julio";
			    break;
			case 8: 
				name = "Agosto";
			    break;
			case 9: 
				name = "Septiembre";
			    break;
			case 10:
				name = "Octubre";
			    break;
			case 11: 
				name = "Noviembre";
			    break;
			case 12:
				name = "Diciembre";
			    break;
			default:
				name = "Not a month";
			    break;
		}
		return name;
	}
	
	  
	  public boolean dayOk(){
		  boolean ok = true;
		  switch(this.month){
			  case 1:
			  case 3:
			  case 5:
			  case 7:
			  case 8:
			  case 10:	  
			  case 12:
				  if(this.day > 31 && this.day < 0){
					  ok = false;
				  }
				  break;
			  case 2:
				  if(this.day > 28 && this.day < 0){
					  ok = false;
				  }
				  break;
			  case 4:
			  case 6:
			  case 9:
			  case 11:
				  if(this.day > 30 && this.day < 0){
					  ok = false;
				  }
				  break;
		  } 
		return ok;  
	  }
	  
	
	public  String seasonMonth(){
		  String season;
		  switch(this.month){ 
		  	case 4:
		  		season = "Spring";
	  			break;
		  	case 5:
		  		season = "Spring";
	  			break;
		  	case 6:
		  		season = "Spring";
		  		if (this.day >= 21){
		  			season = "Summer";
		  		}
		  		break;
		  	case 7: 
		  		season = "Summer";
		  		break;
		  	case 8:
		  		season = "Summer";
	  			break;
		  	case 9:
		  		season = "Summer";
		  		if (this.day >= 23){
		  			season = "Autum";
		  		}
		  		break;
		  	case 10:
		  		season = "Autum";
		  		break;
		  	case 11:
		  		season = "Autum";
		  		break;
		  	case 12:
		  		season = "Autum";
		  		if (this.day >= 21){
		  			season = "Winter";
		  		}
		  		break;
		  	case 1:
		  		season = "Winter";
		  		break;
		  	case 2:
		  		season = "Winter";
				break;
			case 3:
				season = "Winter";
				if (this.day >= 21){
		  			season = "Spring";
		  		}
		  		break;
		  	default: 
		  		season ="Not a season";
		  } 
		return season;	  
	  }
	  
	
	public  int restMonths(){
  		int months =this.month;
  		for (months = months +1; months<=12; months++){
  			System.out.println(months);
  		}
  		return months;
  }
	
	public String toString(){
		StringBuffer date = new StringBuffer();
		date.append(this.day + "-" + this.month + "-" + this.year);
		System.out.println(date);
		return date.toString();
	}
	
	
	public int restDays(int days){
		  switch(this.month){
				  case 1:
				  case 3:
				  case 5:
				  case 7:
				  case 8:
				  case 10:	  
				  case 12: days = 31;
					/*  for (days = days +1; days <= 31; days++){
						  System.out.println(days);
					  }*/
					  break;
				  case 2: days = 28;
					/*  for (days = days +1; days<=28; days++){
						  System.out.println(days);
					  }*/
					  break;
				  case 4:
				  case 6:
				  case 9:
				  case 11: days = 30;
					/*  for (days = days +1; days <= 30; days++){
						  System.out.println(days);
					  }*/
					  break;
		  }
		return days;		  
	  }
	  
	public  String printDatesUntilEndMonth(){
		  StringBuffer printDates = new StringBuffer();
		  for (int i = this.day +1; i<=restDays(this.day); i++ ){
			 printDates.append(i + "-" + nameMonth(i) + "-" + this.year + "\n");
		  }
		  System.out.println(printDates);
		  return printDates.toString(); 
	  }
	
	
	public int daysSiceFirstDayOfYear(){
		int totalDays = 0;
		for(int i = 1; i<this.month; i++){
			totalDays = totalDays+ restDays(i);
		}
		totalDays = totalDays + this.day;
		System.out.println(totalDays);
		return totalDays;
	}
	  
	

	public String printMonthsWithSameDays(){
		StringBuffer printMonths = new StringBuffer();
		int days = restDays(this.day);
		for (int i=1; i<=12; i++){
			this.month = i;
			if(days==restDays(i)){
				printMonths.append(nameMonth(i)+ "\n");
			}
		}
		System.out.println(printMonths);
		return printMonths.toString();
	}

	
	private int numAttemps = 0;
	
	public int randomDay(){
		
		int randomDay = (int) (Math.random()*31+1);
		return randomDay;
	}
	
	
	public int randomMonth(){
		
		int randomMonth = (int) (Math.random()*12+1);
		return randomMonth;
	}
	
	
	public int randomDate1(){
		while(this.day!= randomDay()||  this.month!=randomMonth()){
			numAttemps++;
		}
		System.out.println(numAttemps);
		return numAttemps;
	}
	
	
	public int randomDate2(){
		do {
			numAttemps++;
		}while(this.day!= randomDay()||  this.month!=randomMonth());
		
		System.out.println(numAttemps);
		return numAttemps;
	}
	
	
	public int numberOfDay(){
	//	Date date = new Date(day,month,year);
		GregorianCalendar calendar = new GregorianCalendar();
		//calendar.setTime(date);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		return dayOfWeek;
		
	}
	
	
	public  String nameDay( ){
		String name = "";
		switch(numberOfDay()){
			case 1:  
				name = "Domingo";
			    break;
			case 2:
				name = "Lunes";
				break;
			case 3:  
				name = "Martes";
				break;
			case 4: 
				name = "Miercoles";
			    break;
			case 5:  
				name = "Jueves";
			    break;
			case 6:  
				name = "Viernes";
			    break;
			case 7:  
				name = "Sabado";
			    break;
			
		}
		return name;
	}
	
	
}
