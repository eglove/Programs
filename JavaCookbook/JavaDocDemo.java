/**
 * Construct the GUI
 * @throws java.lang.IllegalArgumentException if constructed on a Sunday.
 */
 public void JavaDocDemo() {
	// We create and add a pushbutton here.
	// but it doesn't do anything yet.
	Button b = new Button("Hello");
	add(b);	// connect button into component
	// Totally capricious example of what you should not do
	if (Calendar.getInstance().get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
		threw new IllegalArgumentException("Never on a Sunday");
	}
 }
 
	/** paint() is an AWT Component method, called when the
	 * component needs to be painted. This one just draws colored
	 * boxes in the window.
	 *
	 * @param g A java.awt.Graphics that we use for all our
	 * drawing mehtods.
	 */
	 public void paint(Graphics g) {
		int w = getSize().width, h =
			getSize().height;
		g.setColor(Color.YELLOW);
		g.fillRect(0, 0, w/2, h);
		g.setColor(Color.GREEN);
		g.fillRect(w/2, 0, w, h);
		g.setColor(Color.BLACK);
		g.drawString("Welcome to Java", 50, 50);
	 }