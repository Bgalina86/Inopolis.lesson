package Honeworl5;

import java.lang.constant.Constable;


public class Task4IfPasswordValidation {

    /**
     * Пример статического метода.
     * Статический метод проверяет пароль, перебирая символы
     *
     * @param password - пароль для проверки
     * @return true если встречен символ '@', false в противном случае
     */
    private static boolean checkPassword(final String password) {
        String[] Password = password.split(" ,");
        for (int i = 0; i < Password.length; i++) {

            String[] ArrayPasswordValidationNumber = {"0","1","2","3","4","5","6","7","8","9"};

            for (int idNuumber = 0; ArrayPasswordValidationNumber.length > idNuumber; idNuumber++)
                if (Password[i] == ArrayPasswordValidationNumber[idNuumber]) {
                   System.out.println("Есть");
                } else {System.out.println("Пароль должен содержать минимум 1 цифру.");
                   // String[] ArrayPasswordValidationSimbal = {"!", "@", "#", "$", "%", "^", "&", "*" };

//                    for (int idSimbal = 0; idSimbal < ArrayPasswordValidationSimbal.length(); idSimbal++) {
//                        if (Password[i] == ArrayPasswordValidationSimbal[idSimbal]) {
//                            return true;
//                        } else {
//                            System.out.println("Пароль должен содержать минимум 1 спецсимвол.");
//                        }
//                    }

                }
        }
        if (password.length() > 8){
        return true;}
        return false;
    }


//            if (password.charAt(i) == '@')
//                return true;
//            if (password.charAt(i) == '!')
//                return true;
//            if (password.charAt(i) == '#')
//                return true;


//        return false;


    public static void main(String[] args) {

        String Password = "a3df2!FF";

        if (checkPassword(Password))
            System.out.println("Yes");
        else
            System.out.println("nO");
    }
}
//
//        String Password = "asdf2!FF";
//        //Для разделения строки на отдельные символы:
//        String[] ArrayPasswordValidation = Password.split("");
//
//                for (int i = 0; i < Password.length(); i++){
// Поместили каждый элемент по очереди в str
//                    String str = ArrayPasswordValidation[i];
//
//                    // Нужно проверить данный элемент на предмет наличия цифр от 0 до 9. Если цифр нет - сообщить об ошибки. Если есть проверка на спецсимволы
//                    if ((!str.contains("2"))) {
//                System.out.println(!Password.contains("2"));
//                System.out.println("Пароль должен содержать минимум 1 цифру.");
//
//            }
//           }

        //System.out.println(ArrayPasswordValidation[4]);

//   Вручную
//Можно использовать цикл for для ручного заполнения массива:
//
//        String str = "пример";
//        String[] arr = new String[str.length()];
//
//        for (int i = 0; i < str.length(); i++) {
//            arr[i] = String.valueOf(str.charAt(i));
//        }


//        for (int i = 0; i < PasswordValidation.length; i++){
//            char Validation = PasswordValidation[i];
//            char validation = Validation;
//            switch Validation {
//               case 0:
//               default:
//                   throw new IllegalStateException(
//                       "Unexpected value: " + PasswordValidation[i]);
//           }

//
//            if ((Password.contains("2"))) {
//                System.out.println(!Password.contains("2"));
//                System.out.println("Пароль должен содержать минимум 1 цифру.");
//
//            }
//
//        }
//            if (Password.length()
//                != 8) {
//                System.out.println(Password.length());
//                System.out.println("Пароль не менее 8 символов.");
//            } else if ((!Password.contains("2"))) {
//                System.out.println(!Password.contains("2"));
//                    System.out.println("Пароль должен содержать минимум 1 цифру.");
//
//                } else
//                    if (!Password.contains("!") || !Password.contains("@") ) {
//                        System.out.println(Password);
//                        System.out.println("Пароль должен содержать минимум 1 спецсимвол");
//                    } else {
//                        System.out.println(Password);
//                        System.out.println("пароль принят");




//        switch (Password){
//
//            case !Password.contains("2"):
//                System.out.println("Пароль должен содержать минимум 1 цифру.");
//                break;
//            default:
//                throw new IllegalStateException("Unexpected value: " + Password);
//        }