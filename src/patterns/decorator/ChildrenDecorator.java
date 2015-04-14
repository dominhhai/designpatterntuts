package patterns.decorator;

public abstract class ChildrenDecorator implements Children {

	protected Children children;
	
	public ChildrenDecorator(Children children) {
		this.children = children;
	}
	
	@Override
	public void doTask() {
		children.doTask();
	}
}
