package org.example.interface_segregation.violation;

public class WwwPingConnection implements Connection{

    // I don't want to need socket connection. This is bad design
    @Override
    public void socket() {

    }

    @Override
    public void http() {

    }

    @Override
    public void connect() {

    }
}
