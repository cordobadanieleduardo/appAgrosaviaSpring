package com.ganaderia.ganaderia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import static jakarta.persistence.GenerationType.*;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "t_novillo")
public class EvaluacionNovillo {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "codEvAn")
	private int codEvAn;

	@Column(name = "codEc")
	private String codEc;

	@Column(name = "evanIdentificador")
	private String evanIdentificador;

	@Column(name = "evanl1q01")
	private String evanl1q01 = "0";

	@Column(name = "evanl1q02")
	private String evanl1q02 = "0";

	@Column(name = "evanl2q01")
	private String evanl2q01 = "0";

	@Column(name = "evanl3q01")
	private String evanl3q01 = "0";

	@Column(name = "evanl3q02")
	private String evanl3q02 = "0";

	@Column(name = "evanl3q04")
	private String evanl3q04 = "0";
	
	@Column(name = "evanl3q05")
	private String evanl3q05 = "0";

	@Column(name = "evanl3q06")
	private String evanl3q06 = "0";
	
	@Column(name = "evanl3q07")
	private String evanl3q07 = "0";

	@Column(name = "evanl3q08")
	private String evanl3q08 = "0";

	@Column(name = "evanl3q09")
	private String evanl3q09 = "0";

	@Column(name = "evanl3q10")
	private String evanl3q10 = "0";

	@Column(name = "evanl3q11")
	private String evanl3q11 = "0";
	
	@Column(name = "evanl3q12")
	private String evanl3q12 = "0";

	@Column(name = "evanl3q03")
	private String evanl3q03 = "0";

	@Column(name = "evanl5q01")
	private String evanl5q01 = "0";

	@Column(name = "evanl5q02")
	private String evanl5q02 = "0";
	

	public EvaluacionNovillo() {
		super();
	}
	
	public EvaluacionNovillo(String codEc) {
		super();
		setCodEc(codEc);
	}

	public int getCodEvAn() {
		return codEvAn;
	}

	public void setCodEvAn(int codEvAn) {
		this.codEvAn = codEvAn;
	}

	public String getEvanl1q01() {
		return evanl1q01;
	}

	public void setEvanl1q01(String evanl1q01) {
		this.evanl1q01 = evanl1q01;
	}

	public String getEvanl3q01() {
		return evanl3q01;
	}

	public void setEvanl3q01(String evanl3q01) {
		this.evanl3q01 = evanl3q01;
	}

	public String getEvanl3q06() {
		return evanl3q06;
	}

	public void setEvanl3q06(String evanl3q06) {
		this.evanl3q06 = evanl3q06;
	}

	public String getEvanl3q07() {
		return evanl3q07;
	}

	public void setEvanl3q07(String evanl3q07) {
		this.evanl3q07 = evanl3q07;
	}

	public String getEvanl3q04() {
		return evanl3q04;
	}

	public void setEvanl3q04(String evanl3q04) {
		this.evanl3q04 = evanl3q04;
	}

	public String getEvanl3q02() {
		return evanl3q02;
	}

	public void setEvanl3q02(String evanl3q02) {
		this.evanl3q02 = evanl3q02;
	}

	public String getEvanl3q08() {
		return evanl3q08;
	}

	public void setEvanl3q08(String evanl3q08) {
		this.evanl3q08 = evanl3q08;
	}

	public String getEvanl3q11() {
		return evanl3q11;
	}

	public void setEvanl3q11(String evanl3q11) {
		this.evanl3q11 = evanl3q11;
	}

	public String getEvanl3q09() {
		return evanl3q09;
	}

	public void setEvanl3q09(String evanl3q09) {
		this.evanl3q09 = evanl3q09;
	}

	public String getEvanl3q10() {
		return evanl3q10;
	}

	public void setEvanl3q10(String evanl3q10) {
		this.evanl3q10 = evanl3q10;
	}

	public String getEvanl3q05() {
		return evanl3q05;
	}

	public void setEvanl3q05(String evanl3q05) {
		this.evanl3q05 = evanl3q05;
	}

	public String getEvanl1q02() {
		return evanl1q02;
	}

	public void setEvanl1q02(String evanl1q02) {
		this.evanl1q02 = evanl1q02;
	}

	public String getEvanl2q01() {
		return evanl2q01;
	}

	public void setEvanl2q01(String evanl2q01) {
		this.evanl2q01 = evanl2q01;
	}

	public String getEvanl3q03() {
		return evanl3q03;
	}

	public void setEvanl3q03(String evanl3q03) {
		this.evanl3q03 = evanl3q03;
	}

	public String getEvanl5q01() {
		return evanl5q01;
	}

	public void setEvanl5q01(String evanl5q01) {
		this.evanl5q01 = evanl5q01;
	}

	public String getCodEc() {
		return codEc;
	}

	public void setCodEc(String codEc) {
		this.codEc = codEc;
	}

	public String getEvanIdentificador() {
		return evanIdentificador;
	}

	public void setEvanIdentificador(String evanIdentificador) {
		this.evanIdentificador = evanIdentificador;
	}
	public String getEvanl3q12() {
		return evanl3q12;
	}

	public void setEvanl3q12(String evanl3q12) {
		this.evanl3q12 = evanl3q12;
	}

	

	@Override
	public String toString() {
		return "EvaluacionAnimales [codEvAn=" + codEvAn + ", codEc=" + codEc + ", evanIdentificador="
				+ evanIdentificador + ", evanl1q01=" + evanl1q01 + ", evanl3q01=" + evanl3q01 + ", evanl3q06="
				+ evanl3q06 + ", evanl3q07=" + evanl3q07 + ", evanl3q04=" + evanl3q04 + ", evanl3q02=" + evanl3q02
				+ ", evanl3q08=" + evanl3q08 + ", evanl3q11=" + evanl3q11 + ", evanl3q12=" + evanl3q12 + ", evanl3q09="
				+ evanl3q09 + ", evanl3q10=" + evanl3q10 + ", evanl3q05=" + evanl3q05 + ", evanl1q02=" + evanl1q02
				+ ", evanl2q01=" + evanl2q01 + ", evanl3q03=" + evanl3q03 + ", evanl5q01=" + evanl5q01 + "]";
	}

	public String getEvanl5q02() {
		return evanl5q02;
	}

	public void setEvanl5q02(String evanl5q02) {
		this.evanl5q02 = evanl5q02;
	}

}
