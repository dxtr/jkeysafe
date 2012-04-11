package models;

public class MainWindowModel extends AbstractModel {
	private Integer size_x;
	private Integer size_y;
	private Integer pos_x;
	private Integer pos_y;
	
	public void initDefault() {
		this.setSizeX(600);
		this.setSizeY(400);
		this.setPosX(400);
		this.setPosY(400);
	}
	
	public void setSizeX(Integer x) { this.size_x = x; }
	public void setSizeY(Integer y) { this.size_y = y; }
	public void setSize(Integer x, Integer y) {
		if (x > 0 && y > 0) {
			this.size_x = x;
			this.size_y = y;
		}
	}
	public void setSize(Integer[] size) {
		if (size.length >= 2 && size[0] > 0 && size[1] > 0)
		{
			this.size_x = size[0];
			this.size_y = size[1];
		}
	}
	public void setPosX(Integer x) { this.pos_x = x; }
	public void setPosY(Integer y) { this.pos_y = y; }
	public void setPos(Integer x, Integer y) {
		if (x > 0 && y > 0) {
			this.pos_x = x;
			this.pos_y = y;
		}
	}
	public void setPos(Integer[] pos) {
		if (pos.length >= 2 && pos[0] > 0 && pos[1] > 0) {
			this.pos_x = pos[0];
			this.pos_y = pos[1];
		}
	}
}
