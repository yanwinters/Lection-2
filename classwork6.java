package Lection2;

public class classwork6 {

    static class NetworkInfo {
        private String ssid;
        private String passwd;
        private String securityType;

        public void ShowParamaters() {
            System.out.println("Текуший SSID: " + this.ssid);
            System.out.println("Текуший пароль: " + this.passwd);
            System.out.println("Тип безовасности: " + this.securityType);
        }
    }

    public static void main(String[] args) {
        NetworkInfo networkInfo = thisdata("TP-LINK_1F74", "********", "WPA2");
        networkInfo.ShowParamaters();
    }

    public static NetworkInfo thisdata(String ssid, String passwd, String securityType) {
        NetworkInfo data = new NetworkInfo();
        data.ssid = ssid;
        data.passwd = passwd;
        data.securityType = securityType;

        return data;
    }
}
