/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package misc;

import javax.xml.bind.DatatypeConverter;
import org.json.JSONException;
import org.json.JSONStringer;

/**
 *
 * @author dxtr
 */
public class Entry {
    private byte[] icon;
    private String title;
    private String username;
    private String password;
    private String url;
    private String comment;
    
    public String getTitle() { return title; }
    public byte[] getIcon() { return icon; }
    public String getIconAsB64() {
        if (icon.length < 1) return null;
        try {
            return DatatypeConverter.printBase64Binary(icon);
        } catch (java.lang.IllegalArgumentException e) {
            // TODO: Log something, perhaps?
            return null;
        }
    }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getUrl() { return url; }
    public String getComment() { return comment; }
    
    public void setTitle(String newTitle) { title = newTitle; }
    public void setIcon(byte[] newIcon) { icon = newIcon; }
    public void setIconAsB64(String newIcon) {
        if (newIcon.length() < 1) return;
        try {
            icon = DatatypeConverter.parseBase64Binary(newIcon);
        } catch (java.lang.IllegalArgumentException e) {
            // TODO: What do here? Log?
        }
    }
    public void setUsername(String newUsername) { username = newUsername; }
    public void setPassword(String newPassword) { password = newPassword; }
    public void setUrl(String newUrl) { url = newUrl; }
    public void setComment(String newComment) { comment = newComment; }
    
    public String toJSONString() {
        String jsonString;
        try {
            jsonString = new JSONStringer()
                    .object()
                        .key("title")
                        .value(title)
                    .endObject()
                    .object()
                        .key("icon")
                        .value((icon.length > 0) ? getIconAsB64() : "")
                    .endObject()
                    .object()
                        .key("username")
                        .value(username)
                    .endObject()
                    .object()
                        .key("password")
                        .value(password)
                    .endObject()
                    .object()
                        .key("url")
                        .value(url)
                    .endObject()
                    .object()
                        .key("comment")
                        .value(comment)
                    .endObject()
                    .toString();
            return jsonString;
        } catch (JSONException e) {
            // TODO: Some logging here?
        }
        return null;
    }
}
