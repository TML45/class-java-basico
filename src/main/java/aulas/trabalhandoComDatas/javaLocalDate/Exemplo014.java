package aulas.trabalhandoComDatas.javaLocalDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Exemplo de como manipular LocalDateTime
 */
public class Exemplo014 {
	public static void main(String[] args) {

		LocalDateTime agora = LocalDateTime.now();

		System.out.println(agora);
		// 2019-07-15T00:02:16.076

		LocalDateTime futuro = agora.plusHours(1).plusDays(2).plusSeconds(12);

		System.out.println(futuro);
		// 2019-07-17T01:02:28.076

		LocalDateTime dataQualquer = LocalDateTime.of(2010, 05, 15, 10, 00, 00);

		LocalDateTime dataQualquerFuturo = dataQualquer.plusYears(4).plusMonths(6).plusHours(13);

		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String dataQualquerFormatDateTime = dataQualquer.format(format);
		String dataQualquerFuturoFormatDateTime = dataQualquerFuturo.format(format);

		System.out.println(dataQualquer);

		System.out.println(dataQualquerFuturo);

		System.out.println(dataQualquerFormatDateTime);

		System.out.println(dataQualquerFuturoFormatDateTime);

	}
}
