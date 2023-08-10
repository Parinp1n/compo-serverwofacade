
package serverwofacade;

public class ServerWFacade {
     public static void main(String[] args) {
        MyFacade obj = MyFacade.getMyFacadeObject();
        obj.startScheduleServer();
        obj.stopScheduleServer();
    }
}
