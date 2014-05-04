package org.javaee7.jca.filewatch;

import java.io.File;

public class FileEvent {

    public static enum Type {
        CREATED,
        DELETED,
        MODIFIED;
    }

    private File file;

    private Type type;

    public FileEvent(Type type, File file) {
        this.type = type;
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    public Type getType() {
        return type;
    }
}
