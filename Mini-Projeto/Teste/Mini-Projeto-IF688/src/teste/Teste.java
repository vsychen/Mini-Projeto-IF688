package teste;
public class Teste {
	public static void main(String[] args) {
		double[] operadores = { 20, 5, 4 };

		System.out.println(soma(operadores));
		System.out.println(subtracao(operadores));
		System.out.println(multiplicacao(operadores));
		System.out.println(divisao(operadores));
		System.out.println(show(pow(operadores, 3)));
		System.out.println(binomial(2, 3, 3));
	}

	public static String show(double[] lista) {
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < lista.length; i++) {
			sb.append(lista[i]);

			if (i < lista.length - 1) {
				sb.append(" ");
			}
		}

		return sb.toString();
	}

	public static double soma(double[] lista) {
		double retorno = 0;

		for (int i = 0; i < lista.length; i++) {
			retorno += lista[i];
		}

		return retorno;
	}

	public static double subtracao(double[] lista) {
		double retorno = lista[0];

		for (int i = 1; i < lista.length; i++) {
			retorno -= lista[i];
		}

		return retorno;
	}

	public static double multiplicacao(double[] lista) {
		double retorno = 1;

		for (int i = 0; i < lista.length; i++) {
			retorno *= lista[i];
		}

		return retorno;
	}

	public static double divisao(double[] lista) {
		double retorno = lista[0];

		for (int i = 1; i < lista.length; i++) {
			retorno /= lista[i];
		}

		return retorno;
	}

	public static double pow(double base, int exp) {
		double[] aux = { base, base };

		if (exp == 0) {
			aux[0] = 1;
		}

		for (int i = 1; i < exp; i++) {
			aux[0] = multiplicacao(aux);
		}

		return aux[0];
	}

	public static double[] pow(double[] lista, int exp) {
		double[] retorno = new double[lista.length];

		for (int i = 0; i < lista.length; i++) {
			retorno[i] = pow(lista[i], exp);
		}

		return retorno;
	}

	public static double factorial(int x) {
		double[] aux = new double[x];

		for (int i = 0; i < x; i++) {
			aux[i] = i + 1;
		}

		return multiplicacao(aux);
	}

	public static double combination(int n, int k) {
		double facN = factorial(n);
		double facK = factorial(k);
		double facNK = factorial(n - k);

		double[] aux = { facK, facNK };

		aux[1] = multiplicacao(aux);
		aux[0] = facN;

		return divisao(aux);
	}

	public static double binomial(double x, double y, int n) {
		double retorno = 0;

		for (int k = 0; k <= n; k++) {
			double combo = combination(n, k);

			int NK = n - k;
			double[] aux = { x };
			double fst = pow(aux, NK)[0];

			aux[0] = y;
			double snd = pow(aux, k)[0];

			double[] aux2 = { combo, fst, snd };
			retorno += multiplicacao(aux2);
		}

		return retorno;
	}
}