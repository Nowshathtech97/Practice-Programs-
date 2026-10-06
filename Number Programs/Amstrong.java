class Amstrong {
    public static void main(String[] args) {
        int number =153;
        int temp=0;
        temp = number;
        int result=0;
        while (temp != 0)
        {
            int rem = temp % 10;
            result = result + rem*rem*rem;
            temp /= 10;
        }
        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}