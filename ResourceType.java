package SOLIDwithDesignPattern;

public class ResourceType implements BorrowResource {
    public void borrowingResource(Student student, Resources resources) {
        System.out.println(student.getName() + " borrowed " + resources.getResourceType() + " titled:\n" + resources.getResourceTitle());
    }
}