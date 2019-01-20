package server;

import org.json.simple.JSONObject;

public class HostInfo {

    private String hostname;
    private int port;

    /**
     * @param hostname
     * @param port
     * @param secret
     */
    HostInfo(String hostname, int port) {
        setPort(port);
        setHostname(hostname);
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * @return host information in JSON format
     */
    @SuppressWarnings("unchecked")
    public JSONObject toJson() {
        JSONObject host_json = new JSONObject();
        host_json.put("hostname", getHostname());
        host_json.put("port", getPort() + "");
        return host_json;
    }

    /**
     * @param host
     * @return
     */
    public boolean equals(HostInfo host) {
        if (this.hostname.equals(host.getHostname()) && (this.getPort() == host.getPort())) {
            return true;
        } else {
            return false;
        }

    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return hostname + ":" + port;
    }
}