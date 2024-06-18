package Homework5;

public class Card {
    private String numberCard;
    private String bestBeforeDate;
    private String cvv;
    private String pinCode;

    public Card(String numberCard, String bestBeforeDate, String cvv) {
        this.numberCard = numberCard;
        this.bestBeforeDate = bestBeforeDate;
        this.cvv = cvv;

    }

    public String getPinCode() {
        return pinCode;
    }

    public String setPinCode(String pinCode) {
        this.pinCode = pinCode;
        return pinCode;
    }

    public String getNumberCard() {
        return numberCard;
    }

    public String getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public void getCard() {

        // Убираем пробелы из записи и записываем в переменную cartNumberWithoutSpaces
        String cartNumberWithoutSpaces = numberCard.replace(" ", "");

        //Вывод на экран
        System.out.println(" **** **** **** " + numberCard.substring(numberCard.length() - 4)); // шаблон "1234 5678 9012 3456";
        //System.out.println( " **** **** **** " + cartNumberWithoutSpaces.substring(cartNumberWithoutSpaces.length()-4)); // удалили пробелы
    }
//
    public void getCard(String newPinCode) {
        /**
         * ●	Опишите в классе метод, который принимает на вход пин-код. Если переданный пин-код совпал с пин-кодом карты, напечатать в консоль номер карты без маски (все цифры)
         */
         if (pinCode.equals(this.pinCode)) {
            System.out.println(this.numberCard);
        }else { System.out.println(" **** **** **** " + numberCard.substring(numberCard.length() - 4));}//getCard();
    }
}
