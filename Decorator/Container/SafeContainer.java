class SafeContainer extends ContainerDecorator {

	private boolean authenticated = false;

	public SafeContainer(AbstractContainer container) {
		super(container);
	}

	public boolean authenticate(String pswd) {
		if (pswd.equals("1234"))
			authenticated = true;
		return authenticated;
	}

	public void setData(Object data) {
		if (authenticated)
			super.setData(data);
	}

	public Object getData() {
		Object data = null;
		if (authenticated)
			data = super.getData();
		return data;
	}

	public void removeData() {
		if (authenticated)
			super.removeData();
	}
}
