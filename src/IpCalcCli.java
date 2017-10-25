public class IpCalcCli {

    public static void main(String[] args){

        if(args.length != 0) {
            System.out.println("IpCalc for    : " + args[0]);
            IpCalc myip = new IpCalc(args[0]);

            System.out.println("Address IP    : " + myip.getIpAddress());
            System.out.println("Netmask       : " + myip.getNetmask());
            System.out.println("Network       : " + myip.getNetwork());
            System.out.println("Address Min   : " + myip.getAddressMin());
            System.out.println("Address Max   : " + myip.getAddressMax());
            System.out.println("Broadcast     : " + myip.getBroadcast());
            System.out.println("Address Count : " + myip.getAddressCount());
        }
        else{
            System.err.println("IP Address is empty!");
        }

    }

}
