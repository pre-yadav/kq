package org.kie.kogito.persistence;

@javax.enterprise.context.ApplicationScoped()
public class KogitoProcessInstancesFactoryImpl extends org.kie.kogito.persistence.KogitoProcessInstancesFactory {

    @org.eclipse.microprofile.config.inject.ConfigProperty(name = "kogito.persistence.infinispan.template")
    java.util.Optional<java.lang.String> templateName;

    @org.eclipse.microprofile.config.inject.ConfigProperty(name = "kogito.persistence.optimistic.lock")
    java.util.Optional<java.lang.Boolean> lock;

    public KogitoProcessInstancesFactoryImpl() {
        super(null);
    }

    @javax.inject.Inject()
    public KogitoProcessInstancesFactoryImpl(org.infinispan.client.hotrod.RemoteCacheManager param0) {
        super(param0);
    }

    public String template() {
        return templateName.orElse("");
    }

    public boolean lock() {
        return lock.orElse(false);
    }
}
