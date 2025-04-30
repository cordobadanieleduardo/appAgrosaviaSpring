package com.ganaderia.ganaderia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import static jakarta.persistence.GenerationType.*;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "t_horro")
public class EvaluacionHorro {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "codEvAn")
	private int codEvAn;

	@Column(name = "codEc")
	private String codEc;

	private String el1Q01, el1Q02, el1Q03, el1Q04, el1Q05, el1Q06;
	private String el2Q01, el2Q02, el2Q03 , el2Q04 ;

	private String el3Q01, el3Q02, el3Q03;
	private String el4Q01, el4Q02, el4Q03;
	private String el5Q01, el5Q02, el5Q03;

	public EvaluacionHorro() {
		super();
	}
	
	public EvaluacionHorro(String codEc) {
		super();
		setCodEc(codEc);
	}

	public int getCodEvAn() {
		return codEvAn;
	}

	public void setCodEvAn(int codEvAn) {
		this.codEvAn = codEvAn;
	}

	public String getCodEc() {
		return codEc;
	}

	public void setCodEc(String codEc) {
		this.codEc = codEc;
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

	public String getEl5Q02() {
		return el5Q02;
	}

	public void setEl5Q02(String el5q02) {
		el5Q02 = el5q02;
	}

	public String getEl5Q03() {
		return el5Q03;
	}

	public void setEl5Q03(String el5q03) {
		el5Q03 = el5q03;
	}

	public String getEl2Q03() {
		return el2Q03;
	}

	public void setEl2Q03(String el2q03) {
		el2Q03 = el2q03;
	}

	public String getEl2Q04() {
		return el2Q04;
	}

	public void setEl2Q04(String el2q04) {
		el2Q04 = el2q04;
	}

	
}
