package org.termi.plugin.hello;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.termi.community.service.common.PluginBaseService;


@Component
public class HelloInit implements PluginBaseService {
    private static final Log LOG = LogFactory.getLog(HelloInit.class);

    @Override
    public void beforeInstall() {
        LOG.info("Before install hello plugin.");
    }

    @Override
    public void beforeEnable() {
        LOG.info("Before enable hello plugin.");
    }

    @Override
    public void beforeDisable() {
        LOG.info("Before disable hello plugin.");
    }

    @Override
    public void beforeRemove() {
        LOG.info("Before remove hello plugin.");
    }
}