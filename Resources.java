package SOLIDwithDesignPattern;

public class Resources {
    private final String resourceTitle;
    private final String resourceType;

    public Resources(String resourceTitle, String resourceType) {
        this.resourceTitle = resourceTitle;
        this.resourceType = resourceType;
    }

    public String getResourceTitle() {
        return resourceTitle;
    }

    public String getResourceType() {
        return resourceType;
    }
}