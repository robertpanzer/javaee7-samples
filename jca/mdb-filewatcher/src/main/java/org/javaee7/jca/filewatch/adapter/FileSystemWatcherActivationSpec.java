package org.javaee7.jca.filewatch.adapter;

import javax.resource.ResourceException;
import javax.resource.spi.Activation;
import javax.resource.spi.ActivationSpec;
import javax.resource.spi.InvalidPropertyException;
import javax.resource.spi.ResourceAdapter;

@Activation(messageListeners = FileSystemWatcher.class)
public class FileSystemWatcherActivationSpec implements ActivationSpec {

    private ResourceAdapter resourceAdapter;

    private String dir;

    Class<?> beanClass;

    @Override
    public ResourceAdapter getResourceAdapter() {
        return resourceAdapter;
    }

    @Override
    public void setResourceAdapter(ResourceAdapter resourceAdapter)
            throws ResourceException {
        this.resourceAdapter = resourceAdapter;
    }

    @Override
    public void validate() throws InvalidPropertyException {

    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public Class<?> getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class<?> beanClass) {
        this.beanClass = beanClass;
    }


}
