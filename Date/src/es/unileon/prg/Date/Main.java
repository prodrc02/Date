package es.unileon.prg.Date;

public class Main {

	public static void main(String[] args) {
Date date, otherDate;
		
		date = new Date (17,4,2016);
		otherDate = new Date (19,5,2018);
		date.toString();
		otherDate.toString();
		System.out.println();
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
		System.out.println("Mes: " + date.nameMonth(date.getMonth()));
		System.out.println("¿Es correcto el día? " + date.dayOk());
		System.out.println("Estacion: " + date.seasonMonth());
		System.out.println();
		System.out.println("Los meses que restan desde la fecha hasta final de año son: ");
		date.restMonths();
		System.out.println();
		System.out.println("Dias hasta el primer dia del año desde la fecha: ");
		date.daysSiceFirstDayOfYear();
		System.out.println();
		System.out.println("Las fechas que restan desde la fecha hasta final de mes son: ");
		date.printDatesUntilEndMonth();
		System.out.println();
		System.out.println("Los meses que tienen los mismos dias que el de la fecha son: ");
		date.printMonthsWithSameDays();
		System.out.println();
		System.out.println("El dia de la semana es: " + date.nameDay());
		System.out.println();
		System.out.println("Intentos hasta encontrar una fecha usando while: " );
		date.randomDate1();
		System.out.println("Intentos hasta encontrar una fecha usando do-while: " );
		date.randomDate2();

	}

}
