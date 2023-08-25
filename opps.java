
class Oppe {

    public static void main(String[] args) {

        System.out.println("anoop");
    }

    int temp;
    String second;
    private int tempp = 9;

    Oppe(int t1, String t2) {
        temp = t1;
        second = t2;
    }

    public int getTempp() {
        return tempp;
    }

    public void setTempp(int value) {
        tempp = value;
        System.out.println("Value updated!");

    }

    public static int change(int tt) {
        System.out.println("callaed " + tt);
        // System.out.println(tempp);

        return tt;
    }

    class Takingfromparents extends Oppe {

        int df = 99;

        Takingfromparents(int t11, String t22) {
            super(t11, t22);
        }

        public void tem() {
            System.out.println(temp * df + " " + second);
        }

    }

}

class Name {

    public static void main(String[] args) {

        Oppe p1 = new Oppe(88, "vicky");
        p1.setTempp(99);
        Oppe p2 = new Oppe(66, "anoop");
        System.out.println(p1.getTempp());
        p2.setTempp(989);
        System.out.println(p2.getTempp());

        Oppe outerInstance = new Oppe(12, "dd");
        Oppe.Takingfromparents p3 = outerInstance.new Takingfromparents(12, "dd");
        p3.tem();
        // System.out.println(p3);
    }

}