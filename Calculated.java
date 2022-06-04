public class Calculated extends Main {

    public static String calculated (String op1, String op2, char cal) {
       String result = "";

        switch (cal) {
            case '+':
                result = op1 + op2;
                break;
            case '-':
                int l = op2.length();
                boolean trueFalse = op1.contains(op2);
                if (trueFalse) {
                    int i = op1.indexOf(op2);
                    int e = l + i;
                    StringBuilder end = new StringBuilder(op1);
                    end.delete(i, e);
                    result = end.toString();
                    break;
                } else {
                    result = op1;
                    break;
                }

            case '*':
                int buf = Integer.parseInt(op2);
                String um = op1;
                for (int u = 1; u < buf; u++) {
                    um = um + op1;
                }
                result = um;
                break;
            case '/':
                buf = Integer.parseInt(op2);
                int r = op1.length();
                int d = r / buf;
                String del = op1.substring(0, d);
                result = del;
                break;
        }
        return result;
    }
}
