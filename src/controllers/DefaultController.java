package controllers;

public class DefaultController extends AbstractController {
	public static final String ELEMENT_TEXT_PROPERTY = "Text";
	public static final String ELEMENT_TITLE_PROPERTY = "Title";
	public static final String ELEMENT_FONT_PROPERTY = "Font";
	public static final String ELEMENT_SIZE_X_PROPERTY = "SizeX";
	public static final String ELEMENT_SIZE_Y_PROPERTY = "SizeY";
	public static final String ELEMENT_POS_X_PROPERTY = "PosX";
	public static final String ELEMENT_POS_Y_PROPERTY = "PosY";
	public static final String DOCUMENT_NAME_PROPERTY = "Name";
	
	public void changeElementTitle(String newTitle) {
		this.setModelProperty(ELEMENT_TITLE_PROPERTY, newTitle);
	}
	public void changeElementText(String newText) {
		this.setModelProperty(ELEMENT_TEXT_PROPERTY, newText);
	}
	public void changeElementFont(String newFont) {
		this.setModelProperty(ELEMENT_FONT_PROPERTY, newFont);
	}
	public void changeElementSizeX(Integer newSizeX) {
		this.setModelProperty(ELEMENT_SIZE_X_PROPERTY, newSizeX);
	}
	public void changeElementSizeY(Integer newSizeY) {
		this.setModelProperty(ELEMENT_SIZE_Y_PROPERTY, newSizeY);
	}
	public void changeElementPosX(Integer newPosX) {
		this.setModelProperty(ELEMENT_POS_X_PROPERTY, newPosX);
	}
	public void changeElementPosY(Integer newPosY) {
		this.setModelProperty(ELEMENT_POS_Y_PROPERTY, newPosY);
	}
	public void changeDocumentName(String newName) {
		this.setModelProperty(DOCUMENT_NAME_PROPERTY, newName);
	}
}
