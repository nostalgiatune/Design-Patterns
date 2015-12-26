class SimpleContainer implements AbstractContainer {

	private Object data = null;

	public void setData(Object data) {
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	public void removeData() {
		data = null;
	}
}
