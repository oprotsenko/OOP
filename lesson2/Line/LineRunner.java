package com.oprotsen.JavaOOP.lesson2.Line;

public class LineRunner {
    public static void main(String[] args) {
        Lines lines = new Lines();
        Line ab = new Line(new Point(1,1), new Point(5, 3));
        lines.addLine(ab);
        System.out.println(ab.findLongOfLine());

        Line bc = new Line(new Point(1,2), new Point(5, 7));
        lines.addLine(bc);
        System.out.println(bc.findLongOfLine());

        Line cd = new Line(new Point(4,2), new Point(5, 3));
        lines.addLine(cd);
        System.out.println(cd.findLongOfLine());

        System.out.println(lines.toString());

        lines.sumOfLongs();
        lines.longestLine();
    }
}
