package dev.stella.javaloops;

import java.util.ArrayList;

public class Iterator {

    private int selectedNumber;
    private ArrayList<String> stringArray = new ArrayList<>(); 

    public Iterator(int selectedNumber) {
        this.selectedNumber = selectedNumber;
    }

    public String printMultTable(int number) {
        for (int i = 0; i < 10; i++) {
            stringArray.add(String.valueOf(number) + " x " + (String.valueOf(i + 1)) + " = " + (String.valueOf(number * (i + 1))));
        }
        StringBuffer sb = new StringBuffer();
      
        for (String s : stringArray) {
            sb.append(s);
            sb.append("\n");
        }
        sb.deleteCharAt(sb.length() - 1);
        String str = sb.toString();
        return str;
    }

    public int getSelectedNumber() {
        return selectedNumber;
    }

    public void setSelectedNumber(int selectedNumber) {
        this.selectedNumber = selectedNumber;
    }

}