public class Урок3 {
    public void changMethod(){
        double value = 35.233337;
        String result = String.format("%.3f", value);
        System.out.println(result);

        int i= 130;
        String str = Integer.toString(i);
        System.out.println(str);

        String str1 = "21.23475967";
                double dbl = Double.parseDouble(str1);
        System.out.println(dbl);
        double sum = dbl + 10000;
        System.out.println(sum);

        String nstr = Double.toString(sum);
        System.out.println(nstr + 700);

        String subStr=str1.substring(0, 5);
        System.out.println(subStr);

        String cut = subStr.replace("21","s");
        System.out.println(cut);
    }
}