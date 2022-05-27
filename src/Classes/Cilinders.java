package Classes;


public class Cilinders {
    private Cilinder cilinders[];

    public Cilinders(int n) {
        this.cilinders = new Cilinder[n];
    }
    public void add(Cilinder cilinder){
        int i = 0;
        for (Cilinder temp : cilinders){
            if(temp == null){
                break;
            }
            else{
                i++;
            }
        }
        cilinders[i] = cilinder;
    }

    public double getAvgV(){
        double sum = 0;
        for (Cilinder cil : cilinders){
            sum += cil.getV();
        }
        return sum/ cilinders.length;
    }

    public String toString(){
        String result = "Cilinders :" + System.lineSeparator();
        for (Cilinder cilinder : cilinders) {
            result += cilinder + System.lineSeparator();
        }
        return result;
    }
}
