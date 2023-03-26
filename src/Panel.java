import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class Panel {
	
	public static void main(String[] args) {
		Conversor();
	}
	
	public static void menu(){
		String opciones [] = {"Conversor de Moneda" , "Conversor de Temperatura" , "Conversor de Distancia"};
		
		String seleccion = (String) JOptionPane.showInputDialog(null, "Selecciones una opción de conversión", "Menú", 
				JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
		
		if (seleccion == opciones[0]) {
			CambioDeMoneda();
		}
		
		if (seleccion == opciones[1]) {
			CambioTemperatura();
		}
		
		if (seleccion == opciones[2]) {
			CambioDeDistancia();
		}
	}
	
	public static void Conversor() {
		boolean Valor = true;
		while(Valor) {
			menu();
			int continuar;
			continuar = JOptionPane.showConfirmDialog(null, "¿Desea Continuar?");
			switch (continuar) {
				case 1:
					JOptionPane.showMessageDialog(null, "Programa Terminado");
					Valor = false;
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "Programa Terminado");
					Valor = false;
					break;
			}
		}
	}
	public static void CambioDeMoneda() {
		DecimalFormat df = new DecimalFormat ("#.00");
		boolean ValidarDinero;
		ValidarDinero = true;
		double dinero = 0;
		while (ValidarDinero) {
			try {
				dinero = Double.parseDouble (JOptionPane.showInputDialog(null,"Ingrese la cantidad de dinero que desea convertir:"));
				if (dinero < 0) {
					JOptionPane.showMessageDialog(null, "No se aceptan números negativos");
				}
				else {break;}

			}
			catch(NumberFormatException exception) {
				JOptionPane.showMessageDialog(null, "Valor no válido");
	
			}
		}
		String SeleccionMoneda [] = {"De Soles a Dólar" , "De Soles a Euro" , "De Soles a Libras" , "De Soles a Yen" , "De Soles a Won Coreano" , 
				"De Soles a Pesos" , "De Dólar a Soles" , "De Euro a Soles" , "De Libras a Soles" , "De Yen a Soles" , "De Won Coreano a Soles" , "De Pesos a Soles"};
		
		String Monedas [] = {"Dolares" , "Euros" , "Libras" , "Yenes" , "Won" , "Pesos" , "Soles"};
		String EleccionMoneda = (String) JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero", "Monedas", 
				JOptionPane.DEFAULT_OPTION, null, SeleccionMoneda, SeleccionMoneda[0]);
		int posicion = 0;
		int i = 0;
		while (EleccionMoneda != SeleccionMoneda[i]) {
			posicion = i+1;
			i++;
			if (i > 6) {
				posicion = 6;
				break;
			}	
		}
		
		if (i == 0) {
			dinero = dinero/3.74;
		}
		if (i == 1) {
			dinero = dinero/4.02;
		}
		if (i == 2) {
			dinero = dinero/4.55;
		}
		if (i == 3) {
			dinero = dinero/0.028;
		}
		if (i == 4) {
			dinero = dinero/0.0029;
		}
		if (i == 5) {
			dinero = dinero/0.20;
		}
		if (i == 6) {
			dinero = dinero*3.74;
		}
		if (i == 7) {
			dinero = dinero*4.02;
		}
		if (i == 8) {
			dinero = dinero*4.55;
		} 
		if (i == 9) {
			dinero = dinero*0.028;
		}
		if (i == 10) {
			dinero = dinero*0.0029;
		}
		if (i == 11) {
			dinero = dinero*0.20;
		}
		JOptionPane.showMessageDialog(null, "Usted tiene "+df.format(dinero)+" "+Monedas[posicion]);
	}

	public static void CambioTemperatura() {
		DecimalFormat df = new DecimalFormat ("#.00");
		boolean ValidarTemperatura;
		ValidarTemperatura = true;
		double Temperatura = 0;
		while (ValidarTemperatura) {
			try {
				Temperatura = Double.parseDouble (JOptionPane.showInputDialog(null,"Ingrese la temperatura que desea convertir:"));
				break;

			}
			catch(NumberFormatException exception) {
				JOptionPane.showMessageDialog(null, "Valor no válido");
	
			}
		}
		String SeleccionTemperatura [] = {"De Celsius a Kelvin" , "De Kelvin a Celsius"};
		
		String SignoTemperatura [] = {"K" , "°C"};
		String EleccionTemperatura = (String) JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero", "Monedas", 
				JOptionPane.DEFAULT_OPTION, null, SeleccionTemperatura, SeleccionTemperatura[0]);
		int posicion = 0;
		for (int i = 0 ; EleccionTemperatura != SeleccionTemperatura[i] ;i++ ) {
			posicion = i+1;	
		}
		if (posicion == 0) {
			Temperatura = Temperatura + 273.15;
		}
		if (posicion ==1) {
			Temperatura = Temperatura - 273.15;
		}
		
		JOptionPane.showMessageDialog(null, "La temperatura es "+df.format(Temperatura)+" "+SignoTemperatura[posicion]);
	}
	public static void CambioDeDistancia() {
		DecimalFormat df = new DecimalFormat ("#.00");
		boolean ValidarDistancia;
		ValidarDistancia = true;
		double distancia = 0;
		while (ValidarDistancia) {
			try {
				distancia = Double.parseDouble (JOptionPane.showInputDialog(null,"Ingrese la distancia que desea convertir:"));
				if (distancia < 0) {
					JOptionPane.showMessageDialog(null, "No se aceptan números negativos");
				}
				else {break;}

			}
			catch(NumberFormatException exception) {
				JOptionPane.showMessageDialog(null, "Valor no válido");
	
			}
		}
		String SeleccionDistancia [] = {"De Centimetros a Metros" , "De Metros a Kilometros" , "De Metros a Centimetros" , "De Metros a Kilometros" , "De Kilometros a Centimetros" , 
				"De Kilometros a Metros"};
		
		String SignoDistancia [] = {"cm" , "m" , "km"};
		String EleccionDistancia = (String) JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero", "Monedas", 
				JOptionPane.DEFAULT_OPTION, null, SeleccionDistancia, SeleccionDistancia[0]);
		int posicion = 0;
		int i = 0;
		while (EleccionDistancia != SeleccionDistancia[i]) {
			posicion = i+1;
			i++;
			if (i == 0 || i == 5) {
				posicion = 1;
			}	
			if (i == 1 || i == 3) {
				posicion = 2;
			}
			if (i == 2 || i == 4) {
				posicion = 0;
			}
		}
		
		if (i == 0) {
			distancia = distancia/100;
		}
		if (i == 1) {
			distancia = distancia/100000;
		}
		if (i == 2) {
			distancia = distancia*100;
		}
		if (i == 3) {
			distancia = distancia/1000;
		}
		if (i == 4) {
			distancia = distancia*100000;
		}
		if (i == 5) {
			distancia = distancia*1000;
		}

		JOptionPane.showMessageDialog(null, "Usted tiene "+df.format(distancia)+" "+SignoDistancia[posicion]);
	}

}
