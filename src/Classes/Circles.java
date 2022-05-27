package Classes;



import javax.crypto.Cipher;



public class Circles {
    private Circle circles[];

    public Circles(int n) {
        this.circles = new Circle[n];
    }

    public void add(Circle circle){
        int i = 0;
        for (Circle temp : circles){
            if(temp == null){
                break;
            }
            else{
                i++;
            }
        }
        circles[i] = circle;
    }

    public Circle getLargestS(){
        Circle ans = circles[0];
        for (int i = 1; i < circles.length ; i++) {
            if(ans.getS() < circles[i].getS()){
                ans = circles[i];
            }
        }
        return ans;
    }
    public String toString(){
        String result = "Circles :" + System.lineSeparator();
        for (Circle circle : circles) {
            result += circle + System.lineSeparator();
        }
        return result;
    }
}
