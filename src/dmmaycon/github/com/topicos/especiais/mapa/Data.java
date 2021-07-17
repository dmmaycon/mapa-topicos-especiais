package dmmaycon.github.com.topicos.especiais.mapa;

public class Data {

	private Integer day;

	private Integer month;

	private Integer year;

	private Boolean valid = false;

	public Data(Integer day, Integer month, Integer year) throws Exception {

		if (validarData(day, month, year)) {

			this.day = day;
			this.month = month;
			this.year = year;
			this.valid = true;
		}

	}

	public boolean isValid() {
		return this.valid;
	}

	public Data diaAnterior() throws Exception {
		try {
			Data diaAnterior = new Data(day - 1, month, year);
			if (diaAnterior.isValid()) {
				return diaAnterior;
			}
		} catch (Exception e) {

		}
		return diaAnteriorMudandoMesOuAno();
	}

	private Data diaAnteriorMudandoMesOuAno() throws Exception {
		if (validaMesTrintaEUm(month, day)) {
			// janeiro
			if (month == 1) {
				return new Data(31, 12, year - 1);
			}
			// marco
			if (month == 3) {
				if (validaMesFevereiro(2, 29, year)) {
					return new Data(29, 2, year);
				}
				return new Data(28, 2, year);
			}
			return new Data(30, month - 1, year);
		}

		if (validaMesTrinta(month, day)) {
			return new Data(31, month - 1, year);
		}
		return null;
	}

	private boolean validarData(Integer day, Integer month, Integer year) throws Exception {

		if ((month < 1 || month > 12) || (day < 1 || day > 31) || (year <= 0)) {
			throw new Exception("Valores para dia, mês ou ano são inválidos.");
		}

		if (validaMesTrintaEUm(month, day) || validaMesTrinta(month, day) || validaMesFevereiro(month, day, year)) {
			return true;
		}
		return false;
	}

	private boolean validaMesTrinta(Integer month, Integer day) {
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			if (day <= 30) {
				return true;
			}
		}
		return false;
	}

	private boolean validaMesTrintaEUm(Integer month, Integer day) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if (day <= 31) {
				return true;
			}
		}
		return false;
	}

	private boolean validaMesFevereiro(Integer month, Integer day, Integer year) {
		if (month == 2) {
			if (year % 4 == 0) {
				if (day <= 29) {
					return true;
				}
			} else {
				if (day <= 28) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return day + "/" + month + "/" + year;
	}
}
