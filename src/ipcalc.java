import org.apache.commons.net.util.SubnetUtils;
import org.apache.commons.net.util.SubnetUtils.SubnetInfo;

public class ipcalc {

    public static void main(String[] args){

        if(args.length != 0) {
            if (isAddressOk(args[0])) {
                SubnetUtils utils = new SubnetUtils(args[0]);
                SubnetInfo info = utils.getInfo();
                System.out.println("IP Address    : " + info.getAddress());
                System.out.println("Netmask       : " + info.getNetmask());
                System.out.println("Network       : " + info.getNetworkAddress());
                System.out.println("Address Min   : " + info.getLowAddress());
                System.out.println("Address Max   : " + info.getHighAddress());
                System.out.println("Broadcast     : " + info.getBroadcastAddress());
                System.out.println("Address Count : " + info.getAddressCountLong());
            } else {
                System.out.println("Bad IP Address format!");
            }
        }
        else{
            System.out.println("IP Address is empty!");
        }

    }

    public static boolean isAddressOk(String ipAddress){
        try{
            SubnetUtils utils = new SubnetUtils(ipAddress);
        }
        catch(IllegalArgumentException e){
            return false;
        }
        return true;
    }

}
