package Vivienda;

public class Chalet extends Vivienda{
	
	protected boolean jardin;
	
	public Chalet(String c, int n, boolean jardin) {
		super(120, c, n);
		this.jardin = jardin;
	}

	public boolean isJardin() {
		return jardin;
	}

	public void setJardin(boolean jardin) {
		this.jardin = jardin;
	}
	
	public String toString() {
		String jardins="";
		if(jardin==true) {
			jardins="Si";
		}else {
			jardins="No";
		}
		String cad = super.toString();
		cad += "\nJARDIN: " + jardins;
		return cad;
	}
}
