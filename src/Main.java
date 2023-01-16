public class Main {
    public static void main(String[] args) {
        LandLine l1 =new LandLine("865");
        LandLine l2 =new LandLine("123");

        l1.callNumber("123");
        l2.receiveCall("122");
        System.out.println(l2.answerCall());
    }
}