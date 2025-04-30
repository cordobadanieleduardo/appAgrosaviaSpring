package com.ganaderia.ganaderia.model;
import java.io.Serializable;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import static jakarta.persistence.GenerationType.*;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "t_evco")
public class EvaluacionCorrales implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id")
	private int id;
	private String codEc;
	private String codEvAn;
	private String evanIdentificador;
	// LIBERTAD 1: LIBRES DE HAMBRE Y SED
	private String evcol1q01 = "0";
	private String evcol1q02 = "0";
	private String evcol1q03 = "0";
	private String evcol1q04 = "0";
	private String evcol1q05 = "0";
	private String evcol1q06 = "0";
	// LIBERTAD 2: LIBRES DE INCOMODIDADES Y MALESTAR
	private String evcol2q01 = "0";
	private String evcol2q02 = "0";
	private String evcol2q03 = "0";
	private String evcol2q04 = "0";
	private String evcol2q05 = "0";
	private String evcol2q06 = "0";
	private String evcol2q07 = "0";
	private String evcol2q08 = "0";
	private String evcol2q09 = "0";
	// LIBERTAD 4: LIBRES DE EXPRESAR COMPORTAMIENTOS NORMALES
	private String evcol4q01 = "0";
	private String evcol4q02 = "0";
	private String evcol5q01 = "0";
	private String evcol5q02 = "0";

	public EvaluacionCorrales() {
	}

	public EvaluacionCorrales(String codEc, String codEvAn) {
		this.codEc = codEc;
		this.codEvAn = codEvAn;
	}

	public String getEvcol1q01() {
		return evcol1q01;
	}

	public void setEvcol1q01(String evcol1q01) {
		this.evcol1q01 = evcol1q01;
	}

	public String getEvcol1q02() {
		return evcol1q02;
	}

	public void setEvcol1q02(String evcol1q02) {
		this.evcol1q02 = evcol1q02;
	}

	public String getEvcol1q03() {
		return evcol1q03;
	}

	public void setEvcol1q03(String evcol1q03) {
		this.evcol1q03 = evcol1q03;
	}

	public String getEvcol1q04() {
		return evcol1q04;
	}

	public void setEvcol1q04(String evcol1q04) {
		this.evcol1q04 = evcol1q04;
	}

	public String getEvcol1q05() {
		return evcol1q05;
	}

	public void setEvcol1q05(String evcol1q05) {
		this.evcol1q05 = evcol1q05;
	}

	public String getEvcol1q06() {
		return evcol1q06;
	}

	public void setEvcol1q06(String evcol1q06) {
		this.evcol1q06 = evcol1q06;
	}

	public String getEvcol2q01() {
		return evcol2q01;
	}

	public void setEvcol2q01(String evcol2q01) {
		this.evcol2q01 = evcol2q01;
	}

	public String getEvcol2q02() {
		return evcol2q02;
	}

	public void setEvcol2q02(String evcol2q02) {
		this.evcol2q02 = evcol2q02;
	}

	public String getEvcol2q03() {
		return evcol2q03;
	}

	public void setEvcol2q03(String evcol2q03) {
		this.evcol2q03 = evcol2q03;
	}

	public String getEvcol2q04() {
		return evcol2q04;
	}

	public void setEvcol2q04(String evcol2q04) {
		this.evcol2q04 = evcol2q04;
	}

	public String getEvcol2q05() {
		return evcol2q05;
	}

	public void setEvcol2q05(String evcol2q05) {
		this.evcol2q05 = evcol2q05;
	}

	public String getEvcol2q06() {
		return evcol2q06;
	}

	public void setEvcol2q06(String evcol2q06) {
		this.evcol2q06 = evcol2q06;
	}

	public String getEvcol2q07() {
		return evcol2q07;
	}

	public void setEvcol2q07(String evcol2q07) {
		this.evcol2q07 = evcol2q07;
	}

	public String getEvcol2q08() {
		return evcol2q08;
	}

	public void setEvcol2q08(String evcol2q08) {
		this.evcol2q08 = evcol2q08;
	}

	public String getEvcol2q09() {
		return evcol2q09;
	}

	public void setEvcol2q09(String evcol2q09) {
		this.evcol2q09 = evcol2q09;
	}

	public String getEvcol4q01() {
		return evcol4q01;
	}

	public void setEvcol4q01(String evcol4q01) {
		this.evcol4q01 = evcol4q01;
	}

	public String getEvcol4q02() {
		return evcol4q02;
	}

	public void setEvcol4q02(String evcol4q02) {
		this.evcol4q02 = evcol4q02;
	}

	public String getEvcol5q01() {
		return evcol5q01;
	}

	public void setEvcol5q01(String evcol5q01) {
		this.evcol5q01 = evcol5q01;
	}

	public String getEvcol5q02() {
		return evcol5q02;
	}

	public void setEvcol5q02(String evcol5q02) {
		this.evcol5q02 = evcol5q02;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEvanIdentificador() {
		return evanIdentificador;
	}

	public void setEvanIdentificador(String evanIdentificador) {
		this.evanIdentificador = evanIdentificador;
	}

	public String getCodEc() {
		return codEc;
	}

	public void setCodEc(String codEc) {
		this.codEc = codEc;
	}

	public String getCodEvAn() {
		return codEvAn;
	}

	public void setCodEvAn(String codEvAn) {
		this.codEvAn = codEvAn;
	}

	@Override
	public String toString() {
		return "EvaluacionCorrales [id=" + id + ", codEc=" + codEc + ", codEvAn=" + codEvAn + ", evanIdentificador="
				+ evanIdentificador + ", evcol1q01=" + evcol1q01 + ", evcol1q02=" + evcol1q02 + ", evcol1q03="
				+ evcol1q03 + ", evcol1q04=" + evcol1q04 + ", evcol1q05=" + evcol1q05 + ", evcol1q06=" + evcol1q06
				+ ", evcol2q01=" + evcol2q01 + ", evcol2q02=" + evcol2q02 + ", evcol2q03=" + evcol2q03 + ", evcol2q04="
				+ evcol2q04 + ", evcol2q05=" + evcol2q05 + ", evcol2q06=" + evcol2q06 + ", evcol2q07=" + evcol2q07
				+ ", evcol2q08=" + evcol2q08 + ", evcol2q09=" + evcol2q09 + ", evcol4q01=" + evcol4q01 + ", evcol4q02="
				+ evcol4q02 + ", evcol5q01=" + evcol5q01 + ", evcol5q02=" + evcol5q02 + "]";
	}

}
