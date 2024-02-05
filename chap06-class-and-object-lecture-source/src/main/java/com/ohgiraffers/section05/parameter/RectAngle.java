package com.ohgiraffers.section05.parameter;

public class RectAngle {
    private double width;
    private double heigth;

    public RectAngle(double width, double heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public void  setHeigth(double heigth) {
        this.heigth = heigth;
    }
    public double getWidth() {
        return this.width;
    }
    public double getHeigth() {
        return this.heigth;
    }

    public void calArea() {
        double area = width * heigth;
        System.out.println("이 사각형의 넓이는 " + area + "입니다.");
    }
    public void calRound() {
        double round = (width + heigth) * 2;
        System.out.println("이 사각형의 둘레는 " + round + "입니다.");
    }
}
