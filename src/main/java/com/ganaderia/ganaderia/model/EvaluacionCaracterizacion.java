package com.ganaderia.ganaderia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import static jakarta.persistence.GenerationType.*;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "t_ec")
public class EvaluacionCaracterizacion {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private int codEc;
	private String codFinca;

//	@ManyToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
//	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "identificacion")
//	private Usuario usuario;
	
	private String identificacion;

	private String ecHora, ecFecha, ecObservador, ecEncuestado, ecMuestra, ecFinca;
	private String ecQ01, ecQ02, ecQ03, ecQ04, ecQ06,
			ecQ07, ecQ08, ecQ09, ecQ10, ecQ11, ecQ12, ecQ13, ecQ14, ecQ15,
			ecQ16, ecQ17, ecQ18, ecQ19, ecQ22, ecQ23, ecQ24, ecQ25, ecQ26, 
			ecQ27, ecQ28, ecQ29, ecQ30, ecQ05, ecQ20,
			ecQ21, ecQ31, ecQ32;

	public EvaluacionCaracterizacion() {
		super();
	}

	public int getCodEc() {
		return codEc;
	}

	public void setCodEc(int codEc) {
		this.codEc = codEc;
	}

	public String getEcHora() {
		return ecHora;
	}

	public void setEcHora(String ecHora) {
		this.ecHora = ecHora;
	}

	public String getEcFecha() {
		return ecFecha;
	}

	public void setEcFecha(String ecFecha) {
		this.ecFecha = ecFecha;
	}

	public String getEcObservador() {
		return ecObservador;
	}

	public void setEcObservador(String ecObservador) {
		this.ecObservador = ecObservador;
	}

	public String getEcEncuestado() {
		return ecEncuestado;
	}

	public void setEcEncuestado(String ecEncuestado) {
		this.ecEncuestado = ecEncuestado;
	}

	public String getEcMuestra() {
		return ecMuestra;
	}

	public void setEcMuestra(String ecMuestra) {
		this.ecMuestra = ecMuestra;
	}

	public String getEcFinca() {
		return ecFinca;
	}

	public void setEcFinca(String ecFinca) {
		this.ecFinca = ecFinca;
	}

	public String getEcQ01() {
		return ecQ01;
	}

	public void setEcQ01(String ecQ01) {
		this.ecQ01 = ecQ01;
	}

	public String getEcQ02() {
		return ecQ02;
	}

	public void setEcQ02(String ecQ02) {
		this.ecQ02 = ecQ02;
	}

	public String getEcQ03() {
		return ecQ03;
	}

	public void setEcQ03(String ecQ03) {
		this.ecQ03 = ecQ03;
	}

	public String getEcQ04() {
		return ecQ04;
	}

	public void setEcQ04(String ecQ04) {
		this.ecQ04 = ecQ04;
	}

	public String getEcQ06() {
		return ecQ06;
	}

	public void setEcQ06(String ecQ06) {
		this.ecQ06 = ecQ06;
	}

	public String getEcQ07() {
		return ecQ07;
	}

	public void setEcQ07(String ecQ07) {
		this.ecQ07 = ecQ07;
	}

	public String getEcQ08() {
		return ecQ08;
	}

	public void setEcQ08(String ecQ08) {
		this.ecQ08 = ecQ08;
	}

	public String getEcQ09() {
		return ecQ09;
	}

	public void setEcQ09(String ecQ09) {
		this.ecQ09 = ecQ09;
	}

	public String getEcQ10() {
		return ecQ10;
	}

	public void setEcQ10(String ecQ10) {
		this.ecQ10 = ecQ10;
	}

	public String getEcQ11() {
		return ecQ11;
	}

	public void setEcQ11(String ecQ11) {
		this.ecQ11 = ecQ11;
	}

	public String getEcQ12() {
		return ecQ12;
	}

	public void setEcQ12(String ecQ12) {
		this.ecQ12 = ecQ12;
	}

	public String getEcQ13() {
		return ecQ13;
	}

	public void setEcQ13(String ecQ13) {
		this.ecQ13 = ecQ13;
	}

	public String getEcQ14() {
		return ecQ14;
	}

	public void setEcQ14(String ecQ14) {
		this.ecQ14 = ecQ14;
	}

	public String getEcQ15() {
		return ecQ15;
	}

	public void setEcQ15(String ecQ15) {
		this.ecQ15 = ecQ15;
	}

	public String getEcQ16() {
		return ecQ16;
	}

	public void setEcQ16(String ecQ16) {
		this.ecQ16 = ecQ16;
	}

	public String getEcQ17() {
		return ecQ17;
	}

	public void setEcQ17(String ecQ17) {
		this.ecQ17 = ecQ17;
	}

	public String getEcQ18() {
		return ecQ18;
	}

	public void setEcQ18(String ecQ18) {
		this.ecQ18 = ecQ18;
	}

	public String getEcQ19() {
		return ecQ19;
	}

	public void setEcQ19(String ecQ19) {
		this.ecQ19 = ecQ19;
	}

	public String getEcQ22() {
		return ecQ22;
	}

	public void setEcQ22(String ecQ22) {
		this.ecQ22 = ecQ22;
	}

	public String getEcQ23() {
		return ecQ23;
	}

	public void setEcQ23(String ecQ23) {
		this.ecQ23 = ecQ23;
	}

	public String getEcQ24() {
		return ecQ24;
	}

	public void setEcQ24(String ecQ24) {
		this.ecQ24 = ecQ24;
	}

	public String getEcQ25() {
		return ecQ25;
	}

	public void setEcQ25(String ecQ25) {
		this.ecQ25 = ecQ25;
	}

	public String getEcQ26() {
		return ecQ26;
	}

	public void setEcQ26(String ecQ26) {
		this.ecQ26 = ecQ26;
	}

	public String getEcQ27() {
		return ecQ27;
	}

	public void setEcQ27(String ecQ27) {
		this.ecQ27 = ecQ27;
	}

	public String getEcQ28() {
		return ecQ28;
	}

	public void setEcQ28(String ecQ28) {
		this.ecQ28 = ecQ28;
	}

	public String getEcQ29() {
		return ecQ29;
	}

	public void setEcQ29(String ecQ29) {
		this.ecQ29 = ecQ29;
	}

	public String getEcQ30() {
		return ecQ30;
	}

	public void setEcQ30(String ecQ30) {
		this.ecQ30 = ecQ30;
	}

	public String getEcQ05() {
		return ecQ05;
	}

	public void setEcQ05(String ecQ05) {
		this.ecQ05 = ecQ05;
	}

	public String getEcQ20() {
		return ecQ20;
	}

	public void setEcQ20(String ecQ20) {
		this.ecQ20 = ecQ20;
	}

	public String getEcQ21() {
		return ecQ21;
	}

	public void setEcQ21(String ecQ21) {
		this.ecQ21 = ecQ21;
	}

	public String getEcQ31() {
		return ecQ31;
	}

	public void setEcQ31(String ecQ31) {
		this.ecQ31 = ecQ31;
	}

	public String getCodFinca() {
		return codFinca;
	}

	public void setCodFinca(String codFinca) {
		this.codFinca = codFinca;
	}
	
	@Override
	public String toString() {
		return "EvaluacionCaracterizacion [codEc=" + codEc + ", codFinca=" + codFinca + ", identificacion="
				+ identificacion + ", ecHora=" + ecHora + ", ecFecha=" + ecFecha + ", ecObservador=" + ecObservador
				+ ", ecEncuestado=" + ecEncuestado + ", ecMuestra=" + ecMuestra + ", ecFinca=" + ecFinca + ", ecQ01="
				+ ecQ01 + ", ecQ02=" + ecQ02 + ", ecQ03=" + ecQ03 + ", ecQ04=" + ecQ04 + ", ecQ06=" + ecQ06 + ", ecQ07="
				+ ecQ07 + ", ecQ08=" + ecQ08 + ", ecQ09=" + ecQ09 + ", ecQ10=" + ecQ10 + ", ecQ11=" + ecQ11 + ", ecQ12="
				+ ecQ12 + ", ecQ13=" + ecQ13 + ", ecQ14=" + ecQ14 + ", ecQ15=" + ecQ15 + ", ecQ16=" + ecQ16 + ", ecQ17="
				+ ecQ17 + ", ecQ18=" + ecQ18 + ", ecQ19=" + ecQ19 + ", ecQ22=" + ecQ22 + ", ecQ23=" + ecQ23 + ", ecQ24="
				+ ecQ24 + ", ecQ25=" + ecQ25 + ", ecQ26=" + ecQ26 + ", ecQ27=" + ecQ27 + ", ecQ28=" + ecQ28 + ", ecQ29="
				+ ecQ29 + ", ecQ30=" + ecQ30 + ", ecQ05=" + ecQ05 + ", ecQ20=" + ecQ20 + ", ecQ21=" + ecQ21 + ", ecQ31="
				+ ecQ31 + ", ecQ32=" + ecQ32 + "]";
	}

	public String getEcQ32() {
		return ecQ32;
	}

	public void setEcQ32(String ecQ32) {
		this.ecQ32 = ecQ32;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

}
