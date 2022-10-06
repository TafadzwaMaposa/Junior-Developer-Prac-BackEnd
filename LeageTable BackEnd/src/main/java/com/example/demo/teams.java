package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class teams {
    @Id
    // @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;


    private int P,W,DR,L,F,A,D,PTS;
    public teams(Long id, String name, int P, int DR, int L, int F, int A, int D, int PTS, int W) {
        super();
        this.id = id;
        this.name = name;
        this.P = P;
        this.W = W;
        this.DR = DR;
        this.L = L;
        this.F = F;
        this.A = A;
        this.D = D;
        this.PTS = PTS;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getP() {
        return P;
    }

    public void setP(int p) {
        P = p;
    }

    public int getW() {
        return W;
    }

    public void setW(int w) {
        W = w;
    }

    public int getDR() {
        return DR;
    }

    public void setDR(int DR) {
        this.DR = DR;
    }

    public int getL() {
        return L;
    }

    public void setL(int l) {
        L = l;
    }

    public int getF() {
        return F;
    }

    public void setF(int f) {
        F = f;
    }

    public int getA() {
        return A;
    }

    public void setA(int a) {
        A = a;
    }

    public int getD() {
        return D;
    }

    public void setD(int d) {
        D = d;
    }

    public int getPTS() {
        return PTS;
    }

    public void setPTS(int PTS) {
        this.PTS = PTS;
    }


public teams(){

}

}

