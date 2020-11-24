package com.tw;

public class MultiplicationTable {


    //    P: in 5 minute
    //    D:
    //    C: the requirement need %n which was CRLF, took some time to check this
    //    A: be more familiar with Java string operations and different formatting methods
    public String create(int startNumber, int endNumber) {
        if (isStartNumLeqEndNum(startNumber, endNumber) && isInValidRange(startNumber, endNumber)) {
            StringBuilder table = new StringBuilder();
            for (int i = startNumber; i <= endNumber; i++) {
                table.append(this.generateMultiplicationTableLine(startNumber, endNumber, i));
                if (i < endNumber)
                    table.append(String.format("%n"));
            }
            return table.toString();
        } else
            return null;
    }

    //    P: in one minute
    //    D:
    //    C: N/A
    //    A: N/A
    public Boolean isStartNumLeqEndNum(int startNumber, int endNumber) {
        return startNumber <= endNumber;
    }

    //    P: in one minute
    //    D:
    //    C: N/A
    //    A: N/A
    public Boolean isInValidRange(int startNumber, int endNumber) {
        return startNumber <= 1000 && startNumber >= 1 && endNumber <= 1000 && endNumber >= 1;
    }

    //    P: in 5 minute with child function created
    //    D:
    //    C: missed an necessary input when drafting the chart, the line would need the start number as it doesn't always start from 1?
    //    A: should have dry-run the input -> output logic in mind when drafting the graph
    public String generateMultiplicationTableLine(int startNumber, int endNumber, int commonMultiplier) {
        StringBuilder line = new StringBuilder();
        for (int i = startNumber; i <= commonMultiplier; i++) {
            line.append(generateMultiplicationTableItem(i, commonMultiplier));
            if (i < commonMultiplier)
                line.append("  ");
        }
        return line.toString();
    }


    //    P: in 2 minute
    //    D:
    //    C: N/A
    //    A: N/A
    public String generateMultiplicationTableItem(int multiplicand, int multiplier) {
        return String.format("%d*%d=%d", multiplicand, multiplier, multiplicand * multiplier);
    }

}
