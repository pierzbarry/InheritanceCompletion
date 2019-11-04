package com.company;

import java.util.Objects;

public final class Software extends Product {

    private String programmer;
    private String platform; // linux, mac, or pc
    private String os;

    @Override
    public boolean equals(Object o) {
        // self check
        if (this == o)
            return true;
        // null check
        if (o == null)
            return false;
        // type check and cast
        if (getClass() != o.getClass())
            return false;
        Software software = (Software) o;
        // field comparison
        return Objects.equals(programmer, software.programmer)
                && Objects.equals(platform, software.platform) && Objects.equals(os, software.os);
    }

    public String getProgrammer() {
        return programmer;
    }

    public void setProgrammer(String programmer) {
        this.programmer = programmer;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public int hashCode() {
        return Objects.hash(programmer, platform, os);
    }
}
