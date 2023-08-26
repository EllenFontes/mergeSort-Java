package com.merge.mergesort.model;

public class Dados {

    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private String list;

    int[] lista;

    public Dados(int[] lista) {

    }
    public Dados(){}

    public int[] getLista() {
        return lista;
    }

    public void setLista(int[] lista) {
        this.lista = lista;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum4(int num4) {
        this.num4 = num4;
    }

    public int getNum4() {
        return num4;
    }

    public void setList(String list) {
        this.list = list;
    }

    public String getList() {
        return list;
    }
}

