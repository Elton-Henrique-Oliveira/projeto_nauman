package projeto_nauman;

public class Data {
	
    private String mes;
    private int dia;
    private int ano;
    
	public Data(String mes, int dia, int ano) {
		this.mes = mes;
		this.dia = dia;
		this.ano = ano;
	}
	
	public Data(int pDia, int ano) {
		this.dia = pDia;
		this.ano = ano;
	}
	
	public Data() {
		super();
	}
	
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
}
