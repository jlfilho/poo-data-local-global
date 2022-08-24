package app;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Programa {

	public static void main(String[] args) {

		// Converter data-hora global para local
		// LocalDateTime d01 = LocalDateTime.parse("2022-08-23T01:30:06");

		Instant d01 = Instant.parse("2022-08-23T01:30:06Z");
		System.out.println("Horário Londres: "+d01);
		LocalDateTime r1 = LocalDateTime.ofInstant(d01, ZoneId.systemDefault());
		System.out.println("Horário local: "+r1);

		LocalDateTime r2 = LocalDateTime.ofInstant(d01, ZoneId.of("America/Sao_Paulo"));
		System.out.println("Horário SP: "+r2);

		/*
		 * for (String s : ZoneId.getAvailableZoneIds()) {
		 * System.out.println("America/Sao_Paulo"); }
		 */

	}

}
