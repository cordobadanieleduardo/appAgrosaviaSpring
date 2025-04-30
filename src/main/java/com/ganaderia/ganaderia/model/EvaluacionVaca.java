package com.ganaderia.ganaderia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import static jakarta.persistence.GenerationType.*;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "t_vaca")
public class EvaluacionVaca {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private int codElvaca;

	private String el1Q01, el1Q02, el1Q03, el1Q04, el1Q05, el1Q06;
	private String el2Q01, el2Q02, el2Q03, el2Q04, el2Q05, el2Q06,
					el2Q07, el2Q08, el2Q09, el2Q10, el2Q11, el2Q12,
					el2Q13, el2Q14, el2Q15, el2Q16, el2Q17;

	private String el3Q01;
	private String el4Q01, el4Q02 ,el4Q03,el4Q04;
	private String el5Q01;

	private String codEc;

	public EvaluacionVaca() {
		super();
	}

	public EvaluacionVaca(String codEc) {
		super();
		this.codEc = codEc;
	}
	
	public EvaluacionVaca(String codEc, int codElvaca) {
		super();
		this.codEc = codEc;
		this.codElvaca = codElvaca;
	}

//	public EvaluacionLibertadVaca(String codEc, String codFinca) {
//		super();
//		this.codEc = codEc;
//		this.codFinca = codFinca;
//	}

	public int getCodElvaca() {
		return codElvaca;
	}

	public void setCodElvaca(int codElvaca) {
		this.codElvaca = codElvaca;
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

	public String getEl2Q04() {
		return el2Q04;
	}

	public void setEl2Q04(String el2q04) {
		el2Q04 = el2q04;
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

	public String getEl2Q05() {
		return el2Q05;
	}

	public void setEl2Q05(String el2q05) {
		el2Q05 = el2q05;
	}

	public String getEl2Q06() {
		return el2Q06;
	}

	public void setEl2Q06(String el2q06) {
		el2Q06 = el2q06;
	}

	public String getEl2Q07() {
		return el2Q07;
	}

	public void setEl2Q07(String el2q07) {
		el2Q07 = el2q07;
	}

	public String getEl2Q08() {
		return el2Q08;
	}

	public void setEl2Q08(String el2q08) {
		el2Q08 = el2q08;
	}

	public String getEl2Q09() {
		return el2Q09;
	}

	public void setEl2Q09(String el2q09) {
		el2Q09 = el2q09;
	}

	public String getEl2Q10() {
		return el2Q10;
	}

	public void setEl2Q10(String el2q10) {
		el2Q10 = el2q10;
	}

	public String getEl2Q11() {
		return el2Q11;
	}

	public void setEl2Q11(String el2q11) {
		el2Q11 = el2q11;
	}

	public String getEl2Q12() {
		return el2Q12;
	}

	public void setEl2Q12(String el2q12) {
		el2Q12 = el2q12;
	}

	public String getEl2Q13() {
		return el2Q13;
	}

	public void setEl2Q13(String el2q13) {
		el2Q13 = el2q13;
	}

	public String getEl2Q14() {
		return el2Q14;
	}

	public void setEl2Q14(String el2q14) {
		el2Q14 = el2q14;
	}

	public String getEl2Q15() {
		return el2Q15;
	}

	public void setEl2Q15(String el2q15) {
		el2Q15 = el2q15;
	}

	public String getEl2Q16() {
		return el2Q16;
	}

	public void setEl2Q16(String el2q16) {
		el2Q16 = el2q16;
	}

	public String getEl2Q17() {
		return el2Q17;
	}

	public void setEl2Q17(String el2q17) {
		el2Q17 = el2q17;
	}

	public String getEl2Q03() {
		return el2Q03;
	}

	public void setEl2Q03(String el2q03) {
		el2Q03 = el2q03;
	}

	public String getEl4Q03() {
		return el4Q03;
	}

	public void setEl4Q03(String el4q03) {
		el4Q03 = el4q03;
	}

	public String getEl4Q04() {
		return el4Q04;
	}

	public void setEl4Q04(String el4q04) {
		el4Q04 = el4q04;
	}
}
