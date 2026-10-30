package Unit1_UsingObjects.APLine;

/**
 * @author marilounanderson on 28/10/2026
 */
public class APLine {

    private int a, b, c;
    private static int count = 0;

    public APLine(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        count++;
    }

    public double getSlope(){
        return -(a/(double)b);
    }

    public boolean isOnLine(int x, int y){
        //ax+by+c=0
        int num = a * x + b * y + c;
        return num == 0;
    }

    public static int getLineCount(){
        return count;
    }
}

class textAPLine{
    static void main(){
        APLine line1 = new APLine(5, 4, -17);

        double slope1 = line1.getSlope();
        boolean onLine1 = line1.isOnLine(5, -2);
        System.out.println(slope1);
        System.out.println(onLine1);

        APLine line2 = new APLine(-25, 40, 30);

        double slope2 = line2.getSlope();
        boolean onLine2 = line2.isOnLine(5, -2);
        System.out.println(slope2);
        System.out.println(onLine2);

        APLine line3 = new APLine(2, 2, 2);
        double slope3 = line3.getSlope();
        boolean onLine3 = line3.isOnLine(2, -2);
        System.out.println(slope3);
        System.out.println(onLine3);

        int totalLines = APLine.getLineCount();
        System.out.println(totalLines);

    }

}
