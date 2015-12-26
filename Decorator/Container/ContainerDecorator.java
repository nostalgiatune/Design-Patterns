abstract class ContainerDecorator implements AbstractContainer {

	protected AbstractContainer container;

	public ContainerDecorator(AbstractContainer container) {
		this.container = container;
	}

	public void setData(Object data) {
		container.setData(data);
	}

	public Object getData() {
		return container.getData();
	}

	public void removeData() {
		container.removeData();
	}
}
