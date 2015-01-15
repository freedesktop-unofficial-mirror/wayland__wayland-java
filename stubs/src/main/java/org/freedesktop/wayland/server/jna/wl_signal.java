package org.freedesktop.wayland.server.jna;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import org.freedesktop.wayland.util.jna.wl_list;

import java.util.Arrays;
import java.util.List;

public class wl_signal extends Structure {
    public wl_list listener_list;

    public wl_signal() {
        super();
    }

    protected List<?> getFieldOrder() {
        return Arrays.asList("listener_list");
    }

    public wl_signal(final Pointer peer) {
        super(peer);
    }

    public static class ByReference extends wl_signal implements Structure.ByReference {
        public ByReference() {
        }

        public ByReference(final Pointer peer) {
            super(peer);
        }
    }

    public static class ByValue extends wl_signal implements Structure.ByValue {
        public ByValue() {
        }

        public ByValue(final Pointer peer) {
            super(peer);
        }
    }
}
