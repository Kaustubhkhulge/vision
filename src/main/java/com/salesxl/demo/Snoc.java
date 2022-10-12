package com.salesxl.demo;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name="currency_exchange")
public class Snoc {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int index;

	@Column(name="omc_guj_i")
	private String omc_guj_i;
	
	@Column(name="short_name")
	private String short_name;
	
	@Column(name="omc_name")
	private String omc_name;
	
	@Column(name="ne_release")
	private String ne_release;
	
	@Column(name="ne_state")
	private String ne_state;
	
	@Column(name="kpr")
	private String kpr;


	@Column(name="date")

	private String date;
	
	@Column(name="d1_00")
	private float d1_00;

	@Column(name="d1_01")
	private float d1_01;

	@Column(name="d1_02")
	private float d1_02;

	@Column(name="d1_03")
	private float d1_03;

	@Column(name="d1_04")
	private float d1_04;

	@Column(name="d1_05")
	private float d1_05;

	@Column(name="d1_06")
	private float d1_06;

	@Column(name="d1_07")
	private float d1_07;

	@Column(name="d1_08")
	private float d1_08;

	@Column(name="d1_09")
	private float d1_09;

	@Column(name="d1_10")
	private float d1_10;

	@Column(name="d1_11")
	private float d1_11;

	@Column(name="d2_00")
	private float d2_00;

	@Column(name="d2_01")
	private float d2_01;

	@Column(name="d2_02")
	private float d2_02;

	@Column(name="d2_03")
	private float d2_03;

	@Column(name="d2_04")
	private float d2_04;

	@Column(name="d2_05")
	private float d2_05;

	@Column(name="d2_06")
	private float d2_06;

	@Column(name="d2_07")
	private float d2_07;

	@Column(name="d2_08")
	private float d2_08;

	@Column(name="d2_09")
	private float d2_09;

	@Column(name="d2_10")
	private float d2_10;

	@Column(name="d2_11")
	private float d2_11;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getOmc_guj_i() {
		return omc_guj_i;
	}

	public void setOmc_guj_i(String omc_guj_i) {
		this.omc_guj_i = omc_guj_i;
	}

	public String getShort_name() {
		return short_name;
	}

	public void setShort_name(String short_name) {
		this.short_name = short_name;
	}

	public String getOmc_name() {
		return omc_name;
	}

	public void setOmc_name(String omc_name) {
		this.omc_name = omc_name;
	}

	public String getNe_release() {
		return ne_release;
	}

	public void setNe_release(String ne_release) {
		this.ne_release = ne_release;
	}

	public String getNe_state() {
		return ne_state;
	}

	public void setNe_state(String ne_state) {
		this.ne_state = ne_state;
	}

	public String getKpr() {
		return kpr;
	}

	public void setKpr(String kpr) {
		this.kpr = kpr;
	}

	public float getD1_00() {
		return d1_00;
	}

	public void setD1_00(float d1_00) {
		this.d1_00 = d1_00;
	}

	public float getD1_01() {
		return d1_01;
	}

	public void setD1_01(float d1_01) {
		this.d1_01 = d1_01;
	}

	public float getD1_02() {
		return d1_02;
	}

	public void setD1_02(float d1_02) {
		this.d1_02 = d1_02;
	}

	public float getD1_03() {
		return d1_03;
	}

	public void setD1_03(float d1_03) {
		this.d1_03 = d1_03;
	}

	public float getD1_04() {
		return d1_04;
	}

	public void setD1_04(float d1_04) {
		this.d1_04 = d1_04;
	}

	public float getD1_05() {
		return d1_05;
	}

	public void setD1_05(float d1_05) {
		this.d1_05 = d1_05;
	}

	public float getD1_06() {
		return d1_06;
	}

	public void setD1_06(float d1_06) {
		this.d1_06 = d1_06;
	}

	public float getD1_07() {
		return d1_07;
	}

	public void setD1_07(float d1_07) {
		this.d1_07 = d1_07;
	}

	public float getD1_08() {
		return d1_08;
	}

	public void setD1_08(float d1_08) {
		this.d1_08 = d1_08;
	}

	public float getD1_09() {
		return d1_09;
	}

	public void setD1_09(float d1_09) {
		this.d1_09 = d1_09;
	}

	public float getD1_10() {
		return d1_10;
	}

	public void setD1_10(float d1_10) {
		this.d1_10 = d1_10;
	}

	public float getD1_11() {
		return d1_11;
	}

	public void setD1_11(float d1_11) {
		this.d1_11 = d1_11;
	}

	public float getD2_00() {
		return d2_00;
	}

	public void setD2_00(float d2_00) {
		this.d2_00 = d2_00;
	}

	public float getD2_01() {
		return d2_01;
	}

	public void setD2_01(float d2_01) {
		this.d2_01 = d2_01;
	}

	public float getD2_02() {
		return d2_02;
	}

	public void setD2_02(float d2_02) {
		this.d2_02 = d2_02;
	}

	public float getD2_03() {
		return d2_03;
	}

	public void setD2_03(float d2_03) {
		this.d2_03 = d2_03;
	}

	public float getD2_04() {
		return d2_04;
	}

	public void setD2_04(float d2_04) {
		this.d2_04 = d2_04;
	}

	public float getD2_05() {
		return d2_05;
	}

	public void setD2_05(float d2_05) {
		this.d2_05 = d2_05;
	}

	public float getD2_06() {
		return d2_06;
	}

	public void setD2_06(float d2_06) {
		this.d2_06 = d2_06;
	}

	public float getD2_07() {
		return d2_07;
	}

	public void setD2_07(float d2_07) {
		this.d2_07 = d2_07;
	}

	public float getD2_08() {
		return d2_08;
	}

	public void setD2_08(float d2_08) {
		this.d2_08 = d2_08;
	}

	public float getD2_09() {
		return d2_09;
	}

	public void setD2_09(float d2_09) {
		this.d2_09 = d2_09;
	}

	public float getD2_10() {
		return d2_10;
	}

	public void setD2_10(float d2_10) {
		this.d2_10 = d2_10;
	}

	public float getD2_11() {
		return d2_11;
	}

	public void setD2_11(float d2_11) {
		this.d2_11 = d2_11;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}



}

