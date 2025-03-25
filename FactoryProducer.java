class FactoryProducer {
    public static UserAbstractFactory getFactory(boolean isClient) {
        if (isClient) {
            return new ClientUserFactory();
        } else {
            return new ManagementUserFactory();
        }
    }
}
