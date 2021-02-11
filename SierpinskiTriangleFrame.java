package Recursion;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SierpinskiTriangleFrame extends JFrame {
	static int r = 0, gr = 0, b = 255;

//	private JTextField jtfOrder = new JTextField("0", 5); // Order
	private JButton plus = new JButton ("+");
	private JButton minus = new JButton ("-");
	private SierpinskiTrianglePanel trianglePanel = new SierpinskiTrianglePanel(); // To display the pattern


	public SierpinskiTriangleFrame() {
// Panel to hold label, text field, and a button
		JPanel panel = new JPanel();
		panel.add(new JLabel("Enter an order: "));
		panel.add(plus);
		plus.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(minus);
		minus.setHorizontalAlignment(SwingConstants.RIGHT);
// Add a Sierpinski triangle panel to the frame
		add(trianglePanel);
		add(panel, BorderLayout.SOUTH);
// Register a listener
		plus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				trianglePanel.setOrder(trianglePanel.getOrder() + 1);
			}
		});
		minus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(trianglePanel.getOrder() > 0) {
					trianglePanel.setOrder(trianglePanel.getOrder() - 1);
				}
			}
		});

	}

}
