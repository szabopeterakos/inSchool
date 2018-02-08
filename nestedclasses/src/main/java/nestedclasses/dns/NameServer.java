package nestedclasses.dns;

import java.util.ArrayList;
import java.util.List;

public class NameServer {

    List<DnsEntry> dnsEntries = new ArrayList<>();

    public void addEntry(String hostName, String hostIp) {
        for (DnsEntry c : dnsEntries) {
            if (c.getHostName().equals(hostName) || c.getHostIp().equals(hostIp)) {
                throw new IllegalArgumentException("Already exists");
            }
        }
        dnsEntries.add(new NameServer.DnsEntry(hostName, hostIp));
    }

    public void removeEntryByName(String hostName) {
        for (DnsEntry dnsEntry : dnsEntries) {
            if (dnsEntry.getHostName().equals(hostName)) {
                dnsEntries.remove(dnsEntry);
                break;
            }
        }
    }

    public void removeEntryByIp(String ipAddress) {
        for (DnsEntry dnsEntry : dnsEntries) {
            if (dnsEntry.getHostIp().equals(ipAddress)) {
                dnsEntries.remove(dnsEntry);
                break;
            }
        }
    }

    public String getIpByName(String hostName) {
        for (DnsEntry dnsEntry : dnsEntries) {
            if (dnsEntry.getHostName().equals(hostName)) {
                return dnsEntry.getHostIp();
            }
        }
        throw new IllegalArgumentException("Element not found");
    }

    public String getNameByIp(String ipAddress) {
        for (DnsEntry dnsEntry : dnsEntries) {
            if (dnsEntry.getHostIp().equals(ipAddress)) {
                return dnsEntry.getHostName();
            }
        }
        throw new IllegalArgumentException("Element not found");
    }


    private static class DnsEntry {
        private String hostName;
        private String hostIp;

        public DnsEntry(String hostName, String hostIp) {
            this.hostName = hostName;
            this.hostIp = hostIp;
        }

        public String getHostName() {
            return hostName;
        }

        public String getHostIp() {
            return hostIp;
        }

    }

}
