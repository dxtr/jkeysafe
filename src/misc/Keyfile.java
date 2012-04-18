/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package misc;

/**
 *
 * @author dxtr
 */
public class Keyfile {
    private String path;
    private byte[] data;
    
    public String getPath() { return path; }
    public byte[] getData() { return data; }
    public void setPath(String newPath) { path = newPath; }
    public void setData(byte[] newData) { data = newData; }
    public Integer readData() {
        /* TODO: Read the key file */
        return 1;
    }
    public Integer writeData() {
        /* TODO: Write the key file to disk */
        return 1;
    }
}
