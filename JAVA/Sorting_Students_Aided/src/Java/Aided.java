package Java;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Aided extends Student {

    public Aided() {

    }
    @Override
    public java.lang.String result(java.lang.String MarkOfStudent) {
        String[] arrayString = MarkOfStudent.split("[|]");
        double credit = 0;
        double numerator = 0;

        if (true) {
            String str1 = arrayString[0];
            String str2 = arrayString[1];

            String[] arrayString1 = str1.split("[,]");
            for (String a : arrayString1) {
                String[] Str11 = a.split(" ");

                    for (int i = 0; i < (Str11.length - 1); i++) {
                        int c = Integer.parseInt(Str11[i]);
                        int cr = Integer.parseInt(Str11[i + 1]);
                        double gradeOfSubject = 0;
                        if (c <= 100 && c >=75) {
                            gradeOfSubject += cr * (9+(c-75)*(0.04));

                        }
                        if (c <= 74 && c >= 60) {
                            NumberFormat formatter = new DecimalFormat("#0.0");
                            double h = ((c-60)*(9.0/140.0) + 8);
                            double y = Double.parseDouble(formatter.format(h));

                            gradeOfSubject += cr *(y);

                        }
                        if (c <= 59 && c >= 50) {
                            double h = (7+(c-50)/10.0);
                            NumberFormat formatter = new DecimalFormat("#0.0");
                            double y = Double.parseDouble(formatter.format(h));
                            gradeOfSubject += cr * y;

                        }
                        if (c <= 49 && c >= 40) {
                            double h = (6+(c-40)/10.0);
                            NumberFormat formatter = new DecimalFormat("#0.0");
                            double y = Double.parseDouble(formatter.format(h));
                            gradeOfSubject += cr * y;

                        }

                        if (c <= 40) {
                            gradeOfSubject += 0;
                        }
                        credit += 5;
                        numerator += gradeOfSubject;
                    }




            }
            String[] arrayString2 = str2.split("[,]");

                for (int j = 0; j < (arrayString2.length - 2); j++) {
                    int l = Integer.parseInt(arrayString2[j]);
                    if (l == 0) {
                        break;
                    }
                    if (l == 1) {
                        int cr = Integer.parseInt(arrayString2[j + 2]);

                        credit += 5;

                        int c = Integer.parseInt(arrayString2[j + 1]);
                        double gradeOfSubject = 0.0;

                        if (c <= 100 && c >=75) {
                            double h = ((9+(c-75)*(0.04)));
                            gradeOfSubject += cr * h;

                        }
                        if (c <= 74 && c >= 60) {
                            gradeOfSubject += cr * (8+(c-60)*(9/140));
                        }
                        if (c <= 59 && c >= 50) {
                            gradeOfSubject += cr * (7+(c-50));
                        }
                        if (c <= 49 && c >= 40) {
                            gradeOfSubject += cr * (6+(c-40));
                        }

                        if (c <= 40) {
                            gradeOfSubject += 0;
                        }
                        numerator += gradeOfSubject;

                }
            }


            if(arrayString.length>=3) {
                String str3 = arrayString[2];
                String[] Str33 = str3.split("[,]");
                if (Str33.length == 3) {
                    for (int j = 0; j < (Str33.length - 2); j++) {
                        int l = Integer.parseInt(Str33[j]);
                        if (l == 0) {
                            break;
                        }
                        if (l == 1) {
                            int cr = Integer.parseInt(Str33[j + 2]);

                            credit += 5;


                            int c = Integer.parseInt(Str33[j + 1]);
                            double gradeOfSubject = 0.0;

                            if (c <= 100 && c >=75) {
                                gradeOfSubject += cr * (9+(c-75)*(0.04));
                            }
                            if (c <= 74 && c >= 60) {
                                gradeOfSubject += cr * (8+(c-60)*(9/140));
                            }
                            if (c <= 59 && c >= 50) {
                                gradeOfSubject += cr * (7+(c-50));
                            }
                            if (c <= 49 && c >= 40) {
                                gradeOfSubject += cr * (6+(c-40));
                            }

                            if (c <= 40) {
                                gradeOfSubject += 0;
                            }

                            numerator += gradeOfSubject;
                        }
                    }
                }
            }


        }

        double grade = numerator / (credit);
        String ai = String.format("%.2f", grade);
//            String ai = Double.toString(grade);
        return ai;
    }
}