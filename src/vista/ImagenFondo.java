package vista;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ImagenFondo extends JPanel{
	
	private Icon icono;
	
	public ImagenFondo() {
		icono=new ImageIcon(getClass().getResource("/imagenes/serpiente.jpg"));
	}
	
	@Override
	public void paintComponent(Graphics g) {
		Dimension dimension=this.getSize();
		ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/serpiente.jpg"));
        g.drawImage(icon.getImage(), 0, 0, dimension.width, dimension.height, null);
        setOpaque(false);
        super.paintChildren(g);
	}
	

}
