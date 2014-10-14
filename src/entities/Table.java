package entities;

import com.teamReseveOn.reserveon.R;
 

public class Table {
	
	private static final int OCUPADA = 0;
	private static final int LIVRE = 1;
	
    private int id;
    private int qtdLugares;
    private String descLugar;
    private int qrCode;
    private int status;

	public Table(int mesaId, int qtdLugaresMesa, String descLugarMesa, int mesaQrCode) {
		this.id = mesaId;
		this.qtdLugares = qtdLugaresMesa;
		this.descLugar = descLugarMesa;
		this.qrCode = mesaQrCode;
	}
	
	public int getId() {
		return this.id;
	}
	
	public int getQtdLugare() {
		return this.qtdLugares;
	}
	
	public String getDescLugar() {
		return this.descLugar;
	}
	
	public int getQrCode() {
		return this.qrCode;
	}
	
	public int getImage() {
		
		switch (this.status) {
		case 0:
			return R.drawable.free_icon;
		case 1:
			return R.drawable.occupied_icon;
		}
		
		return R.drawable.undefined_icon;
	}
	


}
