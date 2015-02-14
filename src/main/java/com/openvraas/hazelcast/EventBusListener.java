package com.openvraas.hazelcast;

public interface EventBusListener {

    public static final EventBusListener NULL = new EventBusListener() {
        @Override
        public void onLog(String levelName, String message) {

        }

        @Override
        public void onEvent(Event event) {

        }
    };

    public void onEvent(final Event event);

    public void onLog(String levelName, String message);

}
