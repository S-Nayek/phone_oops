public class LandLine implements Phone{

    private  String myPhoneNumber;
    private  boolean isRinging;
    private boolean isPowerOn;

    public LandLine(String myPhoneNumber) {
        this.myPhoneNumber = myPhoneNumber;
        this.isRinging=false;
        this.isPowerOn=true;
    }

    public String getMyPhoneNumber() {
        return myPhoneNumber;
    }

    public void setMyPhoneNumber(String myPhoneNumber) {
        this.myPhoneNumber = myPhoneNumber;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    @Override
    public void powerOn() {
        this.isPowerOn =true;
    }

    @Override
    public void callNumber(String phoneNo) {

        if(isPowerOn==true){
            System.out.println("you are dialing no: "+phoneNo);
        }
        else{
            System.out.println("Your landLine is off");
        }
        return;
    }

    @Override
    public void receiveCall(String phoneNo) {

        if(isPowerOn && myPhoneNumber.equals(phoneNo)){
            this.isRinging =true;
            System.out.println("hey! "+phoneNo+" is calling");
        }
        else{
            System.out.println("call not received");
        }
        return;
    }

    @Override
    public boolean answerCall() {
        if(isRinging==true){
            System.out.println("you are answered");
            this.isRinging = false;
            return true;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
