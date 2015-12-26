class ContainerTest {
	public static void main(String[] args) {

		AbstractContainer container = new SimpleContainer();
		AbstractContainer safeContainer = new SafeContainer(container); // Decorator implements container's interface

		Object data = new Object();
		container.setData(data);
		System.out.println(container.getData());
		container.removeData();
		System.out.println(container.getData());

		((SafeContainer) safeContainer).authenticate("1234");
		safeContainer.setData(data);
		System.out.println(safeContainer.getData());
		System.out.println(container.getData());
	}
}
