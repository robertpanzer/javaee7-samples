package org.javaee7.jca.filewatch;


import org.javaee7.jca.filewatch.adapter.FileSystemWatcher;
import org.javaee7.jca.filewatch.event.Created;
import org.javaee7.jca.filewatch.event.Deleted;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import java.io.File;

import static org.javaee7.jca.filewatch.FileEvent.Type.CREATED;
import static org.javaee7.jca.filewatch.FileEvent.Type.DELETED;

@MessageDriven(activationConfig = { @ActivationConfigProperty(propertyName = "dir", propertyValue = "/tmp") })
public class FileWatchingMDB implements FileSystemWatcher {

    @Inject
    private Event<FileEvent> fileEvent;

    @Created(".*\\.txt")
    public void onNewTextFile(final File f) {
        fileEvent.fire(new FileEvent(CREATED, f));
    }

    @Created(".*\\.pdf")
    public void onNewPdfFile(final File f) {
        fileEvent.fire(new FileEvent(CREATED, f));
    }

    @Deleted(".*\\.txt")
    public void onDeleteTextFile(final File f) {
        fileEvent.fire(new FileEvent(DELETED, f));
    }
}
