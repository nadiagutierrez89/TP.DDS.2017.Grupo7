package org.grupo7.tp.dominio;

import java.util.ArrayList;
import java.util.List;;

public class Empresa {

	List<Cuenta> cuentas = new ArrayList<Cuenta>();
	String nombre;

	public Empresa(final String _nombre, final ArrayList<Cuenta> _cuentas) {
		this.nombre = _nombre;
		this.setCuentas(_cuentas);
	}

	void agregarCuenta(Cuenta unaCuenta) {
		cuentas.add(unaCuenta);
	}

	void consultarCuentas() {
		for (Cuenta cuenta : cuentas) {
			System.out.printf("El valor de esta cuenta es: %.2f\n", cuenta.getValor());
		}

	}

	// Getters y Setters
	public void setCuentas(final ArrayList<Cuenta> _cuentas) {
		for (Cuenta unaCuenta : _cuentas) {
			agregarCuenta(unaCuenta);
		}
	}
}