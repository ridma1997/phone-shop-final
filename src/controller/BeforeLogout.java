
package controller;

public class BeforeLogout {
    
    private static BeforeLogout b;
    public static final int READY_TO_LOGOUT = 0;

    public static synchronized BeforeLogout getInstance() {
        if(b == null){
            b = new BeforeLogout();
        }
        return b;
    }
    
    public int checkSystemCurrentState(){
        return 0;
    }
}
