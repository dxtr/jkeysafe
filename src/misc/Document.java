/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package misc;

import java.util.List;

/**
 *
 * @author dxtr
 */
public class Document {
    private String path;
    private char[] password;
    private Keyfile keyfile;
    private List<Group> groups;
    
    public Document(char[] newPassword) { password = newPassword; }
    public Document(Keyfile newKeyFile) { keyfile = newKeyFile; }
    public Document(char[] newPassword, Keyfile newKeyFile)
        { password = newPassword; keyfile = newKeyFile; }
    public Document(char[] newPassword, List<Group> newGroups)
        { password = newPassword; groups = newGroups; }
    public Document(Keyfile newKeyFile, List<Group> newGroups)
        { keyfile = newKeyFile; groups = newGroups; }
    public Document(char[] newPassword, Keyfile newKeyFile, List<Group> newGroups)
        { password = newPassword; keyfile = newKeyFile; groups = newGroups; }
    
    
}
