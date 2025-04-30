package com.ganaderia.ganaderia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import static jakarta.persistence.GenerationType.*;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "t_ternera")
public class EvaluacionTernera {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "codEvAn")
	private int codEvAn;
	private String codEc;

	private String el1Q01, el1Q02, el1Q03, el1Q04, el1Q05, el1Q06;
	private String el2Q01, el2Q02;

	private String el3Q01, el3Q02, el3Q03;
	private String el4Q01, el4Q02, el4Q03;
	private String el5Q01, el5Q02, el5Q03;

	public EvaluacionTernera() {
		super();
	}

	public EvaluacionTernera(String codEc) {
		super();
		setCodEc(codEc);
	}

	public EvaluacionTernera(String codEc, int codEvAn) {
		this.codEc = codEc;
		this.codEvAn = codEvAn;
	}

	public int getCodEvAn() {
		return codEvAn;
	}

	public void setCodEvAn(int codEvAn) {
		this.codEvAn = codEvAn;
	}

	public String getEl1Q01() {
		return el1Q01;
	}

	public void setEl1Q01(String el1q01) {
		el1Q01 = el1q01;
	}

	public String getEl1Q02() {
		return el1Q02;
	}

	public void setEl1Q02(String el1q02) {
		el1Q02 = el1q02;
	}

	public String getEl1Q03() {
		return el1Q03;
	}

	public void setEl1Q03(String el1q03) {
		el1Q03 = el1q03;
	}

	public String getEl1Q04() {
		return el1Q04;
	}

	public void setEl1Q04(String el1q04) {
		el1Q04 = el1q04;
	}

	public String getEl1Q05() {
		return el1Q05;
	}

	public void setEl1Q05(String el1q05) {
		el1Q05 = el1q05;
	}

	public String getEl1Q06() {
		return el1Q06;
	}

	public void setEl1Q06(String el1q06) {
		el1Q06 = el1q06;
	}

	public String getEl2Q01() {
		return el2Q01;
	}

	public void setEl2Q01(String el2q01) {
		el2Q01 = el2q01;
	}

	public String getEl2Q02() {
		return el2Q02;
	}

	public void setEl2Q02(String el2q02) {
		el2Q02 = el2q02;
	}

	public String getEl3Q01() {
		return el3Q01;
	}

	public void setEl3Q01(String el3q01) {
		el3Q01 = el3q01;
	}

	public String getEl4Q01() {
		return el4Q01;
	}

	public void setEl4Q01(String el4q01) {
		el4Q01 = el4q01;
	}

	public String getEl4Q02() {
		return el4Q02;
	}

	public void setEl4Q02(String el4q02) {
		el4Q02 = el4q02;
	}

	public String getEl4Q03() {
		return el4Q03;
	}

	public void setEl4Q03(String el4q03) {
		el4Q03 = el4q03;
	}

	public String getEl5Q01() {
		return el5Q01;
	}

	public void setEl5Q01(String el5q01) {
		el5Q01 = el5q01;
	}

	public String getCodEc() {
		return codEc;
	}

	public void setCodEc(String codEc) {
		this.codEc = codEc;
	}

	public String getEl3Q02() {
		return el3Q02;
	}

	public void setEl3Q02(String el3q02) {
		el3Q02 = el3q02;
	}

	public String getEl3Q03() {
		return el3Q03;
	}

	public void setEl3Q03(String el3q03) {
		el3Q03 = el3q03;
	}

	public String getEl5Q03() {
		return el5Q03;
	}

	public void setEl5Q03(String el5q03) {
		el5Q03 = el5q03;
	}

	public String getEl5Q02() {
		return el5Q02;
	}

	public void setEl5Q02(String el5q02) {
		el5Q02 = el5q02;
	}

//	@Column(name = "codEc")
//	private String codEc;
//
//	@Column(name = "evanIdentificador")
//	private String evanIdentificador;
//
//	@Column(name = "evanl1q01")
//	private String evanl1q01 = "0";
//
//	@Column(name = "evanl1q02")
//	private String evanl1q02 = "0";
//
//	@Column(name = "evanl2q01")
//	private String evanl2q01 = "0";
//
//	@Column(name = "evanl3q01")
//	private String evanl3q01 = "0";
//
//	@Column(name = "evanl3q02")
//	private String evanl3q02 = "0";
//
//	@Column(name = "evanl3q04")
//	private String evanl3q04 = "0";
//	
//	@Column(name = "evanl3q05")
//	private String evanl3q05 = "0";
//
//	@Column(name = "evanl3q06")
//	private String evanl3q06 = "0";
//	
//	@Column(name = "evanl3q07")
//	private String evanl3q07 = "0";
//
//	@Column(name = "evanl3q08")
//	private String evanl3q08 = "0";
//
//	@Column(name = "evanl3q09")
//	private String evanl3q09 = "0";
//
//	@Column(name = "evanl3q10")
//	private String evanl3q10 = "0";
//
//	@Column(name = "evanl3q11")
//	private String evanl3q11 = "0";
//	
//	@Column(name = "evanl3q12")
//	private String evanl3q12 = "0";
//
//	@Column(name = "evanl3q03")
//	private String evanl3q03 = "0";
//
//	@Column(name = "evanl5q01")
//	private String evanl5q01 = "0";
//
//	@Column(name = "evanl5q02")
//	private String evanl5q02 = "0";
//	
//
//	public EvaluacionTernera() {
//		super();
//	}
//	
//	public EvaluacionTernera(String codEc) {
//		super();
//		setCodEc(codEc);
//	}
//	
//	public EvaluacionTernera(String codEc, int codEvAn) {
//		this.codEc = codEc;
//		this.codEvAn = codEvAn;
//	}
//
//
//	public int getCodEvAn() {
//		return codEvAn;
//	}
//
//	public void setCodEvAn(int codEvAn) {
//		this.codEvAn = codEvAn;
//	}
//
//	public String getEvanl1q01() {
//		return evanl1q01;
//	}
//
//	public void setEvanl1q01(String evanl1q01) {
//		this.evanl1q01 = evanl1q01;
//	}
//
//	public String getEvanl3q01() {
//		return evanl3q01;
//	}
//
//	public void setEvanl3q01(String evanl3q01) {
//		this.evanl3q01 = evanl3q01;
//	}
//
//	public String getEvanl3q06() {
//		return evanl3q06;
//	}
//
//	public void setEvanl3q06(String evanl3q06) {
//		this.evanl3q06 = evanl3q06;
//	}
//
//	public String getEvanl3q07() {
//		return evanl3q07;
//	}
//
//	public void setEvanl3q07(String evanl3q07) {
//		this.evanl3q07 = evanl3q07;
//	}
//
//	public String getEvanl3q04() {
//		return evanl3q04;
//	}
//
//	public void setEvanl3q04(String evanl3q04) {
//		this.evanl3q04 = evanl3q04;
//	}
//
//	public String getEvanl3q02() {
//		return evanl3q02;
//	}
//
//	public void setEvanl3q02(String evanl3q02) {
//		this.evanl3q02 = evanl3q02;
//	}
//
//	public String getEvanl3q08() {
//		return evanl3q08;
//	}
//
//	public void setEvanl3q08(String evanl3q08) {
//		this.evanl3q08 = evanl3q08;
//	}
//
//	public String getEvanl3q11() {
//		return evanl3q11;
//	}
//
//	public void setEvanl3q11(String evanl3q11) {
//		this.evanl3q11 = evanl3q11;
//	}
//
//	public String getEvanl3q09() {
//		return evanl3q09;
//	}
//
//	public void setEvanl3q09(String evanl3q09) {
//		this.evanl3q09 = evanl3q09;
//	}
//
//	public String getEvanl3q10() {
//		return evanl3q10;
//	}
//
//	public void setEvanl3q10(String evanl3q10) {
//		this.evanl3q10 = evanl3q10;
//	}
//
//	public String getEvanl3q05() {
//		return evanl3q05;
//	}
//
//	public void setEvanl3q05(String evanl3q05) {
//		this.evanl3q05 = evanl3q05;
//	}
//
//	public String getEvanl1q02() {
//		return evanl1q02;
//	}
//
//	public void setEvanl1q02(String evanl1q02) {
//		this.evanl1q02 = evanl1q02;
//	}
//
//	public String getEvanl2q01() {
//		return evanl2q01;
//	}
//
//	public void setEvanl2q01(String evanl2q01) {
//		this.evanl2q01 = evanl2q01;
//	}
//
//	public String getEvanl3q03() {
//		return evanl3q03;
//	}
//
//	public void setEvanl3q03(String evanl3q03) {
//		this.evanl3q03 = evanl3q03;
//	}
//
//	public String getEvanl5q01() {
//		return evanl5q01;
//	}
//
//	public void setEvanl5q01(String evanl5q01) {
//		this.evanl5q01 = evanl5q01;
//	}
//
//	public String getCodEc() {
//		return codEc;
//	}
//
//	public void setCodEc(String codEc) {
//		this.codEc = codEc;
//	}
//
//	public String getEvanIdentificador() {
//		return evanIdentificador;
//	}
//
//	public void setEvanIdentificador(String evanIdentificador) {
//		this.evanIdentificador = evanIdentificador;
//	}
//	public String getEvanl3q12() {
//		return evanl3q12;
//	}
//
//	public void setEvanl3q12(String evanl3q12) {
//		this.evanl3q12 = evanl3q12;
//	}
//
//	
//
//	@Override
//	public String toString() {
//		return "EvaluacionAnimales [codEvAn=" + codEvAn + ", codEc=" + codEc + ", evanIdentificador="
//				+ evanIdentificador + ", evanl1q01=" + evanl1q01 + ", evanl3q01=" + evanl3q01 + ", evanl3q06="
//				+ evanl3q06 + ", evanl3q07=" + evanl3q07 + ", evanl3q04=" + evanl3q04 + ", evanl3q02=" + evanl3q02
//				+ ", evanl3q08=" + evanl3q08 + ", evanl3q11=" + evanl3q11 + ", evanl3q12=" + evanl3q12 + ", evanl3q09="
//				+ evanl3q09 + ", evanl3q10=" + evanl3q10 + ", evanl3q05=" + evanl3q05 + ", evanl1q02=" + evanl1q02
//				+ ", evanl2q01=" + evanl2q01 + ", evanl3q03=" + evanl3q03 + ", evanl5q01=" + evanl5q01 + "]";
//	}
//
//	public String getEvanl5q02() {
//		return evanl5q02;
//	}
//
//	public void setEvanl5q02(String evanl5q02) {
//		this.evanl5q02 = evanl5q02;
//	}

}
