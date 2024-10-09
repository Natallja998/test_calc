import java.util.Scanner;

public class Main {
    private Exception www;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        try {
            System.out.println(calc(str));
        } catch (Exception e) {
            throw  new RuntimeException(e);
        }
    }

    public static String calc(String str) throws Exception {
        String[] strs = str.split(" ");


        if (strs.length != 3) {
            throw new Exception("строка не является математической операцией");
        }
        int operand1 = Integer.parseInt(strs[0]);
        int operand2 = Integer.parseInt(strs[2]);
        String operator = strs[1];

        switch (operator){
            case "+":
                return (operand1 + operand2) + "";
            case "-":
                if (operand1 < 0 || operand2 < 0) {
                    return (operand1 + operand2) + "";
                }
                return (operand1 - operand2) + "";
            case "*":
                return (operand1 * operand2) + "";
            case "/":
                if (operand2 == 0) {
                    throw new Exception("на ноль делить нельзя");
                }
                return (operand1 / operand2) + "";
            default:
                throw new Exception("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }


    }

}



