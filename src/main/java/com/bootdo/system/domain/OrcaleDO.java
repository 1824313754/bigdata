package com.bootdo.system.domain;

import java.util.List;

public class OrcaleDO {
    private List<String> component;
    private List<String> environment;

    public OrcaleDO() {
    }

    public OrcaleDO(List<String> component, List<String> environment) {
        this.component = component;
        this.environment = environment;
    }

    public List<String> getComponent() {
        return component;
    }

    public void setComponent(List<String> component) {
        this.component = component;
    }

    public List<String> getEnvironment() {
        return environment;
    }

    public void setEnvironment(List<String> environment) {
        this.environment = environment;
    }
}
