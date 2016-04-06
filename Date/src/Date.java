

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
	
	int getYear() {
		return this.year;
	}

	int getDay(){
		return this.day;
	}

	int getMonth(){
		return this.month; 
	}
	
	
	boolean isSameYear(Date anotherYear){	
		if (this.year == anotherYear.getYear()){
			return true;
		}
		return false;
	}
	
	
	boolean isSameMonth(Date anotherMonth){
		if (this.month == anotherMonth.getMonth()){
			return true;
		}
		return false;
	}

	
	boolean isSameDay(Date anotherDay){
		if (this.day == anotherDay.getDay()){
			return true;
		}
		return false;
	}
	
	
	
	boolean isSame (Date other){
		if (isSameDay(other)&& isSameMonth(other) && isSameYear(other)){
			return true;
		}
		return false;
	}
	
	
	boolean isSameDaySimplif (Date anotherDay){
		same = (this.day == anotherDay.getDay());
		return same;
	}
	
	
	boolean isSameMonthSimplif (Date anotherMonth){
		same = (this.month == anotherMonth.getMonth());
		return same;
	}
	
	
	boolean isSameYearSimplif (Date anotherYear){
		same = (this.year == anotherYear.getYear());
		return same;
	}
	
	
	boolean isSameSimplif (Date other){
		boolean same;
		same = isSameDay(other)&& isSameMonth(other) && isSameYear(other);
		return same;
	}
	
	
	 
	
	  String nameMonth(){
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
				name = "NADA";
			    break;
		}
		return name;
	}
	
	  
	  boolean dayOk(){
		  boolean ok = true;
		  switch(this.month){
			  case 1:
			  case 3:
			  case 5:
			  case 7:
			  case 8:
			  case 10:	  
			  case 12:
				  if(this.day > 31){
					  ok = false;
				  }
			  case 2:
				  if(this.day > 28){
					  ok = false;
				  }
			  case 4:
			  case 6:
			  case 9:
			  case 11:
				  if(this.day > 30){
					  ok = false;
				  }
		  } 
		return ok;  
	  }
	  
	
	  String seasonMonth(){
		  String season;
		  switch(this.month){
		  	case 4:
		  	case 5:
		  	case 6:
		  		season = "Spring";
		  		break;
		  	case 7: 
		  	case 8:
		  	case 9:
		  		season = "Summer";
		  		break;
		  	case 10:
		  	case 11:
		  	case 12:
		  		season = "Autum";
		  		break;
		  	case 1:
		  	case 2:
			case 3:
				season = "Winter";
		  		break;
		  	default: 
		  		season ="Not a season";
		  }
		  
		return season;
		  
	  }
	  	  
	  
	
	public static void main(String[] args) {

		Date date, otherDate;
		
		date = new Date (28,8,2018);
		otherDate = new Date (19,5,2018);
		System.out.println("Año: " + date.isSameYear(otherDate));
		System.out.println("Mes: " + date.isSameMonth(otherDate));
		System.out.println("Dia: " + date.isSameDay(otherDate));
		System.out.println("Fecha: " + date.isSame(otherDate));
		System.out.println();
		System.out.println("Año Simplif: " + date.isSameYearSimplif(otherDate));
		System.out.println("Mes Simplif: " + date.isSameMonthSimplif(otherDate));
		System.out.println("Dia Simplif: " + date.isSameDaySimplif(otherDate));
		System.out.println("Fecha Simplif: " + date.isSameSimplif(otherDate));
		System.out.println();
		System.out.println("Mes: " + date.nameMonth());
		System.out.println("¿Es correcto el día? " + date.dayOk());
		System.out.println("Estacion: " + date.seasonMonth());
		System.out.println();
		System.out.println("Los meses desde la fecha hasta final de año son: ");
		
	}
}
