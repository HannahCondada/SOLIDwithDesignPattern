package SOLIDwithDesignPattern;

import java.util.Map;

public class ResourceChecker {
    private final Map<String, BorrowResource> resourceTypeMap;

    public ResourceChecker(Map<String, BorrowResource> resourceTypeMap) {
        this.resourceTypeMap = resourceTypeMap;
    }

    public void borrowResource(Student student, Resources resources) {
        BorrowResource borrowResource = resourceTypeMap.get(resources.getResourceType());

        if (borrowResource == null) {
            throw new IllegalArgumentException("Resource Type is Invalid: " + resources.getResourceType() + ", Please Try Again");
        }
        borrowResource.borrowingResource(student, resources);
    }
}
