package com.bootdo.system.domain;

import java.util.List;

public class JiqunVersionDO {
    private List<String> version;
    private List<String> cmversion;

    public JiqunVersionDO() {
    }

    public JiqunVersionDO(List<String> version, List<String> cmversion) {
        this.version = version;
        this.cmversion = cmversion;
    }

    public List<String> getVersion() {
        return version;
    }

    public void setVersion(List<String> version) {
        this.version = version;
    }

    public List<String> getCmversion() {
        return cmversion;
    }

    public void setCmversion(List<String> cmversion) {
        this.cmversion = cmversion;
    }
}
