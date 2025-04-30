package com.ganaderia.ganaderia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import static jakarta.persistence.GenerationType.*;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="t_el3")
public class EvaluacionLibertad3 {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private int codEl3;
	
	private String el3Q03, el3Q05, el3Q07, el3Q09;
	private int el3Q01, el3Q02, el3Q04, el3Q06, el3Q08, el3Q10, el3Q11;
	
	private String codEc, codFinca;
	
	private int identificacion;

	public EvaluacionLibertad3() {
		super();
	}
	
	public EvaluacionLibertad3(String codEc, String codFinca) {
		super();
		this.codEc = codEc;
		this.codFinca = codFinca;
	}

	public EvaluacionLibertad3(int codEl3, String el3q03, String el3q05, String el3q07, String el3q09, int el3q01,
			int el3q02, int el3q04, int el3q06, int el3q08, int el3q10, int el3q11) {
		super();
		this.codEl3 = codEl3;
		el3Q03 = el3q03;
		el3Q05 = el3q05;
		el3Q07 = el3q07;
		el3Q09 = el3q09;
		el3Q01 = el3q01;
		el3Q02 = el3q02;
		el3Q04 = el3q04;
		el3Q06 = el3q06;
		el3Q08 = el3q08;
		el3Q10 = el3q10;
		el3Q11 = el3q11;
	}

	public int getCodEl3() {
		return codEl3;
	}

	public void setCodEl3(int codEl3) {
		this.codEl3 = codEl3;
	}

	public String getEl3Q03() {
		return el3Q03;
	}

	public void setEl3Q03(String el3q03) {
		el3Q03 = el3q03;
	}

	public String getEl3Q05() {
		return el3Q05;
	}

	public void setEl3Q05(String el3q05) {
		el3Q05 = el3q05;
	}

	public String getEl3Q07() {
		return el3Q07;
	}

	public void setEl3Q07(String el3q07) {
		el3Q07 = el3q07;
	}

	public String getEl3Q09() {
		return el3Q09;
	}

	public void setEl3Q09(String el3q09) {
		el3Q09 = el3q09;
	}

	public int getEl3Q01() {
		return el3Q01;
	}

	public void setEl3Q01(int el3q01) {
		el3Q01 = el3q01;
	}

	public int getEl3Q02() {
		return el3Q02;
	}

	public void setEl3Q02(int el3q02) {
		el3Q02 = el3q02;
	}

	public int getEl3Q04() {
		return el3Q04;
	}

	public void setEl3Q04(int el3q04) {
		el3Q04 = el3q04;
	}

	public int getEl3Q06() {
		return el3Q06;
	}

	public void setEl3Q06(int el3q06) {
		el3Q06 = el3q06;
	}

	public int getEl3Q08() {
		return el3Q08;
	}

	public void setEl3Q08(int el3q08) {
		el3Q08 = el3q08;
	}

	public int getEl3Q10() {
		return el3Q10;
	}

	public void setEl3Q10(int el3q10) {
		el3Q10 = el3q10;
	}

	public int getEl3Q11() {
		return el3Q11;
	}

	public void setEl3Q11(int el3q11) {
		el3Q11 = el3q11;
	}
	
	public String getCodEc() {
		return codEc;
	}

	public void setCodEc(String codEc) {
		this.codEc = codEc;
	}
	
	

	public String getCodFinca() {
		return codFinca;
	}

	public void setCodFinca(String codFinca) {
		this.codFinca = codFinca;
	}

	@Override
	public String toString() {
		return "EvaluacionLibertad3 [codEl3=" + codEl3 + ", el3Q03=" + el3Q03 + ", el3Q05=" + el3Q05 + ", el3Q07="
				+ el3Q07 + ", el3Q09=" + el3Q09 + ", el3Q01=" + el3Q01 + ", el3Q02=" + el3Q02 + ", el3Q04=" + el3Q04
				+ ", el3Q06=" + el3Q06 + ", el3Q08=" + el3Q08 + ", el3Q10=" + el3Q10 + ", el3Q11=" + el3Q11 + ", codEc="
				+ codEc + ", codFinca=" + codFinca + ", identificacion=" + identificacion + "]";
	}

	public int getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}

}
