package impl;

public class RomanNumeral {

    public String convertToRoman(int arabicNum){

        StringBuilder strb = new StringBuilder();

        int thousands = arabicNum / 1000;
        if (thousands > 0){
            String addM = new String(new char[thousands]).replace("\0","M");
            strb.append(addM);
        }
        int thousands1 = arabicNum % 1000;

        if(thousands1 >= 900){
            strb.append("CM");
            thousands1 -= 900;
        }

        int fivehundreds = thousands1 / 500;
        if (fivehundreds > 0){
            String addD = new String(new char[fivehundreds]).replace("\0","D");
            strb.append(addD);
        }
        int fivehundreds1= thousands1%500;

        if(fivehundreds1 >=400){
            strb.append("CD");
            fivehundreds1 -= 400;
        }

        int hundreds = fivehundreds1 / 100;
        if (hundreds > 0){
            String addC = new String(new char[hundreds]).replace("\0","C");
            strb.append(addC);
        }
        int hundreds1= fivehundreds1%100;

        if(hundreds1 >= 90){
            strb.append("XC");
            hundreds1 -=90;
        }

        int fiftys = hundreds1 / 50;
        if (fiftys > 0){
            String addL = new String(new char[fiftys]).replace("\0","L");
            strb.append(addL);
        }
        int fiftys1= hundreds1%50;

        if(fiftys1 >= 40){
            strb.append("XL");
            fiftys1 -=40;
        }

        int tenths = fiftys1/10;
        if (tenths > 0){
            String addX = new String(new char[tenths]).replace("\0","X");
            strb.append(addX);
        }
        int tenths1= fiftys1%10;

        if (tenths1 == 9){
            strb.append("IX");
            tenths1 = 0;
        }
        if (tenths1 == 4){
            strb.append("IV");
            tenths1= 0;
        }

        int fives = tenths1/5;
        if (fives > 0){
            String addV = new String(new char[fives]).replace("\0","V");
            strb.append(addV);
        }
        int fives1 = tenths1%5;

        int ones = fives1;
        if(ones > 0){
            String addI = new String(new char[ones]).replace("\0","I");
            strb.append(addI);
        }
        return strb.toString();
    }
}
