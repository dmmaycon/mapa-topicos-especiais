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

	public boolean validarData(Integer day, Integer month, Integer year) throws Exception {

		if ((month < 1 || month > 12) || (day < 1 || day > 31) || (year <= 0)) {

			throw new Exception("Valores para dia, mês ou ano são inválidos.");

		} else {

			boolean flag = false;

			if (month == 4 || month == 6 || month == 9 || month == 11) {

				if (day <= 30) {

					flag = true;

				} else
					flag = false;

			}

			if (month == 1 || month == 3 || month == 5 || month == 7 ||

					month == 8 || month == 10 || month == 12) {

				if (day <= 31) {

					flag = true;

				} else {

					flag = false;

				}

			}

			if (month == 2) {

				if (year % 4 == 0) {

					if (day <= 29) {

						flag = true;

					} else {

						flag = false;

					}

				} else {

					if (day <= 28) {

						flag = true;

					} else {

						flag = false;

					}

				}

			}

			if (flag) {

				return true;

			} else {

				return false;

			}

		}
	}
}
