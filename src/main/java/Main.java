import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String name = "Nikita ";
        String surname = "Ksenofontov";

        String result1 = (name + surname).intern();

        String result2 = "Nikita Ksenofontov";


        //        String name2 = new String("Nikita");


        // == по умолчанию сравнивает ссылки на объекты
        System.out.println(result1 == result2);




        StringBuilder stringBuilder = new StringBuilder(); //не потоко безопасный
//        StringBuffer stringBuffer = new StringBuffer();  потокобезопасный

//        String surname = "Ksenofontov    qwewqeqweqwe";
//        System.out.println(surname.toCharArray());

        System.out.println(new Date());
        System.out.println(stringBuilder.toString());
//        String result = "";
        for (int i = 0; i < 1000000; i++) {
            //stringBuilder.append("Bar");
//            result += "Bar";
        }
        System.out.println(stringBuilder);
        System.out.println(new Date());



         StringBuilder result = stringBuilder
                .deleteCharAt(0);
//                .insert(3,"Vakulenchuka")
//                .substring(5);

//                .append("Vakelenchuka ")
//                .append("City Drnipro")
//                .reverse();

//        System.out.println(result);



//        for (int i = 0; i < surname.length(); i++) {
//            char c = surname.toCharArray()[i];
//        }




        /*    char c = '\u2660';
    String c2 = "\u2665\u2660";
    String someText = "\u041e\u0434\u0440\u0438\u043d";
    System.out.println(c2);*/

        //        int[] numbers = {2, 11, 3, 0, 13,};
//        int[] numbersSecond = {10, 24, 3, 0, 50,};
//
//        int[] result = new int[numbers.length];
//
//        int counter = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] == numbersSecond[i]) {
//                int temp = numbersSecond[i];
//                result[counter] = temp;
//                counter++;
//            }
//        }
//
//        int[] resultSecond = new int[counter];
//        for (int i = 0; i < resultSecond.length; i++) {
//            resultSecond[i] = result[i];
//            System.out.println(resultSecond[i]);
//        }
//    }
    }
}





