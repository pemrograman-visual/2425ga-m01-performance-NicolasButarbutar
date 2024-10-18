// 12S24038 - NICOLAS J GRACE BUTARBUTAR
// 12S24026 - GRISELDA TABITHA NATHANIA HUTAHEAN

import java.util.*;
import java.lang.Math;

public class M01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String grade, credits;
        double value, a, aB, b, bC, c, d, e;

        a = 4.0;
        aB = 3.5;
        b = 3.0;
        bC = 2.5;
        c = 2.0;
        d = 1.0;
        e = 0.0;
        credits = input.nextLine();
        while (!credits.equals("---")) {
            int sKS;

            sKS = Integer.parseInt(credits);
            grade = input.nextLine();
            if (grade.equals("A")) {
                value = 4.0;
            } else {
                if (grade.equals("AB")) {
                    value = 3.5;
                } else {
                    if (grade.equals("B")) {
                        value = 3.0;
                    } else {
                        if (grade.equals("BC")) {
                            value = 2.5;
                        } else {
                            if (grade.equals("C")) {
                                value = 2.0;
                            } else {
                                if (grade.equals("D")) {
                                    value = 1.0;
                                } else {
                                    if (grade.equals("E")) {
                                        value = 0.0;
                                    } else {
                                        value = 0.0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            System.out.println(toFixed(sKS * value,1));
            credits = input.nextLine();
        }
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
